package ARRAY;

public class AssignmentQ3 {
    static void trappedWater(int[] height){
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];


        // leftMax
       leftMax[0] = height[0];

       for(int i = 1; i<leftMax.length; i++){

           leftMax[i] = Math.max(leftMax[i-1] , height[i]);
       }


       // right max
        rightMax[rightMax.length - 1] = height[height.length-1];

        for(int i = rightMax.length - 2; i>=0; i--){

            rightMax[i] = Math.max(rightMax[i+1] , height[i]);
        }


        // trapped Water
        int[] trapped_water = new int[height.length];
        trapped_water[0] = 0;
        trapped_water[trapped_water.length-1] = 0;
        for(int i = 1; i<trapped_water.length-1; i++){

           int min = Math.min(leftMax[i] , rightMax[i]);
           trapped_water[i] = min - height[i];
        }

        for(int i : trapped_water){
            System.out.print(i + " ");
        }
    }
    static void main() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappedWater(height);
    }
}
