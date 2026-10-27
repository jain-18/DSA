class FindElementInMountain {
    public static void main(String[] args) {
       int[] arr = {0,1,2,3,4,5,3,2,1,0};
       System.out.println(findelement(arr,2));
    }
    public static int findelement(int[] arr, int target){
        int peak = moutainArry(arr);
        int b1 = binarysearch1(arr,target,0,peak);
        if(b1!= -1) return b1;
        return binarysearch2(arr,target,peak,(arr.length-1));
    }
    
    public static int moutainArry(int[] arr){
         int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int binarysearch1(int[] arr, int target,int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid +1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    public static int binarysearch2(int[] arr, int target,int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                end = mid-1;
            }
            else if(arr[mid]>target){
                start = mid +1;
            }
            else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    
}