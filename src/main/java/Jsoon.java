import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Jsoon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String line;

        reader = new BufferedReader(new FileReader(
                "/Users/adzhevizova/Desktop/Json.txt"));

        while ((line = reader.readLine()) != null) {

            System.out.println(line);
        }

    }
}

