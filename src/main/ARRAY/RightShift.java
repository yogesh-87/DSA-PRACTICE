package ARRAY;

public class RightShift {

    public static void shiftByK(int[] arr,int k){
        int n  = arr.length;
        int[] result = new int[n];


        for(int i = 0; i<n; i++){
            int temp = arr[i];
            int newIndex =(i+k)%n;
            result[newIndex] = temp;
        }

        for(int s : result){
            System.out.print(s + " ");
        }


    }


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



        int[] arr = {2,3,4,5};
         int k = 3;
//       rightShiftByOne(arr);
        shiftByK(arr,k);

    }
}
