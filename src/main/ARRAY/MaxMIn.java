package ARRAY;

public class MaxMIn {

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){

            // max = Math.max(max , i);
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static int min(int[] arr){

        int min = Integer.MAX_VALUE;

        for(int i:arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    static void main() {

        int[] arr = {2,3,4,45,34,3,23,4,34};


        System.out.println(" maximum element from the array "+max(arr));
        System.out.println("minimum element from the array "+min(arr));

    }
}
