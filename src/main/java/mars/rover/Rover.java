package mars.rover;

import mars.rover.exceptions.InvalidRoverCoordinatesException;
import mars.rover.exceptions.OutOfPlateauException;

import java.util.List;

public class Rover {
    private int XCoordinate;
    private int YCoordinate;
    private Direction direction;
    private final RoverCPU cpu;
    Rover(int XCoordinate, int YCoordinate, Direction direction) {
        if (XCoordinate < 0 || YCoordinate < 0) {
            throw new InvalidRoverCoordinatesException();
        }
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
        this.direction = direction;
        this.cpu = new RoverCPU();
    }
    void move(List<Instruction> instructions) {
        for (Instruction instruction : instructions) {
            if (instruction != Instruction.MOVE) {
                this.direction = cpu.computeDirection(this.direction, instruction);
            } else {
                int newXCoordinate = this.XCoordinate + cpu.computeXAxisMovement(this.direction);
                int newYCoordinate = this.YCoordinate + cpu.computeYAxisMovement(this.direction);
                if (newXCoordinate < 0 || newYCoordinate < 0) {
                    throw new OutOfPlateauException();
                }
                this.XCoordinate = newXCoordinate;
                this.YCoordinate = newYCoordinate;
            }
        }
    }
    String position() {
        String coordinates = XCoordinate + " " + YCoordinate;
        if (this.direction == Direction.NORTH) return coordinates + " N";
        if (this.direction == Direction.EAST) return coordinates + " E";
        if (this.direction == Direction.WEST) return coordinates + " W";
        else return coordinates + " S";
    }
}
