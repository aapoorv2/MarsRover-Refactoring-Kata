package mars.rover;

import mars.rover.exceptions.InvalidRoverCoordinatesException;
import mars.rover.exceptions.OutOfPlateauException;

import java.util.List;

public class Rover {
    private int XCoordinate;
    private int YCoordinate;
    private Direction direction;
    private final RoverCPU cpu;
    private final int MAX_X_COORDINATE = 10;
    private final int MAX_Y_COORDINATE = 10;
    Rover(int XCoordinate, int YCoordinate, Direction direction) {
        if (XCoordinate < 0 || YCoordinate < 0 || XCoordinate > MAX_X_COORDINATE || YCoordinate > MAX_Y_COORDINATE) {
            throw new InvalidRoverCoordinatesException();
        }
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
        this.direction = direction;
        this.cpu = new RoverCPU();
    }
    void move(String instructions) {
        List<Instruction> instructionList = CommandLineInterpreter.convertToList(instructions);
        for (Instruction instruction : instructionList) {
            if (instruction != Instruction.MOVE) {
                this.direction = cpu.computeDirection(this.direction, instruction);
            } else {
                int newXCoordinate = this.XCoordinate + cpu.computeXAxisMovement(this.direction);
                int newYCoordinate = this.YCoordinate + cpu.computeYAxisMovement(this.direction);
                if (newXCoordinate < 0 || newYCoordinate < 0 || newXCoordinate > MAX_X_COORDINATE || newYCoordinate > MAX_Y_COORDINATE) {
                    throw new OutOfPlateauException();
                }
                this.XCoordinate = newXCoordinate;
                this.YCoordinate = newYCoordinate;
            }
        }
    }
    String position() {
        return XCoordinate + " " + YCoordinate + " " + direction.toLabel();
    }
}
