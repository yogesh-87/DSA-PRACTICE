package ARRAY;

public class MissingNumber {
    static int missingElement(int[] arr){

       int num = 0;

       for(int i = 0; i< arr.length; i++){
           int count = 0;
           num = i;
           for(int j = 0; j<arr.length; j++){
               if(arr[j] == i){
                   count++;
                   //do nothing
               }
           }
           if(count != 1){
               return num;
           }
       }
       return -1;
    }
    static void main() {

        int[] arr = {1,2,3,0,5,6,4,7,9};

        int key = missingElement(arr);

        System.out.print(key);
    }
}
