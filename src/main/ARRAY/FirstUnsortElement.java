package ARRAY;

public class FirstUnsortElement {

   static int unsortElement(int[] arr){

       for(int i = 1; i<arr.length; i++){
           int temp = arr[i-1];
           for(int j = i; j<arr.length; j++){
               if(arr[j] < temp){
                   return arr[j];
               }
           }
       }
        return -1;
    }
    static void main(){

        int[] arr = {1,2,3,4,5,7,9,10,11,3,45};

        System.out.println(unsortElement(arr));
    }
}



