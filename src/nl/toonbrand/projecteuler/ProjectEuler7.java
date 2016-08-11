package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/9/16.
 */
public class ProjectEuler7 {
    public static void main(String[] args) {
        boolean found = false;
        boolean isPrime = false;
        int primeNumberFound = 1;
        Long counter = 1L;

        while(!found){
            for(int i=2;i<counter;i++){
                if (counter%i==0 | counter%2==0){
                    isPrime = false;
                    break;
                }
                else {
                    isPrime = true;
                }

            }

            if(isPrime){
                primeNumberFound++;
                isPrime=false;
                System.out.println(counter + " is prime number nr: " + primeNumberFound);
            }

            if(primeNumberFound == 10_001){
                found = true;
            }

            counter++;
        }
    }
}
