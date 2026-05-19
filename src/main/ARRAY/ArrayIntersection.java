package ARRAY;

public class ArrayIntersection {

    static void intersection(int[] arr1 , int[] arr2){

        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
    static void main() {

        int[] arr1 = {1,2,4,6,34,3};
        int[] arr2 = {1,4,5,23,45,7};

        intersection(arr1,arr2);
    }
}
