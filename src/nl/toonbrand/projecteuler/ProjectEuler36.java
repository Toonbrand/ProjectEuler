package nl.toonbrand.projecteuler;


/**
 * Created by toon on 8/15/16.
 */
public class ProjectEuler36 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int max = 1_000_000;
        System.out.println("\nThe sum of all Palindromes, both decimal and binary, below " + max + " is " + sumOfAllPalindromes(max));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int sumOfAllPalindromes(int max){
        int sum =0;
        for (int i=1;i<max;i+=2){   //add 2 ever loop so only odd numbers get checked
            if(isAPalindrome(i) && isAPalindrome(Integer.toBinaryString(i))){   //use a short-circuit operator to safe time
                sum += i;
                System.out.println("Decimal: "+i+" | Binary: "+Integer.toBinaryString(i));
            }
        }
        return sum;
    }

    public static Boolean isAPalindrome(int input){
        return isAPalindrome(Integer.toString(input));
    }

    public static Boolean isAPalindrome(String input){
        int sLength = input.length();
        String firstHalf;
        String secondHalf;
        if(sLength%2==0){
             firstHalf = input.substring(0,sLength/2);
             secondHalf = input.substring(sLength/2, sLength);
        }
        else{
             firstHalf = input.substring(0,(sLength/2)+1);
             secondHalf = input.substring(sLength/2, sLength);
        }
        if (firstHalf.equals(new StringBuilder(secondHalf).reverse().toString())){
            return true;
        }
        return false;
    }
}
