package Sorting;

public class InsertionSort {
    static void insertionSorting(int[] arr){

        for(int i =1; i<arr.length-1; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    static void main() {

        int[] arr = {1,4,5,7,6,8};
        insertionSorting(arr);
    }
}
