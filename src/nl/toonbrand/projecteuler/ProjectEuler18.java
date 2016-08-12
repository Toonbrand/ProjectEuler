package nl.toonbrand.projecteuler;

/**
 * Created by toon on 8/11/16.
 */
public class ProjectEuler18 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int[][] triangle ={
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4 , 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4 , 62, 98, 27, 23, 9 , 70, 98, 73, 93, 38, 53, 60, 4 , 23}};

        System.out.println("The maximum sum of a path through the triangle is " + maximumPath(triangle));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int maximumPath(int[][] triangle){
        for(int i=triangle.length-1;i>=0;i--){
            for(int j=0;j<triangle[i].length-1;j++){
                if(triangle[i][j]>triangle[i][j+1]){
                    triangle[i-1][j]+=triangle[i][j];
                }
                else{
                    triangle[i-1][j]+=triangle[i][j+1];
                }
                System.out.print(triangle[i][j+1] + " ");
            }
            System.out.println();
        }

        return triangle[0][0];
    }
}
