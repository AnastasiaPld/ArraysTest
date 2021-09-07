import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

//                    "/Users/adzhevizova/Desktop/Test.txt"));
public class Read {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        TuesdayTask sorting = new TuesdayTask();


        reader = new BufferedReader(new FileReader(
                "/Users/adzhevizova/Desktop/Test.txt"));
        ArrayList<String[]> listOfLines = new ArrayList<>();

        String line = reader.readLine();

        while (line != null) {
            String[] newLine = line.split(",");
            listOfLines.add(newLine);
            line = reader.readLine();
        }

        for (String[] element : listOfLines) {
            int index = 0;
            int[] arrayInt = new int[element.length];
            for (String value : element) {
                int digit = Integer.parseInt(value);
                arrayInt[index] = digit;
                index++;
            }

            sorting.sortArray(arrayInt);
//            System.out.println(Arrays.toString(sorting.printOnlyDuplicate(arrayInt)));
//            sorting.printSortedArray(arrayInt);
//            sorting.printDuplicate(arrayInt);
//            sorting.printNewArray(arrayInt);



        }


        reader.close();
    }

}







