package nio.watchService;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.nio.file.*;
import java.util.List;

public class WatchServiceExample extends Application {
    TextArea textArea;
    class WatchServiceThread extends Thread {
        @Override
        public void run() {
            try {
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path directory = Paths.get("C:/Temp");
                directory.register(watchService
                        , StandardWatchEventKinds.ENTRY_CREATE  // 생성 이벤트 등록
                        , StandardWatchEventKinds.ENTRY_DELETE  // 삭제 이벤트 등록
                        , StandardWatchEventKinds.ENTRY_MODIFY); // 수정 이벤트 등록
                while(true) {
                    WatchKey watchKey = watchService.take();    // 블로킹(watchkey가 큐에 들어올때 까지)
                    List<WatchEvent<?>> list = watchKey.pollEvents();   // watchEvent 목록얻기
                    for(WatchEvent watchEvent : list) {
                        WatchEvent.Kind kind = watchEvent.kind();   // 이벤트 종류 얻기
                        Path path = (Path)watchEvent.context();     // 감지된 Path 얻기
                        if(kind == StandardWatchEventKinds.ENTRY_CREATE) {  // 생성 이벤트
                            Platform.runLater(() -> textArea.appendText("파일 생성됨 -> " + path.getFileName() + "\n"));
                        } else if(kind == StandardWatchEventKinds.ENTRY_DELETE) {  // 삭제 이벤트
                            Platform.runLater(() -> textArea.appendText("파일 삭제됨 -> " + path.getFileName() + "\n"));
                        } else if(kind == StandardWatchEventKinds.ENTRY_MODIFY) {  // 수정 이벤트
                            Platform.runLater(() -> textArea.appendText("파일 수정됨 -> " + path.getFileName() + "\n"));
                        }
                        boolean vaild = watchKey.reset();
                        if(!vaild) { break; }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPrefSize(500, 300);

        textArea = new TextArea();
        textArea.setEditable(false);
        root.setCenter(textArea);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("WatchServiceExample");
        primaryStage.show();

        WatchServiceThread wst = new WatchServiceThread();
        wst.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}