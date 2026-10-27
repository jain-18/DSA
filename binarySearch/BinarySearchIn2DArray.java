// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int[] result = search(matrix,8);
        System.out.println(result[0] +" "+result[1]);
    }
    
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            
            if(matrix[row][mid]==target){
                return new int[] {row,mid};
            } 
            if(matrix[row][mid] > target){
                cEnd = mid-1;
            }else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        
        while(rStart<rEnd-1){
            int mid = rStart + (rEnd-rStart)/2;
            
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart = mid+1;
            }else{
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(rStart+1<rows && matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        
        //check in 1st half
        if(cMid-1>=0 && target<= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //check in 2nd half
       else if(cMid+1<cols && target>= matrix[rStart][cMid+1] && target<= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //check in 3rd half
        else if(rStart+1<rows && cMid-1>=0 && target<= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        if(rStart+1<rows && cMid+1<cols){
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

        return new int[]{-1,-1};
    }
}



