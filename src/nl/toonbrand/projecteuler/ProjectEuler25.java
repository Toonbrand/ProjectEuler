package nl.toonbrand.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler25 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int maxDecimals = 1000;

        System.out.println("The first Fibonacci sequence with " + maxDecimals + " decimals is " + fibonacciWithXDecimals(maxDecimals));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int fibonacciWithXDecimals(int maxDecimals){
        BigInteger a,b,c;
        String fibonacci="";
        a = new BigInteger("1");
        b = new BigInteger("1");
        c = new BigInteger("1");
        int count=2;

        while(fibonacci.length()<maxDecimals){
            c=a.add(b);
            a=b;
            b=c;
            fibonacci = c.toString();
            count++;
        }
        return count;
    }

}
