package ARRAY;

public class ReverseArray {
    static void reverseUsingAnotherArray(int[] arr){
        int[] newArr = new int[arr.length];
        int j = arr.length-1;
        for(int i = 0; i< arr.length; j--,i++){
            newArr[i] = arr[j];
        }

        for(int k : newArr){
            System.out.print(k + " ");
        }
    }






    static int[] reverseOriginalArray(int[] arr){

        int i = 0, j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k : arr){
            System.out.print(k + " ");
        }

        return arr;
    }





    static void main() {

        int[] arr = {1,2,3,4,6,8,9};
       // reverseOriginalArray(arr);
        reverseUsingAnotherArray(arr);
    }
}
