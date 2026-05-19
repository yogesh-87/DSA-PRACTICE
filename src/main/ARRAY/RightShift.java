package ARRAY;

public class RightShift {

    static void rightShiftByOne(int[] arr){

       // int i = arr.length-1 , j =arr.length-2;
        int last = arr[arr.length-1];
//        while(i >0){
//            arr[i] = arr[j];
//            i--;
//            j--;
//        }
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = last;


    }
    static void main() {

        int[] arr = {2,3,4,5,6,7,8};

       rightShiftByOne(arr);
        for(int s : arr){
            System.out.print(s + " ");
        }

    }
}
