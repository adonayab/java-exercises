package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex14Alice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter word to search in Alice : ");

        // Changing the search word to lowercase (so case insenstive)
        String word = in.nextLine().toLowerCase();

//        String[] alice_words = alice.split(" ");
//        for(int i=0; i<alice_words.length; i++){
//            if (word.equals(alice_words[i])) {
//                System.out.println("\"" + word + "\" exists in Alice.");
//                break;
//            } else if (i == alice_words.length - 1) {
//                    System.out.println("\"" + word + "\" does not exist in Alice.");
//            }
//        }
//
//        for (String word1: alice_words) {
//            if (word == word1) {
//                System.out.println("\"" + word + "\" exists in Alice.");
//                break;
//            } else if (i == alice_words.length - 1) {
//                System.out.println("\"" + word + "\" does not exist in Alice.");
//            }
//        }

//        ArrayList<String> aliceWords = new ArrayList<>();
//        for (String s : alice.split(" ")) { aliceWords.add(s); }
//        if (aliceWords.contains(word)){ System.out.println("\"" + word + "\" exists in Alice."); }
//        else { System.out.println("\"" + word + "\" does not exist in Alice."); }


        // Changing the string alice to lower case
        System.out.println(alice.toLowerCase().contains(word));

    }
}
