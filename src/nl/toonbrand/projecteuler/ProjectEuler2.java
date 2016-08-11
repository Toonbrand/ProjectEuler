package nl.toonbrand.projecteuler;


/**
 * Created by toon on 8/11/16.
 */
public class ProjectEuler2 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println(sumEvenValues(4_000_000));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static long sumEvenValues(int maxValue){
        long total=0;
        long a=1,b=1,c=2;
        while(c<maxValue){
            c=a+b;
            a=b;
            b=c;
            if(c%2==0){
                total += c;
            }
        }
        return total;
    }
}
