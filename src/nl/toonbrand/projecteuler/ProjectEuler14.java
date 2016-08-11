package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler14 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        longestCollatzSequence(1_000_000);

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static void longestCollatzSequence(int maxNumber){
        int largestStart = 0;
        long largestSequence = 0;

        for(int i=1;i<=maxNumber;i++){
            long sequenceSize = CollatzSequence(i);
            if (sequenceSize>largestSequence){
                largestStart = i;
                largestSequence = sequenceSize;
            }
        }
        System.out.println("The longest Collatz Sequence under " + maxNumber + " is " + largestSequence + " terms long and starts with number " + largestStart);
    }

    public static long CollatzSequence(long input){
        long count=0;
        while(input > 1){
            if(input%2==0){
                input = input/2;
            }
            else if(input%2!=0){
                input = 3*input+1;
            }
            count++;
        }
        return count;
    }
}
