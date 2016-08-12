package nl.toonbrand.projecteuler;


/**
 * Created by toon on 8/12/16.
 */
public class ProjectEuler31 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println("There are " + calculateWays(200) + " ways to make 2 pound with all different coins.");

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int calculateWays(int goal){
        int counter = 0;

        for (int a = goal; a >= 0; a -= 200) {
            for (int b = a; b >= 0; b -= 100) {
                for (int c = b; c >= 0; c -= 50) {
                    for (int d = c; d >= 0; d -= 20) {
                        for (int e = d; e >= 0; e -= 10) {
                            for (int f = e; f >= 0; f -= 5) {
                                for (int g = f; g >= 0; g -= 2) {
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return counter;
    }
}
