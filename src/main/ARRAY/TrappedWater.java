package ARRAY;

public class TrappedWater {
    public static void TrappingWater(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // find left side max value
      int maxSum = arr[0];
      leftMax[0] = 0;
        for(int i = 1; i<arr.length; i++){
            int currSum = 0;
            currSum = arr[i];
            if(maxSum < currSum ){
                maxSum = currSum;
                leftMax[i] = 0;
            }else{
                leftMax[i] = maxSum;
            }

        }


        // right side max sum
        int maxsum = arr[n-1];
        rightMax[n-1] = 0;
        for(int  i = n-2; i>= 0; i--){
            int currSum = 0;
            currSum = arr[i];

            if(maxsum < currSum ){
                maxsum = currSum;
                rightMax[i] = 0;
            }else{
                rightMax[i] = maxsum;
            }

        }



        // find how much water trapped
        int[] trapped_Water = new int[n];

        System.out.println("Trapped water At every building : ");
        for(int i = 0; i<arr.length; i++){
            if(leftMax[i] == 0 || rightMax[i] == 0){
                trapped_Water[i] = 0;
            }else if(rightMax[i] < leftMax[i] ){
                trapped_Water[i] = rightMax[i] - arr[i];
             }else{
                trapped_Water[i] = leftMax[i] - arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(trapped_Water[i] + " ");
        }

    }
    static void main() {

        int[] arr = {4,2,0,6,3,2,5};
        TrappingWater(arr);
    }
}
