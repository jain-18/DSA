

public class LeetCode832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},
                        {1,0,1},
                        {0,0,0}};

        flipAndInvertImage(image);
        printMatrix(image);

    }

    private static void flipAndInvertImage(int[][] image) {
       for(int i = 0;i<image[0].length;i++){
            int start = 0;
            int end = image[i].length-1;
            while(start<=end){
                int num = image[i][start];
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = num ^ 1; 
                start++;
                end--;
            }


       }
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
