package nl.toonbrand.projecteuler;

import java.math.BigDecimal;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler16 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println("The sum of the digits of that number is " + powerSum(2,1000));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int powerSum(int number,int power){
        String largeNumber = (new BigDecimal(Math.pow(number,power))).toString();
        System.out.println(number + " ^ " + power + " = " + largeNumber);
        int sum = 0;
        for (int i=0; i<largeNumber.length();i++){
            sum += Integer.parseInt(largeNumber.substring(i,i+1));
        }
        return sum;
    }
}
