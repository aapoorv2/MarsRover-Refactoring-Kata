package mars.rover;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void testThrowingAnExceptionForSettingUpARoverWithInvalidInitialCoordinates() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rover(-1, -2, Direction.NORTH);
        });
    }
    @Test
    void acceptance_test_1() {
        Rover rover = new Rover(1, 2, Direction.NORTH);
        List<Instruction> instructions = new ArrayList<>(Arrays.asList(Instruction.LEFT, Instruction.MOVE, Instruction.LEFT,
        Instruction.MOVE, Instruction.LEFT, Instruction.MOVE, Instruction.LEFT, Instruction.MOVE, Instruction.MOVE));

        rover.move(instructions);

        assertEquals("1 3 N", rover.position());
    }
    @Test
    void acceptance_test_2() {
        Rover rover = new Rover(3, 3, Direction.EAST);
        List<Instruction> instructions = new ArrayList<>(Arrays.asList(Instruction.MOVE, Instruction.MOVE, Instruction.RIGHT,
                Instruction.MOVE, Instruction.MOVE, Instruction.RIGHT, Instruction.MOVE, Instruction.RIGHT, Instruction.RIGHT,
                Instruction.MOVE));

        rover.move(instructions);

        assertEquals("5 1 E", rover.position());
    }

}