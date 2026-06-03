package ARRAY;

import java.util.*;

public class AssignmentQ5 {

    static void Findtripplet(int[] arr){

        Set<List<Integer>> uniqueTripplet = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                int sum = 0;
                for(int k = 0; k<arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    List<Integer> tripplet = null;
                    if (sum == 0 & i != j & i != k & j != k) {
                        tripplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(tripplet);
                    }

                    uniqueTripplet.add(tripplet);
                }
            }
        }

        for(List<Integer> i : uniqueTripplet){
            System.out.print(i + " ");
        }
    }
    static void main() {

        int[] arr = {-1, 0,  1, 2, -1, -4};
        Findtripplet(arr);
    }
}
