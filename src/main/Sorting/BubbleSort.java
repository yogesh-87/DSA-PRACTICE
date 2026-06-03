package Sorting;

public class BubbleSort {

    static void bubbleSorting(int[] arr){

        for(int i = 0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i +  " ");
        }
    }
    static void main() {

        int[] arr = {1,2,4,5,3,6,7};
        bubbleSorting(arr);
    }
}
