package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class SumOfRow {
    static List<Integer> SumOfRows(int[][] nums){

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = 0; j<nums.length; j++){
                sum += nums[i][j];
            }
            result.add(sum);
        }
        return result;
    }
    static void main() {

        int[][] nums = {
                {1,2,3},
                {2,4,5},
                {3,4,5}
        };

        List<Integer> result = SumOfRows(nums);

       for(int i : result){
           System.out.println(i);
       }

    }
}
