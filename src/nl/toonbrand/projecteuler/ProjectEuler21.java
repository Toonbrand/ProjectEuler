package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/15/16.
 */
public class ProjectEuler21 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int max = 10_000;
        System.out.println("\nThe sum of all the amicable numbers under " + max + " is " + sumOfAmicableNumbers(max));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int sumOfAmicableNumbers(int max){
        int[] list = sumsOfDivisorsArray(max);
        int sum=0;
        for (int i=0;i<list.length;i++){
            for (int j=i+1;j<list.length;j++){
                if (i!=j & (list[i]==j & i==list[j])){
                    System.out.println(j + " and "+ i + " are an amicable pair!");
                    sum+=j+i;
                }
            }
        }
        return sum;
    }

    public static int[] sumsOfDivisorsArray(int max){
        int[] sumsOfDivisors = new int[max];
        for (int i=1;i<max;i++){
            sumsOfDivisors[i]=sumOfProperDivisors(i);
        }
        return sumsOfDivisors;
    }

    public static int sumOfProperDivisors(int input){
        int sum=0;
        for (int i=1;i<input;i++){
            if (input%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
