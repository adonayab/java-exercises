package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//    String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut" +
//            " ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo." +
//            " Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum " +
//            "augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula" +
//            " efficitur luctus.";
//    char[] chars = sample.toCharArray();

        String userString = in.nextLine();
        char[] chars = userString.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();
        int count = 0;

//    for (char i: chars) {
//      for (char j: chars) {
//        if (i == j) {
//          count ++;
//        }
//      }
//      counts.put(i, count);
//      count = 0;
//    }

        for (char i: chars) {
            if (Character.isAlphabetic(i)) {
                if (counts.containsKey(Character.toLowerCase(i))) continue;
                for (char j : chars) {
                    if (i == j | i == Character.toUpperCase(j) | i == Character.toLowerCase(j)) {
                        count++;
                    }
                }
                counts.put(i, count);
                count = 0;
            }
        }



        for (Map.Entry<Character, Integer> counter: counts.entrySet())
            System.out.println(counter.getKey() + ": " + counter.getValue());


    }
}
