package nl.toonbrand.projecteuler;

import java.math.BigInteger;

/**
 * Created by toon on 8/15/16.
 */
public class ProjectEuler48 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int max = 1000;
        System.out.println("The last 10 digits of the series 1^1 + 2^2 + 3^3 + ... + "+max+"^"+max+" is "+sumOfSelfPowers(max));
        System.out.println("Coincidentally, "+sumOfSelfPowers(max)+"kg is also your current weight.");

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static long sumOfSelfPowers(int max){
        long sum=0;
        for (int i=1;i<=max;i++){
            sum+=tenDigitsOfPower(i,i);

        }
        return sum%10000000000L;
    }

    public static long tenDigitsOfPower(int number, int power){
        BigInteger result = BigInteger.valueOf(number).pow(power);
        long resultLong = result.mod(BigInteger.valueOf(10000000000L)).longValue();
        return resultLong;
    }

}

