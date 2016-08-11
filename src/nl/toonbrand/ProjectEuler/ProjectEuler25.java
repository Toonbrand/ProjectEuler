package nl.toonbrand.test;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler25 {
    public static void main(String[] args) {
        int maxDecimals = 1000;
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
        System.out.println("The " + count + "th term is the first Fibonacci to have " + maxDecimals + " decimals");
    }



}
