class NextGreatestestChar {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';
        char result = nextGreatestChar(letters, target);
        System.out.println("Next greatest char after '" + target + "' is: " + result);
    }

    public static char nextGreatestChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // start % letters.length ensures it wraps around if needed
        return letters[start % letters.length];
    }
}
