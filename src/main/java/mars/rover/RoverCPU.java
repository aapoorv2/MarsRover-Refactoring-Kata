package mars.rover;

public class RoverCPU {
    Direction computeDirection(Direction direction, Instruction instruction) {
        if (instruction == Instruction.LEFT) {
            return direction.turnLeft();
        } else {
            return direction.turnRight();
        }
    }
    int computeYAxisMovement(Direction direction) {
        if (direction == Direction.NORTH) return 1;
        else if (direction == Direction.SOUTH) return -1;
        else return 0;
    }
    int computeXAxisMovement(Direction direction) {
        if (direction == Direction.EAST) return 1;
        else if (direction == Direction.WEST) return -1;
        else return 0;
    }
}
