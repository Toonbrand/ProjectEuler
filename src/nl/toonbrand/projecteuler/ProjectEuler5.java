package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/9/16.
 */
public class ProjectEuler5 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println(smallestMultiple() + " is the smallest number divisible by all numbers from 1 to 20");

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static long smallestMultiple(){
        boolean done = false;
        Long counter = 1L;

        while(!done){
            for(int i=1;i<20;i++){
                if (counter%i==0){
                    done = true;
                }
                else{
                    done = false;
                    break;
                }
            }
            counter++;
        }
        counter--;
        return counter;
    }
}
