public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, ignor, answer = 'S';

            do {
                System.out.println("Guess the letter A-Z");
                System.out.print("Try to guess it: ");

                ch = (char) System.in.read();

                do {
                    ignor = (char) System.in.read();
                }
                while (ignor != '\n');

                if (ch == answer) System.out.println("** You guessed it! **");
                else {
                    System.out.println("... Sorry, you didn't guess :-(");
                    if (ch < answer)
                        System.out.println("near the end of the alphabet");
                    else
                        System.out.println("closer to the beginning of the alphabet");
                        System.out.println("Try again!\n");
                }
            } while (answer != '\n');
        }
    }