package nl.toonbrand.projecteuler;

import java.util.ArrayList;

/**
 * Created by toon on 8/17/16.
 */
public class ProjectEuler23 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println("Starting work...");
        System.out.println("The sum of these numbers are "+sumOfNonAbudants(20161));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static boolean isAbundant(int input){
        int sum=0;
        for(int i=1;i<=input/2;i++){
            if(input%i==0){
                sum+=i;
            }
        }
        if (sum>input){
            return true;
        }
        return false;
    }

    public static ArrayList<Integer> abundantArray(int max){
        System.out.println("Creating array of abundant numbers under " + max + "...");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=max;i++){
            if (isAbundant(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> sumOfAbundants(int max){
        ArrayList<Integer> abundants = abundantArray(max);
        ArrayList<Integer> sumOfAbundants = new ArrayList<>();
        System.out.println("Creating array of integers below "+max+" that can be written as the sum of two abundant numbers...");

        for(int i=0;i<abundants.size();i++){
            for(int j=i;j<abundants.size();j++){
                int sum = abundants.get(i)+abundants.get(j);
                if(sum>max){
                    break;
                }
                else if(!sumOfAbundants.contains(sum)){
                    sumOfAbundants.add(sum);
                }
            }
        }
        return sumOfAbundants;
    }

    public static int sumOfNonAbudants(int max){
        ArrayList<Integer> sumOfAbundants = sumOfAbundants(max);
        int sum=0;
        System.out.println("Making a sum of all numbers that cannot be written as the sum of two abundant numbers...");
        for(int i=0;i<=max;i++){
            if(!sumOfAbundants.contains(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
