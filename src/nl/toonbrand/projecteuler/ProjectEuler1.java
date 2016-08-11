package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/11/16.
 */
public class ProjectEuler1 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println(findSumMultiples(1000));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static long findSumMultiples(int maxIterations){
        long total = 0;
        for(int i=0;i<maxIterations;i++){
            if (i%3==0||i%5==0){
                total = total +i;
            }
        }
        return total;
    }

}
