package nl.toonbrand.projecteuler;

import java.math.BigInteger;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler20 {
    public static void main(String[] args) {

        sumOfDigits(factorialDigit(100));

    }

    public static BigInteger factorialDigit(long input){
        System.out.print(input+"! = ");
        BigInteger output = new BigInteger("1");
        while(input>0){
            output = output.multiply(BigInteger.valueOf(input));
            input--;
        }
        System.out.println(output);
        return output;
    }

    public static long sumOfDigits(BigInteger input){
        long output = 0;
        String s = String.valueOf(input);
        for (int i=0;i<s.length();i++){
            output = output + Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println("Sum of the digits: " + output);
        return output;
    }
}
