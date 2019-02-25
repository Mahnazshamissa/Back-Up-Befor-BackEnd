package week4Exercises.exe12;

import java.util.List;

public class GotApplication {
    public static void main(String[] args) {

        CharacterReader characterReader = new CharacterReader();
        List<Character> characters = characterReader.toCharacters();

        System.out.println("How many characters appear in the books in total?");
        System.out.println("Number of characters: " + characters.size());

        System.out.println("How many characters died?");
        System.out.println();

    }
}
