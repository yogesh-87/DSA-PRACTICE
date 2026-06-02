package ARRAY;

public class CheckElementAppearence {
    static Boolean checkElementAppearTwiceOrNot(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){

                if(arr[j] == arr[i] & i != j){
                    return true;
                }
            }

        }
        return false;
    }
    static void main() {

        int[] arr = {1,3,4,3,11};
        System.out.print(checkElementAppearTwiceOrNot(arr));
    }
}
