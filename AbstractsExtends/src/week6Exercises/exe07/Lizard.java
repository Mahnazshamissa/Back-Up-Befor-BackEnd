package week6Exercises.exe07;

public class Lizard implements Move {

    @Override
    public String getName() {
        return "Lizard";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("rock");
    }
}
