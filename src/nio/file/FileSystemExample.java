package nio.file;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        for(FileStore store : fileSystem.getFileStores()) {
            System.out.println("드라이버명 : " + store.name());
            System.out.println("파일시스템 : " + store.type());
            System.out.println("전체 공간 : " + store.getTotalSpace() + "바이트");
            System.out.println("사용 공간 : "
                    + (store.getTotalSpace() - store.getUnallocatedSpace())  + "바이트");
            System.out.println("남은 공간 : " + (store.getUsableSpace())+ "바이트");
        }

        System.out.println("파일 구분자 : " + fileSystem.getSeparator() + "\n");
        for(Path path : fileSystem.getRootDirectories()) {
            System.out.println(path.toString());
        }
    }
}
