package week6Exercises.exe07;

public class Scissors implements Move {
    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("paper");
    }
}
