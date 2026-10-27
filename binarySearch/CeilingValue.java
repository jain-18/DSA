class CeilingValue {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = ceiling(arr, target);
        System.out.println("Ceiling of " + target + " is: " + result);
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Edge case: if target is greater than the last element
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // exact match
            }
        }
        // When loop breaks, start is pointing to the smallest number >= target
        return arr[start];
    }
}
