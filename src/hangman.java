public class hangman {
    private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {

    }

    public static void hangmanImage() {
        if (count == 1)
            System.out.println("Wrong guess please try again.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("----|----");
        System.out.println("");

    }
}
