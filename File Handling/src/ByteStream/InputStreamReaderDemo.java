package ByteStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {

        try (InputStreamReader in = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters: ");
            int letters = in.read();

            while (in.ready()) {
                System.out.println((char)letters);
                letters = in.read();
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}