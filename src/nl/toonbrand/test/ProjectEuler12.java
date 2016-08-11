package nl.toonbrand.test;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler12 {
    public static void main(String[] args) {
        boolean iterate = true;
        int checkNumber = 4000;
        while(iterate){
            long triangleValue = triangleNumber(checkNumber);
            long divisors = numberOfDivisors(triangleValue);

            System.out.println("Number: " + checkNumber + " | Triangle: " + triangleValue + " | Divisors: " + divisors);

            if (divisors>500){
                iterate = false;
                System.out.println("Success!");
            }
            checkNumber++;
        }
    }

    public static long triangleNumber(int input){
        long total = 0;
        for(int i=1;i<=input;i++){
            total += i;
        }
        return total;
    }

    public static int numberOfDivisors(long input){
        int counter=0;
        int sqrt = (int) Math.sqrt(input);
        for(int i=1;i<=sqrt;i++){
            if(input%i==0){
                counter+=2;
            }
        }
        return counter;
    }
}
