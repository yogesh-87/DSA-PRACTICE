package ARRAY;

public class Sort0sAnd1s {
    static int[] sort0And1(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
             if(arr[i] == 1 && arr[j] == 0){
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(arr[i] == 0){
                 i++;
            }else {
                 j--;
             }
        }
        return arr;
    }
    static void main() {

        int[] arr = {0,1,1,1,1,1,0,0,0,0,1,0,1,0};

        sort0And1(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
