package ARRAY;

import java.util.HashMap;
import java.util.Map;

public class modeOFArray {
    static int highestfrNo(int[] arr){

        Map<Integer,Integer > freq = new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i, 0) + 1);
        }
//        for(int num: freq.keySet()){
//           System.out.println(num + " --> " + freq.get(num));
//        }

        int maxFreq = -1;
       int maxFreqKey = -1;
        for(int j : freq.keySet()){
            int currentFreq = freq.get(j);
            int currentKey = j;
            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    static void main() {

        int[] arr = {1,2,2,3,3,4,5,5,6,8};

       int ans = highestfrNo(arr);

       System.out.print(ans);
    }
}
