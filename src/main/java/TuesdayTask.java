import java.util.Arrays;

public class TuesdayTask {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 48};
//        System.out.println(Arrays.toString(printOnlyDuplicate(array)));
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


    public int[] printOnlyDuplicate(int[] arrWithDuplicates) {
        int dup = 0;
        for (int i = 0; i < arrWithDuplicates.length; i++) {
            for (int j = i + 1; j < arrWithDuplicates.length - dup; j++) {
                if (arrWithDuplicates[i] == (arrWithDuplicates[j])) {
                    while (j != arrWithDuplicates.length - dup - 1
                            && arrWithDuplicates[arrWithDuplicates.length - dup - 1] == (arrWithDuplicates[j])) {
                        dup++;
                    }
                    int tmp = arrWithDuplicates[arrWithDuplicates.length - dup - 1];
                    arrWithDuplicates[arrWithDuplicates.length - dup - 1] = arrWithDuplicates[j];
                    arrWithDuplicates[j] = tmp;
                    dup++;
                }
            }

        }
        return Arrays.copyOf(arrWithDuplicates, arrWithDuplicates.length - dup);

    }
}












