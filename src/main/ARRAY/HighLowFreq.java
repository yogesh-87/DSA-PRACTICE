package ARRAY;

import java.util.HashMap;
import java.util.Map;

public class HighLowFreq {

    static void highestAndLowestFreq(int[] arr){

        Map<Integer,Integer> freq = new HashMap<>();

        for(Integer i : arr){
            freq.put(i , freq.getOrDefault(i , 0) + 1);
        }

        int highFreq = Integer.MIN_VALUE;
        int highNum = -1;

        for(int key: freq.keySet()){
            int currenthighkey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highFreq){
                highFreq = currentFreq;
                highNum = currenthighkey;
            }
        }

        int lowFreq = Integer.MAX_VALUE;
        int lowNum = -1;

        for(int key: freq.keySet()){
            int currentlowkey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowFreq){
                lowFreq = currentFreq;
                lowNum = currentlowkey;
            }
        }

        System.out.println("highest frequency element -- " + highNum + " frequency -- " + highFreq);
        System.out.println("Lowest frequency element -- " + lowNum + " frequency -- " + lowFreq);
    }

    static void main() {

        int[] arr ={1,1,2,3,34,23,2,2,6,7,5,1};
        highestAndLowestFreq(arr);
    }
}
