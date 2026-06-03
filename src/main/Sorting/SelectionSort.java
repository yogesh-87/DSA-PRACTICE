package Sorting;

public class SelectionSort {
    static void selectionSorting(int[] arr){

        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    static void main() {

        int[] arr = {1,3,5,16,8};
        selectionSorting(arr);
    }
}
