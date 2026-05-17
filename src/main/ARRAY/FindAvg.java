package ARRAY;

import java.util.Scanner;

public class FindAvg {

    public static float Avg(int arr[]){
        float  sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
       float avg = sum / arr.length;
        return avg;
    }
    static void main() {
     int n = 5;
        int[] arr = new int[n] ;
        Scanner sc = new Scanner(System.in);
System.out.println("enter array element");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.print("Avg of the element is : " + Avg(arr));

    }
}
