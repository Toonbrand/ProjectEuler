package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/11/16.
 */
public class ProjectEuler9 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println(productTriplet(1000));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int productTriplet(int goal){
        for (int b=2;b<goal/2;b++){
            for (int a=1;a<b;a++){
                if((a*a)+(b*b)==(goal-a-b)*(goal-a-b)){
                    return a*b*(goal-a-b);
                }
            }
        }
        return 0;
    }

}
