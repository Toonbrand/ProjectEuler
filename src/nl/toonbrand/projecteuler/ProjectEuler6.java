package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/9/16.
 */
public class ProjectEuler6 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        sumSquareDifference();

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static void sumSquareDifference(){
        Long sumOfSquares=0L;
        Long squareOfSum;
        Long numbersTotal=0L;

        for (int i=1;i<=100;i++){
            sumOfSquares += (long)Math.pow(i, 2);
            numbersTotal += i;
        }
        squareOfSum = (long)Math.pow(numbersTotal, 2);

        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("Square of Sum: " + squareOfSum);
        System.out.println("difference: " + (squareOfSum-sumOfSquares));
    }
}
