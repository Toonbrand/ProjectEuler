package nl.toonbrand.projecteuler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by toon on 8/22/16.
 */
public class ProjectEuler42 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        String fileUrl = "https://projecteuler.net/project/resources/p042_words.txt";
        System.out.println("Getting txt file from " + fileUrl);
        System.out.println("Number of name scores which are triangle numbers: "+numberOfTriangleNames(fileUrl));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static String[] readNamesFile(String fileUrl){
        String fileContent = "";

        try{
            URL url = new URL(fileUrl);
            Scanner s = new Scanner(url.openStream());
            fileContent = s.next().replace("\"", "");
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

        System.out.println("File successfully loaded");
        return fileArray;
    }

    public static int nameScore(String name){
        int sum=0;
        name = name.toUpperCase();

        for (int i=0;i<name.length();i++){
            char c = name.charAt(i);
            sum += (name.charAt(i)-64);
        }

        return sum;
    }

    public static int[] triangleNumbers(int max){
        int[] triangleNumbers = new int[max];

        for(int i=0;i<max;i++){
            triangleNumbers[i]=(int)(0.5*i*(i+1));
        }

        return triangleNumbers;
    }

    public static int numberOfTriangleNames(String fileUrl){
        int counter=0;
        String[] names = readNamesFile(fileUrl);
        int[] numbers = triangleNumbers(20);

        System.out.println("Number of names in file: "+names.length);

        for(int i=0;i<names.length;i++){
            int nameScore = nameScore(names[i]);
            for(int j=0;j<numbers.length;j++){
                if(nameScore==numbers[j]){
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}
