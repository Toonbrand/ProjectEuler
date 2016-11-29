package nl.toonbrand.projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by toon on 8/17/16.
 */
public class ProjectEuler67 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        String fileUrl = "https://projecteuler.net/project/resources/p067_triangle.txt";
        System.out.println("Getting txt file from " + fileUrl);
        System.out.println("The maximum sum of a path through the triangle is "+ maximumPath(readTriangleFile(fileUrl))+".");

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static int[][] readTriangleFile(String fileUrl){
        String temp[][] = new String[100][];
        try{
            URL url = new URL(fileUrl);
            Scanner s = new Scanner(url.openStream());
            for(int i=0;i<100;i++){
                temp[i]=s.nextLine().split(" ");
            }
            System.out.println("File loaded successfully.");
            s.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, make sure the url is working.");
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("Something went wrong, make sure your internet is working.");
            System.exit(0);
        }

        int count = 0;
        int triangle[][] = new int[100][];
        for(int i=0;i<temp.length;i++){
            triangle[i]=new int[temp[i].length];
            for(int j=0;j<temp[i].length;j++){
                triangle[i][j]=Integer.parseInt(temp[i][j]);
                count++;
            }
        }

        System.out.println("Triangle has "+temp.length+" rows.");
        System.out.println("Triangle has "+count+" different numbers.");
        return triangle;
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
            }
        }
        return triangle[0][0];
    }
}
