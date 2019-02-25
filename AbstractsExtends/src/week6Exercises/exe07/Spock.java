package week6Exercises.exe07;

public class Spock implements Move {

    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("rock");
    }
}
