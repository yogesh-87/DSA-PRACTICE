package ARRAY;

public class PivotIndex {
    static int findPivotIndex(int[] arr){

        int[] leftSum = new int[arr.length];
        int[] rightsum = new int[arr.length];
        int sum = 0;

        // Left Sum
        for(int i = 0; i<arr.length; i++){
             sum += arr[i];
            leftSum[i] = sum;
        }

//        for(int i : leftSum){
//            System.out.print(i + " ");
//        }




        //Right Sum
        sum = 0;
        for(int i = arr.length-1; i>=0; i--){
            sum += arr[i];
            rightsum[i] = sum;
        }

//        for(int i : rightsum){
//            System.out.print(i + " ");
//        }



        //pivot index means sum left value of pivot index is equal to sum of right value of pivot

        for(int i = 0; i<arr.length; i++){
            if(leftSum[i] == rightsum[i]){
                return i;
            }
        }
        return -1;
    }
    static void main() {

        int[] arr = {1,3,7,6,6,5};
        int index = findPivotIndex(arr);

        if(index == -1){
            System.out.println("in Given Array Pivot Index is not Exist");
        }else{
            System.out.println("Pivot Index Is : " + index);
        }

    }
}
