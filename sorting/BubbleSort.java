// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {};
        bubbleSort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        boolean swapped = false;
        int temp=0;
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}