package ARRAY;

class SumResult{

   float positiveSum = 0;
   float negativeSum = 0;

    SumResult(float positiveSum , float negativeSum){
        this.positiveSum = positiveSum;
        this.negativeSum = negativeSum;
    }
}
public class PosSumAndNegSum {

    static SumResult PositiveAndNegativeSum(int[] arr){
        float posSum = 0, NegSum = 0;

        for(int i : arr){
            if(i > 0){
                posSum += i;
            }else{
                NegSum += i;
            }
        }
        return new SumResult(posSum,NegSum);
    }
    static void main() {

        int[] arr = {2,-1,4,6,7,-4,-8,-11,45,-6};

        SumResult result = PositiveAndNegativeSum(arr);

        System.out.println("Positive Sum = " + result.positiveSum);
        System.out.println("Negative Sum = " + result.negativeSum);

    }
}
