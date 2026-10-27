public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {4,1,0,3};
        System.out.println(findMissingValue(arr));
    }

    private static int findMissingValue(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int currentIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[currentIndex]){
                swap(i,currentIndex,arr);
            }else{
                i++;
            }
        }
        for(i = 0;i<=arr.length;i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    static void swap(int first, int sceond, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[sceond];
        arr[sceond] = temp;

    }
}
