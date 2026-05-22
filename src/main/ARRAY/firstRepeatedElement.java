package ARRAY;

public class firstRepeatedElement {
    static int findFirstRepeatingElement(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    static void main() {

        int[] arr={1,2,3,4,6,1,6,8};
     int index = findFirstRepeatingElement(arr);

     System.out.print("A first repeating Number is -- " + arr[index]);
    }
}
