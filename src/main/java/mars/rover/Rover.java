package mars.rover;

import java.util.List;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private RoverCPU cpu;
    Rover(int x, int y, Direction direction) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.cpu = new RoverCPU();
    }
    void move(List<Instruction> instructions) {

    }
}
