package nio.file;

import java.nio.file.*;

public class DirectoryExample {
    public static void main(String[] args) throws Exception{
        Path path1 = Paths.get("C:/Temp/dir/subdir");
        Path path2 = Paths.get("C:/Temp/file.txt");

        if(Files.notExists(path1)) { Files.createDirectories(path1); }
        if(Files.notExists(path2)) { Files.createFile(path2); }

        Path path3 = Paths.get("C:/Temp");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
        for(Path path : directoryStream) {
            if(Files.isDirectory(path)) {
                System.out.println("[디렉토리] " + path.getFileName()); // 디렉토리 path
            } else {
                System.out.println("[파일] " + path.getFileName() + "(크기:" + Files.size(path) + ")"); // 파일 정보
            }
        }
    }
}
