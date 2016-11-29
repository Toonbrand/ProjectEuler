package nl.toonbrand.projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toon on 8/12/16.
 */
public class ProjectEuler22 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        String fileUrl = "https://projecteuler.net/project/resources/p022_names.txt";
        System.out.println("Getting txt file from " + fileUrl);
        String[] names = readNamesFile(fileUrl);
        System.out.println("\nThere are " + names.length + " names in the file. \nThe total score of all names is " + calculateNameScore(names));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static String[] readNamesFile(String fileUrl){
        String fileContent = "";

        try{
            URL url = new URL(fileUrl);
            Scanner s = new Scanner(url.openStream());
            fileContent = s.next().replace("\"", "");
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

