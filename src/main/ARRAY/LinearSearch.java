package ARRAY;

public class LinearSearch {

    public static boolean linearSearch(int arr[],int key){

        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }

        return false;

    }
    static void main() {

        int[] arr = {2,4,5,34,3,12,45,23,33,12,22,66};
        int key = 1;

        boolean found = linearSearch(arr,key);

        if(found){
            System.out.println("element found ");
        }else{
            System.out.println("element not found ");
        }
    }
}
