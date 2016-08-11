package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler15 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        System.out.println("\nThe number of routes to the bottorm right is " + numberRoutes(20,20));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static long numberRoutes(int x, int y){
        long[][] field = new long[x+1][y+1];
        for (int i=0;i<field.length;i++){
            for (int j=0;j<field[i].length;j++){
                if (i==0||j==0) {
                    field[i][j] = 1;
                }
                else{
                    field[i][j] = field[i-1][j] + field[i][j-1];
                }
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
        return field[x][y];
    }
}
