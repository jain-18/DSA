class tatesArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,2,9,2,2,2};
        int pivot = pivotFindWithDuplicates(arr);
        System.out.println(pivot);
        int target = 9;
        int ans1=0;
        if(target >= arr[0]){
           ans1= BinarySearch(arr,target,0,pivot);
        }else{
            ans1 = BinarySearch(arr,target,pivot+1,arr.length-1);
        }
        System.out.println(ans1);
    }
     public static int pivotFindWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid element is greater than next element → pivot is mid
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid element is smaller than previous → pivot is mid - 1
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if(arr[start] == arr[mid] && arr[start] == arr[end] ){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start++;
            }
            else{
                end--;
            }
        }
        return -1; // No pivot found; array is not rotated
    }
    public static int BinarySearch(int[] arr, int target,int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}