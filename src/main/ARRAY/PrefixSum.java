package ARRAY;

public class PrefixSum {

    static int prefixSum(int[] arr){


        int[] prefixSum = new int[arr.length];
       int sum  = 0;


        // calculate sum at every index
        prefixSum[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }



//        for(int i = 0; i<prefixSum.length; i++){
//            System.out.println(prefixSum[i]);
//        }



        // find max sum from the SubArray
        int maxSum = prefixSum[0];
        for(int i = 1; i<arr.length; i++){

            for(int j = i; j<arr.length; j++){
                int currSum = prefixSum[j] - prefixSum[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
            }
            }
        }
        return maxSum;
    }
    static void main() {

        int[] arr = {1,3,4,5,-7,3};

        System.out.print(prefixSum(arr));

    }
}
