package ByteStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        System.out.println("Type here: ");
        try (BufferedReader buff = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + buff.readLine());
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------");

        try (BufferedReader buff = new BufferedReader(new FileReader("D:\\20cs062\\Java_Codes\\File Handling\\src\\ByteStream\\note.txt"))) {
            while (buff.ready()) {
                System.out.println(buff.readLine());
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
