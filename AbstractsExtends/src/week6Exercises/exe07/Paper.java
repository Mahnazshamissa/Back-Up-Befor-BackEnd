package week6Exercises.exe07;

public class Paper implements Move {

    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("rock");
    }
}
