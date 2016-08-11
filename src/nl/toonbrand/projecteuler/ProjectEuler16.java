package nl.toonbrand.projecteuler;

import java.math.BigDecimal;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler16 {
    public static void main(String[] args) {
        String largeNumber = (new BigDecimal(Math.pow(2,1000))).toString();
        System.out.println("2^1000 = " + largeNumber);
        int sum = 0;
        for (int i=0; i<largeNumber.length();i++){
            sum += Integer.parseInt(largeNumber.substring(i,i+1));
        }
        System.out.println("The sum of the digits of that number is " + sum);
    }
}
