package ARRAY;

public class findUniqueElement {

    static int uniqueElement(int[] arr){


        for(int i = 0; i<arr.length; i++){
            int count = 0;
           int unique = arr[i];
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j] && i!= j ){
                    count++;
                }
            }
            if(count != 1){
                return unique;
            }
        }

        return -1;
    }
    static void main() {

       int[] arr = {1,1,2,4,5,2,6,4,5};
        System.out.println(uniqueElement(arr));
    }
}
