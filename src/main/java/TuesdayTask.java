import java.util.Arrays;

public class TuesdayTask {
    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int test[] = {12, 15, 1, 9, 45};
        int test1[] = {12, 45, 49, 85, 78};
        int duplicates[] = {7, 8, 9, 0, 5, 7, 8, 0};
        int duplicate1[]={7,7,5,9,6,3,6,8,1,9,8};
//        sortArray(arr);
//        printSortedArray(arr);
//        sortArray(test);
//        printSortedArray(test);
//        sortArray(test1);
//        printSortedArray(test1);
//        sortArray(duplicates);
//        printDuplicate(duplicates);
        sortArray(duplicate1);
        printSortedArray(duplicate1);
        printDuplicate(duplicate1);
        printNewArray(duplicate1);
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printDuplicate(int[] arrWithDuplicates) {
        int len = arrWithDuplicates.length;
        int temp[] = new int[arrWithDuplicates.length];
        int j = 0;
        for (int i = 0; i < len-1; i++) {
            if (arrWithDuplicates[i] != arrWithDuplicates[i + 1]) {
                temp[j++] = arrWithDuplicates[i];
            }
        }
        for (int k = 0; k < j; k++) {

        }
        System.out.println(Arrays.toString(temp));
    }
    public static void printNewArray(int[] newArray) {
        int len = newArray.length;
        int temp[] = new int[newArray.length];
        int j = 0;
        for (int i = 0; i < len-1; i++) {
            if (newArray[i] == newArray[i + 1]) {
                temp[j++] = newArray[i];
            }
        }
        for (int k = 0; k < j; k++) {

        }
        System.out.println(Arrays.toString(temp));
    }

}

