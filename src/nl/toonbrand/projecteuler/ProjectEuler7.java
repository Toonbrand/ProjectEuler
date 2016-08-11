package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/9/16.
 */
public class ProjectEuler7 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        findXPrime(10_001);

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");

    }

    public static void findXPrime(int goal) {
        boolean found = false;
        boolean isPrime = false;
        int primeNumberFound = 1;
        Long counter = 1L;

        while (!found) {
            for (int i = 2; i < counter; i++) {
                if (counter % i == 0 | counter % 2 == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }

            }

            if (isPrime) {
                primeNumberFound++;
                isPrime = false;
                System.out.println(counter + " is prime number nr: " + primeNumberFound);
            }

            if (primeNumberFound == goal) {
                found = true;
            }

            counter++;
        }
    }
}
