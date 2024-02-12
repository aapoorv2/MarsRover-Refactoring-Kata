package mars.rover;

import java.util.List;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private final RoverCPU cpu;
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
        for (Instruction instruction : instructions) {
            if (instruction != Instruction.MOVE) {
                this.direction = cpu.computeDirection(this.direction, instruction);
            } else {
                this.x += cpu.computeXAxisMovement(this.direction);
                this.y += cpu.computeYAxisMovement(this.direction);
            }
        }
    }
    String position() {
        String coordinates = x + " " + y;
        if (this.direction == Direction.NORTH) return coordinates + " N";
        if (this.direction == Direction.EAST) return coordinates + " E";
        if (this.direction == Direction.WEST) return coordinates + " W";
        else return coordinates + " S";
    }
}
