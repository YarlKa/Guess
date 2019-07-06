public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, answer = 'S';

            System.out.println("Guess the letter");
            System.out.print("Try to guess it: ");

            ch = (char) System.in.read();

            if (ch == answer) System.out.println("** You guessed it! **");
            else System.out.println("... Sorry, you didn't guess :-(");
        }
    }