package ARRAY;

public class MissingNumber {
    static int missingElement(int[] arr){

       int totalsum = 0;
       int presentsum = 0;

//       for(int i = 0; i< arr.length; i++){
//           int count = 0;
//           num = i;
//           for(int j = 0; j<arr.length; j++){
//               if(arr[j] == i){
//                   count++;
//                   //do nothing
//               }
//           }
//           if(count != 1){
//               return num;
//           }
//       }

        for(int i = 0; i<= arr.length; i++){
            totalsum += i;
        }
        for(int i = 0; i<arr.length; i++){
            presentsum += arr[i];
        }

        int num = totalsum - presentsum;

       return num;
    }
    static void main() {

        int[] arr = {1,3,0,5,8,10,6,4,7,9};

        int key = missingElement(arr);

        System.out.print(key);
    }
}
