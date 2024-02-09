package mars.rover;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    Rover(int x, int y, Direction direction) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }
}
