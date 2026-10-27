import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        Boolean swap = false;
        while (start < end) {
            for (int i = 0; i < end; i++) {
                if (i + 1 <= end && arr[i + 1] < arr[i]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
                if (!swap) {
                    break;
                }
            }
            end--;
        }
    }

    static void selectionSort(int[] arr) {
        int largeIndex = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            for (int i = 0; i <= end; i++) {
                if (arr[i] > arr[largeIndex]) {
                    largeIndex = i;
                }
            }
            if (arr[largeIndex] > arr[end])
                swap(largeIndex, end, arr);

            if (arr[end] == arr[largeIndex]) {
                break;
            }

            end--;
            largeIndex = 0;
        }
    }

    static void swap(int largeIndex, int end, int[] arr) {
        int temp = arr[largeIndex];
        arr[largeIndex] = arr[end];
        arr[end] = temp;

    }

    static void insertionSort(int[] arr) {
        int i = 0;
        while (i < arr.length-1) {
            int j = i+1;
            while (j > 0 && arr[j] < arr[j-1]) {
                j--;
            }
            if (arr[i] < arr[j]) {
                swap(i, j, arr);
            }
            i++;
        }
    }

    // use only when number is given 1 to N
    static void cyclicSort(int[] arr){
        int temp = 0;
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }
}
