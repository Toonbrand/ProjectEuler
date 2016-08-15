package nl.toonbrand.projecteuler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by toon on 8/12/16.
 */
public class ProjectEuler24 {
    static ArrayList<String> permutations = new ArrayList<String>();

    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        permutation("0123456789");
        Collections.sort(permutations);
        System.out.println(permutations.get(1_000_000-1));

        final long endTime = System.currentTimeMillis();
        System.out.println("\n[Execution time: " + (endTime - startTime) + " milliseconds]");
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
