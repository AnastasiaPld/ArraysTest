import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TuesdayTask {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 48};


        duplicateMethod2(array);
    }


    public void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));
    }

    public void printDuplicate(int[] arrWithDuplicates) {
        int len = arrWithDuplicates.length;
        int temp[] = new int[arrWithDuplicates.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arrWithDuplicates[i] != arrWithDuplicates[i + 1]) {
                temp[j++] = arrWithDuplicates[i];
            }
        }
        System.out.println(Arrays.toString(temp));

    }

    public void printNewArray(int[] newArray) {
        int len = newArray.length;
        int temp[] = new int[newArray.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (newArray[i] == newArray[i + 1]) {
                temp[j++] = newArray[i];
            }
            System.out.println(Arrays.toString(temp));
        }


    }


    public static void printNewDuplicates(int[] arrWithDuplicates) {
        int len = arrWithDuplicates.length;
        int temp[] = new int[arrWithDuplicates.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arrWithDuplicates[i] != arrWithDuplicates[i + 1]) {
                temp[j++] = arrWithDuplicates[i];

            }

            ArrayList<int[]> elements = new ArrayList<>();
            elements.add(temp);

//            int newLength =temp[j++];
//            if (arrWithDuplicates.length < newLength) {
//                System.out.println(Arrays.toString(arrWithDuplicates));
//            } else {
//                int[] truncated = new int[newLength];
//                System.arraycopy(arrWithDuplicates, 0, truncated, 0, newLength);
//                System.out.println(Arrays.toString(truncated));
//            }

            System.out.println(elements);
        }

    }
    public static void duplicateMethod2(int[] arr) {
        Set<Integer> numbersDuplication = new HashSet<>();
        for (int arrays : arr) {
            if (numbersDuplication.add(arrays) == false) {
                System.out.print(arrays + " ");


            }
        }
    }
    }















