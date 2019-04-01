package File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class testDemo {
    public static void main(String[] args) {
        Path start = FileSystems.getDefault().getPath("D:\\JAVA资源\\新建文件夹 (2)");
        try {
            Files.walk(start)
                    .filter(path -> path.toFile().isFile())
                    .filter(path -> path.toString().endsWith(".pdf"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
