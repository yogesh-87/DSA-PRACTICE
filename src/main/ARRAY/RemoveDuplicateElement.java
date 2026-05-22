package ARRAY;

public class RemoveDuplicateElement {

    static int removeDuplicate(int[] arr){

        int i = 0 , j = 1;
        while( j <arr.length){
            if(arr[i] == arr[j]){
                j++;
            }else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }
    static void main() {

        int[] arr = {1,2,2,2,3,3,4,5,5,5,6,6,7,8,8,9};
        int count = removeDuplicate(arr);

        for(int i = 0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
