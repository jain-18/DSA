import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeetCode428{
    public static void main(String[] args) {
        int[] arr= {1,1};
        System.out.println((findMissingNumberInArr(arr).toString()));
    }

    static List<Integer> findMissingNumberInArr(int[] arr){
        int i = 0;
        List<Integer> missingArray = new ArrayList<>();
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(i,correctIndex,arr);
            }else{
                i++;
            }
        }
        for(int index = 0;index<arr.length;index++){
            if(index != arr[index]-1){
                missingArray.add(index+1);
            }
        }
        return missingArray;
    }

    static void swap(int first, int sceond, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[sceond];
        arr[sceond] = temp;

    }
}