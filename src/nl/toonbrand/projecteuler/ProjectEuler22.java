package nl.toonbrand.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toon on 8/12/16.
 */
public class ProjectEuler22 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        String[] names = readNamesFile("p022_names.txt");
        System.out.println("There are " + names.length + " names in the file. \nThe total score of all names is " + calculateNameScore(names));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static String[] readNamesFile(String fileName){
        File file = new File(fileName);
        String fileContent = "";

        try{
            Scanner sc = new Scanner(file);
            fileContent = sc.next().replace("\"", "");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        String[] fileArray = fileContent.split(",");

        return fileArray;
    }

    public static long calculateNameScore(String[] names){
        long scoreTotal=0;
        Arrays.sort(names);

        for(int i=0;i<names.length;i++){
            int nameScore = 0;
            int posScore = i+1;

            for(int j=0;j<names[i].length();j++){
                char c = names[i].charAt(j);
                nameScore += (c-64);
            }

            scoreTotal += (nameScore*posScore);
        }
        return scoreTotal;
    }
}

