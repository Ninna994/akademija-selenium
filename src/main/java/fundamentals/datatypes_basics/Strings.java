package fundamentals.datatypes_basics;

public class Strings {
    public static void main(String[] args) {
        String sentence = "I love testing and Quality Assurance";
         countWords(sentence);
         reverseString(sentence);
         reverseStringBuilder();
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        // I'm going to use “%d”, which is a placeholder for a number. And then the second argument is what should we replace “%d” with.
        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static  void reverseStringBuilder(){
        String toReverse = "Nikolina";
        StringBuilder sb = new StringBuilder();
        sb.append(toReverse);
        sb.reverse();
        System.out.println(sb);
    }
}
