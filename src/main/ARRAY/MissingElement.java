package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {
    static List<Integer> findMissingElements(int[] nums){


// time complexity O(n^2)
//       for(int i = 1; i<=nums.length; i++){
//           int found = 0;
//           for(int j = 0; j<nums.length; j++){
//               if(nums[j] == i){
//                   found = found + 1;
//                   break;
//               }
//           }
//           if(found == 0){
//               list.add(i);
//           }
//       }



        // TIME Complexity O(N)
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            int value = Math.abs(nums[i]);
            int pos = value - 1;

            if(nums[pos] > 0){
                nums[pos] = -nums[pos];
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
    static void main() {
        int[] nums = {1,2,4,2,5};

        List<Integer> result = findMissingElements(nums);
        for(int i : result){
            System.out.print(i + " ");
        }

    }
}
