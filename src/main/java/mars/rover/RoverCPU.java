package mars.rover;

public class RoverCPU {
    Direction compute(Direction direction, Instruction instruction) {
        if (instruction == Instruction.LEFT) {
            if (direction == Direction.NORTH) return Direction.WEST;
            else if (direction == Direction.WEST) return Direction.SOUTH;
            else if (direction == Direction.SOUTH) return Direction.EAST;
            else return Direction.NORTH;
        } else {
            if (direction == Direction.NORTH) return Direction.EAST;
            else if (direction == Direction.EAST) return Direction.SOUTH;
            else if (direction == Direction.SOUTH) return Direction.WEST;
            else return Direction.NORTH;
        }
    }
}
