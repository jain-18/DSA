class RotationArrayCount {
    public static void main(String[] args) {
        int[] arr = {2,2,9,2,2,2};
        int pivot = findPivot(arr);
        System.out.println(pivot+1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = (start + (end-start))/2;
            
            if(arr[mid] > arr[start] && mid>start){
                start = mid+1;
            }else if(arr[mid]<arr[end] && mid<end){
                end = mid -1;
            }
            
            if(arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
        }
        return -1;
    }
}