// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class InfiniteArray {
    public static void main(String[] args) {
       int[] arr = {3,4,5,6,7,8,9,12,34,45,56,77,89,90};
       System.out.println(ans(arr,7));
    }
    public static int ans(int arr[],int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newstart = start;
            end = end+(end-start+1)*2;
            start = newstart;
        }
        int ans = binarySearch(arr,target,start,end);
        return ans;
    }
    
    

    
    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}