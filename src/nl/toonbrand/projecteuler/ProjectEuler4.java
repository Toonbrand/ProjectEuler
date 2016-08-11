package nl.toonbrand.projecteuler;

import java.util.*;

/**
 * Created by toon on 7/5/16.
 */
public class ProjectEuler4 {
    public static void main(String[] args){
        ArrayList<Integer> PalinDromes = new ArrayList<Integer>();

        for(int i=100;i<1000;i++){
            for(int j=100;j<1000;j++){
                if (isAPalindrome(i,j)){
                    PalinDromes.add(i*j);
                    System.out.println((i*j) + " is a palindrome");
                }
            }
        }

        Collections.sort(PalinDromes);
        System.out.println(PalinDromes.get(PalinDromes.size()-1) + " is the largest palindrome");
    }

    public static Boolean isAPalindrome(int firstNumber, int secondNumber){
        String s = Integer.toString(firstNumber*secondNumber);
        int sLength = s.length();
        if(sLength%2==0){
            String firstHalf = s.substring(0,sLength/2);
            String secondHalf = s.substring(sLength/2, sLength);
            if (firstHalf.equals(new StringBuilder(secondHalf).reverse().toString())){
                return true;
            }
        }
        return false;
    }
}

