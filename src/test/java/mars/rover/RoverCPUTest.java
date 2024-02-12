package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverCPUTest {
    @Test
    void testChangingDirectionToWESTWhenRotatingLEFTFromNORTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.NORTH, Instruction.LEFT);

        assertEquals(Direction.WEST, direction);
    }
    @Test
    void testChangingDirectionToSOUTHWhenRotatingLEFTFromWEST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.WEST, Instruction.LEFT);

        assertEquals(Direction.SOUTH, direction);
    }
    @Test
    void testChangingDirectionToEASTWhenRotatingLEFTFromSOUTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.SOUTH, Instruction.LEFT);

        assertEquals(Direction.EAST, direction);
    }
    @Test
    void testChangingDirectionToNORTHWhenRotatingLEFTFromEAST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.EAST, Instruction.LEFT);

        assertEquals(Direction.NORTH, direction);
    }
    @Test
    void testChangingDirectionToEASTWhenRotatingRIGHTFromNORTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.NORTH, Instruction.RIGHT);

        assertEquals(Direction.EAST, direction);
    }
    @Test
    void testChangingDirectionToSOUTHWhenRotatingRIGHTFromEAST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.EAST, Instruction.RIGHT);

        assertEquals(Direction.SOUTH, direction);
    }
    @Test
    void testChangingDirectionToWESTWhenRotatingRIGHTFromSOUTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.SOUTH, Instruction.RIGHT);

        assertEquals(Direction.WEST, direction);
    }
    @Test
    void testChangingDirectionToNORTHWhenRotatingRIGHTFromWEST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.computeDirection(Direction.WEST, Instruction.RIGHT);

        assertEquals(Direction.NORTH, direction);
    }
    @Test
    void testComputingMovementInTheXAxis() {
        RoverCPU cpu = new RoverCPU();

        assertEquals(0, cpu.computeXAxisMovement(Direction.NORTH));
        assertEquals(0, cpu.computeXAxisMovement(Direction.SOUTH));
        assertEquals(1, cpu.computeXAxisMovement(Direction.EAST));
        assertEquals(-1, cpu.computeXAxisMovement(Direction.WEST));
    }
    @Test
    void testComputingMovementInTheYAxis() {
        RoverCPU cpu = new RoverCPU();

        assertEquals(1, cpu.computeYAxisMovement(Direction.NORTH));
        assertEquals(-1, cpu.computeYAxisMovement(Direction.SOUTH));
        assertEquals(0, cpu.computeYAxisMovement(Direction.EAST));
        assertEquals(0, cpu.computeYAxisMovement(Direction.WEST));
    }

}