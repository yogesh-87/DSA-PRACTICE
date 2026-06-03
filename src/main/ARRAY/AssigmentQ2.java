package ARRAY;

public class AssigmentQ2 {


    static int findTarget(int[] newArr , int target){

        for(int i = 0; i< newArr.length; i++){
            if(newArr[i] == target){
                return i;
            }
        }
        return -1;
    }


    static int[] rotateArray(int[] arr ,int pivot){
        int[] rotated_array = new int[arr.length];
        int i = 0;
        int j = pivot;

       while(j < arr.length){
           rotated_array[i] = arr[j];
           i++;
           j++;
       }

       for(int k = 0; k<pivot; k++ ){
           rotated_array[i] = arr[k];
           i++;
       }

     return rotated_array;
    }

    static void main() {

        int[] arr = {1,2,3,5,6,8,9};
        int pivot = 3;
        int target = 6;
        int[] newArr = rotateArray(arr,pivot);
       System.out.println(findTarget(newArr,target));
    }
}
