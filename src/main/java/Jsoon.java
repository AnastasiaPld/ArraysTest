import net.minidev.json.parser.JSONParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Jsoon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String line;

        reader = new BufferedReader(new FileReader(
                "/Users/adzhevizova/Desktop/Json.txt"));
        ArrayList<String[]> listOfLines = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            String[] newLine = line.split("");
            listOfLines.add(newLine);

        }
        for (String[] element : listOfLines) {
            for (String value : element) {
                System.out.println(value);
            }

        }

    }
}


