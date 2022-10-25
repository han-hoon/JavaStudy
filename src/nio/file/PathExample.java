package nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/sec02/exam01/PathExample");
        System.out.println("[파일명] " + path.getFileName());
        System.out.println("[상위 디렉토리명] " + path.getParent().getFileName());
        System.out.println("[중첩 경로수] " + path.getNameCount());
        System.out.println();

        path.forEach(i -> { System.out.println(i); });
        System.out.println();

        Iterator<Path> iterator = path.iterator();
        while(iterator.hasNext()) {
            Path temp = iterator.next();
            System.out.println(temp.getFileName());
        }
    }
}
