package ARRAY;

public class MaxSumOfSubArray {


    static int MaxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){

            for(int j = 1; j<arr.length; j++){

                int currSum = 0;

                for(int k = i; k<=j; k++){
                    currSum += arr[k];
                }

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }


    static void main() {

        int[] arr = {1,2,-3,5,8,-2};

        int result = MaxSum(arr);

        System.out.println(result);
    }
}
