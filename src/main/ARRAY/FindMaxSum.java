package ARRAY;

public class FindMaxSum {
    static int maxSumOfSubArray(int[] nums){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(sum , maxSum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    static void main() {

        int[] nums = {1,3,4,-1,6,8,-6};

        System.out.print("the Max Of SubArray --" + maxSumOfSubArray(nums));
    }
}
