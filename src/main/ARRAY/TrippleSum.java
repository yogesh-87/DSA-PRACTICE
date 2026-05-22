package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class TrippleSum {

    static int[] TripplePairSum(int[] arr, int target){
        List<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i<arr.length - 2; i++){
            for(int j = i+1; j<arr.length - 1; j++){
                for(int k = j+1; k<arr.length; k++){
                    int sum  = 0;
                    sum = arr[i] + arr[j] + arr[k];
                    if( target == sum){
                        arr1.add(arr[i]);
                        arr1.add(arr[j]);
                        arr1.add(arr[k]);
                    }
                }
            }
        }
         return  arr1;
    }
    static void main() {

        int[] arr={1,2,3,5,6,7,8,9,10,11,23,14,15,17,19};
        int target = 16;

        List<Integer> ans = new ArrayList<>();
       ans = TripplePairSum(arr,target);

        System.out.println("Index --" + ans[0] + " " + ans[1] + " " + ans[2]);
        System.out.print("Values -- " +arr[ans[0]] + " " + arr[ans[1]] + " " + arr[ans[2]]);
    }
}
