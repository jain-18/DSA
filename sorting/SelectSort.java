class SelectSort {
    public static void main(String[] args) {
       int[] arr = {1};
       selectionSort(arr);
       for(int num : arr){
           System.out.print(num+" ");
       }
    }
    
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int maxIndex = 0;
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
                int temp = arr[arr.length-1-i];
                arr[arr.length-1-i] = arr[maxIndex];
                arr[maxIndex]=temp;
        }
        return arr;
    }
}
