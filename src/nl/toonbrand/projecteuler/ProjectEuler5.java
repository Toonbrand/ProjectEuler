package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/9/16.
 */
public class ProjectEuler5 {
    public static void main(String[] args) {
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
        System.out.println(counter + " is the smallest number divisible by all numbers from 1 to 20");
    }
}
