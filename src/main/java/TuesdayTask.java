import java.util.Arrays;

public class TuesdayTask {


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
        }System.out.println(Arrays.toString(temp));

    }

    public void printNewArray(int[] newArray) {
        int len = newArray.length;
        int temp[] = new int[newArray.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (newArray[i] == newArray[i + 1]) {
                temp[j++] = newArray[i];
            }
        }
        System.out.println(Arrays.toString(temp));

    }

    public class sort {
        public static void main(String[] args) {
            TuesdayTask sortD = new TuesdayTask();

        }


    }

}

