package ARRAY;

public class SwapAlternateElements {

    static void swap(int[] arr){

        int i = 0;

        while(i<arr.length-1){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i += 2;
        }

        for(int j : arr){
            System.out.print(j + " ");
        }
    }
    static void main() {

        int[] arr = {2,4,3,34,23,534,235,3,2,23,4,6};

        swap(arr);
    }
}
