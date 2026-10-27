import java.util.ArrayList;
import java.util.List;

public class LeetCode442 {
    public static void main(String[] args) {
         int[] arr= {5,5,4,3,3,2,1};
        System.out.println((findDuplicateNumberInArray(arr)).toString());
    }

    static List<Integer> findDuplicateNumberInArray(int[] arr){
         int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(i, correctIndex, arr);
            }else{
                i++;
            }
        }

        List<Integer> arrayList = new ArrayList<>();
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index+1){
                arrayList.add(arr[index]);
            }
        }
        return arrayList;
    }

    static void swap(int first, int sceond, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[sceond];
        arr[sceond] = temp;

    }
}
