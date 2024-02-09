package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverCPUTest {
    @Test
    void testChangingDirectionToWESTWhenRotatingLEFTFromNORTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.NORTH, Instruction.LEFT);

        assertEquals(Direction.WEST, direction);
    }
    @Test
    void testChangingDirectionToSOUTHWhenRotatingLEFTFromWEST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.WEST, Instruction.LEFT);

        assertEquals(Direction.SOUTH, direction);
    }
    @Test
    void testChangingDirectionToEASTWhenRotatingLEFTFromSOUTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.SOUTH, Instruction.LEFT);

        assertEquals(Direction.EAST, direction);
    }
    @Test
    void testChangingDirectionToNORTHWhenRotatingLEFTFromEAST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.EAST, Instruction.LEFT);

        assertEquals(Direction.NORTH, direction);
    }
    @Test
    void testChangingDirectionToEASTWhenRotatingRIGHTFromNORTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.NORTH, Instruction.RIGHT);

        assertEquals(Direction.EAST, direction);
    }
    @Test
    void testChangingDirectionToSOUTHWhenRotatingRIGHTFromEAST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.EAST, Instruction.RIGHT);

        assertEquals(Direction.SOUTH, direction);
    }
    @Test
    void testChangingDirectionToWESTWhenRotatingRIGHTFromSOUTH() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.SOUTH, Instruction.RIGHT);

        assertEquals(Direction.WEST, direction);
    }
    @Test
    void testChangingDirectionToNORTHWhenRotatingRIGHTFromWEST() {
        RoverCPU cpu = new RoverCPU();

        Direction direction = cpu.compute(Direction.WEST, Instruction.RIGHT);

        assertEquals(Direction.NORTH, direction);
    }

}