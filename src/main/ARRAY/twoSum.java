package ARRAY;

public class twoSum {

    static int[] TwoSum(int[] arr,int target){

        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                sum = arr[i] + arr[j];
                if( sum == target){
                    int[] ans = {i , j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }
    static void main() {

        int[] arr={0,3,4,23,3,56,34,2,6,7,8,9};
        int target = 10;

        int[] ans = TwoSum(arr,target);

        System.out.print(ans[0] + " " + ans[1]);
    }
}
