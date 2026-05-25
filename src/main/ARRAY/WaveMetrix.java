package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class WaveMetrix {

    static List<Integer> WaveMatrix(int[][] arr){

        List<Integer> result = new ArrayList<>();
        int n = arr[0].length;
        int m = arr.length;

        for(int col = 0; col<n; col++){

            if( col % 2 == 0){

                for(int row = 0; row<m; row++){
                    result.add(arr[row][col]);
                }
            }
            else{

                for(int row = m-1; row>=0; row--){
                    result.add(arr[row][col]);
                }
            }
        }
        return result;
    }
    static void main() {

        int[][] arr = {
                {1,3,4},
                {2,5,7},
                {3,6,9},
                {4,3,2}
        };

        List<Integer> result = WaveMatrix(arr);

        for(int i: result){
            System.out.print(i + "  ");
        }

    }
}
