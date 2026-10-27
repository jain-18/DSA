public class LeetCode41 {
    public static void main(String[] args) {
        int[] arr= {5,5,4,3,2,1};
        System.out.println((findFirstPositiveMissingNumber(arr)));
    }

    static int findFirstPositiveMissingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(i, correctIndex, arr);
            }else{
                i++;
            }
        }

        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index +1 ){
                return index+1;
            }
        }
        return 0;
    }

    static void swap(int first, int sceond, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[sceond];
        arr[sceond] = temp;

    }
}
