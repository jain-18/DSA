// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MountainArray {
    public static void main(String[] args) {
       int[] arr = {0,1,5,6,3,2,1,0};
       System.out.println(moutainArry(arr));
    }
    
    public static int moutainArry(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid+1]<arr[mid] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }else if(arr[mid+1]<arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
}