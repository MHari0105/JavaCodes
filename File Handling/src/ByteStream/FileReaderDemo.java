package ByteStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader file = new FileReader("D:\\20cs062\\Java_Codes\\File Handling\\src\\ByteStream\\note.txt")) {
            int letters = file.read();
            while (file.ready()) {
                System.out.println((char)letters);
                letters = file.read();
            }
            System.out.println();
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
