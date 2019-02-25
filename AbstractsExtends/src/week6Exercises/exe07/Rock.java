package week6Exercises.exe07;

public class Rock implements Move {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("scissors");
    }
}
