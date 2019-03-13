package exercises;
import java.util.ArrayList;

public class Ex22LettersInWord {

  public static void main(String[] args) {

    String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
            " and of having nothing to do: once or twice she had peeped into the book her " +
            "sister was reading, but it had no pictures or conversations in it, " +
            "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

    ArrayList<String> words = new ArrayList<>();
    for (String s: alice.split(" ")) words.add(s);

    fiveCounter(words);
  }

  static void fiveCounter(ArrayList<String> words) {
    for (String word: words) {
      if (word.length() == 5) System.out.println(word);
    }
  }



}
