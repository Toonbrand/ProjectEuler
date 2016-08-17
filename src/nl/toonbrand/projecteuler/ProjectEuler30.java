package nl.toonbrand.projecteuler;


/**
 * Created by toon on 8/15/16.
 */
public class ProjectEuler30 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println("Searching for numbers that can be written as the sum of the fifth powers of their digits...\n");
        System.out.println("\nThe sum of all these numbers is "+sumFifthDigitPowers(calculateMax()));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int calculateMax(){
        return (int)Math.pow(9,5)*6;
    }

    public static int sumFifthDigitPowers(int max){
        int sum = 0;
        for (int i=2;i<max;i++){
            int j=i;
            int numTot=0;
            while (j > 0) {
                numTot+=Math.pow(( j % 10),5);
                j = j / 10;
            }
            if (numTot==i){
                sum+=i;
                System.out.println(i + "\tqualifies");
            }
        }
        return(sum);
    }
}
