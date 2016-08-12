package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/12/16.
 */
public class ProjectEuler28 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int spiralSize = 1001;
        System.out.println("The sum of the numbers on the diagonals of a spiral of " + spiralSize + "*" + spiralSize + " is " + calculateDiagonals(spiralArray(spiralSize)));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int[][] spiralArray(int size){
        int[][] spiral = new int[size][size];
        int filler = (size*size);
        int x1=0, x2=size-1, y1=0, y2=size-1;

        while(filler>0){
            for (int i=x1;i<=x2;i++){
                spiral[y1][i]=filler--;
            }
            for (int i=y1+1;i<=y2;i++){
                spiral[i][x2]=filler--;
            }
            for(int i=x2-1;i>=x1;i--)
            {
                spiral[y2][i]=filler--;
            }

            for(int j=y2-1;j>=y1+1;j--)
            {
                spiral[j][x1]=filler--;
            }

            x1++;
            x2--;
            y1++;
            y2--;


        }

//        for (int i=0;i<spiral.length;i++){
//            for (int j=0;j<spiral[i].length;j++){
//                System.out.print(spiral[i][j] + " ");
//            }
//            System.out.println();
//        }

        return spiral;
    }

    public static long calculateDiagonals(int[][] spiral){
        long sum = 0;


        for (int i=0, j=0;i<spiral.length;i++, j++) {
            sum += spiral[i][j];
        }

        for (int i=spiral.length-1, j=0; i>=0;i--, j++){
            sum += spiral[i][j];
        }

        sum -= spiral[spiral.length/2][spiral.length/2];

        return sum;
    }
}
