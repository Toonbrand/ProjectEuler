package nl.toonbrand.test;

import java.lang.reflect.Array;

/**
 * Created by toon on 8/10/16.
 */
public class ProjectEuler15 {
    public static void main(String[] args) {
        long[][] field = new long[21][21];
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
    }
}
