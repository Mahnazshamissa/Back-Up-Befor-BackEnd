import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SequenceResemblanceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a few letters!");
        String enteredLetters = scanner.nextLine();
        System.out.println("\n" + "Your entered letters are:  " + enteredLetters);

        int numberOfLetters = getNumberOfLetters(enteredLetters);
        System.out.println("\n" + "The number of letters of your input are: " + getNumberOfLetters(enteredLetters));

//        List<String> newWordFromLastEnteredLetters = (makeListOfThatInputtedLetters(enteredLetters));
//        System.out.println("\n" + "Here is a list of entered letters: " + newWordFromLastEnteredLetters);

        String newLettersMinusFirstElement = enteredLetters.substring(1);
        System.out.println("That letter minus first letter: " + newLettersMinusFirstElement);

        boolean contains = makeListOfThatInputtedLetters(enteredLetters).contains(makeListOfThatInputtedLetters(newLettersMinusFirstElement));
        System.out.println(contains);
    }


    private static Integer getNumberOfLetters(String enteredLetters) {
        return enteredLetters.length( );
    }


    private static List<String> makeListOfThatInputtedLetters(String enteredLetters) {
        List<String> splitedLetters = Arrays.asList(enteredLetters.split(""));
        return splitedLetters;
    }
}
