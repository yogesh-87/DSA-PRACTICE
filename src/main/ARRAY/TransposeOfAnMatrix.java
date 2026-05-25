package ARRAY;

public class TransposeOfAnMatrix {
    static void TransposeOfAnArray(int[][] nums){


        int n = nums.length;  // row
        int m = nums[0].length; // col
        System.out.println(m);

        int[][] result = new int[m][n];
        int col = 0, row= 0;
//
//        while (row < m){  // m = 3
//
//            if(col < n){   // n = 2
//            result[row][col] = nums[col][row];
//            col++;
//            }else{
//                 col = 0;
//               row++;
//            }
//        }

// it takes O(n^2) time complexity
//        for( row = 0; row < m; row++){
//
//            for( col = 0; col < n; col++){
//                result[row][col] = nums[col][row];
//            }
//        }

        for( row = 0; row<m; row++){
            for(col = 0; col < n; col++){
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
    static void main() {

        int[][] nums = {
                {1,2,3},
                {2,4,6}
        };

        TransposeOfAnArray(nums);
    }
}
