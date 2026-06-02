package ARRAY;

public class TrappedWater {
    public static void TrappingWater(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // find left side max value
      leftMax[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1] , arr[i]);
        }


        rightMax[n-1] = arr[n-1];
        for(int  i = n-2; i>= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1] , arr[i]);
        }



        // find how much water trapped
        int[] trapped_Water = new int[n];

        System.out.println("Trapped water At every building : ");
        for(int i = 0; i<arr.length; i++){
            int min = Math.min(leftMax[i] , rightMax[i]);
            trapped_Water[i] = min - arr[i];
        }



        int total_trapped_water = 0;
        for(int i = 0; i<arr.length; i++){
            total_trapped_water += trapped_Water[i];
            System.out.print(trapped_Water[i] + " ");
        }
        System.out.println();
        System.out.print("Total TRAPPED WATER :  "+ total_trapped_water);
    }
    static void main() {

        int[] arr = {4,2,0,6,3,2,5};
        TrappingWater(arr);
    }
}
