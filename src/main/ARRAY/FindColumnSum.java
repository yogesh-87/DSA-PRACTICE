package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class FindColumnSum {
    static List<Integer> SumOfRows(int[][] nums){

        List<Integer> result = new ArrayList<>();
        int n = nums[0].length;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = 0; j<nums.length; j++){
                sum += nums[j][i];
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
