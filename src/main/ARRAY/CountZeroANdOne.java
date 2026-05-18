package ARRAY;

public class CountZeroANdOne {

    static int[] count(int[] arr){
        int countZero = 0 , countOne = 0;

        for(int i : arr){
            if( i == 1){
                countOne++;
            }
            if( i == 0){
                countZero++;
            }
        }
       int[] arr1 = {countOne , countZero};
        return arr1;
    }

    static void main() {

        int[] arr = {0,1,3,2,1,0,0,5,6};

        int[] arr2 = count(arr);

        System.out.println("Zero's in this array = " + arr2[1]);
        System.out.println("One's in this array = " + arr2[0]);
    }
}
