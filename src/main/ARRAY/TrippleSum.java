package ARRAY;

public class TrippleSum {

    static int[] TripplePairSum(int[] arr, int target){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    int sum  = 0;
                    sum = arr[i] + arr[j] + arr[k];
                    if( target == sum){
                        int[] arr1 = {i,j,k};
                        return arr1;
                    }
                }
            }
        }
        int[] arr1 = {};
        return arr1;
    }
    static void main() {

        int[] arr={1,2,3,5,6,7,8,9,10,11,23,14,15,17,19};
        int target = 16;
        int[] ans = TripplePairSum(arr,target);

        System.out.println("Index --" + ans[0] + " " + ans[1] + " " + ans[2]);
        System.out.print("Values -- " +arr[ans[0]] + " " + arr[ans[1]] + " " + arr[ans[2]]);
    }
}
