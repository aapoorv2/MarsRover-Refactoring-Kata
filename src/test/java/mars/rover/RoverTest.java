package mars.rover;

import mars.rover.exceptions.InvalidRoverCoordinatesException;
import mars.rover.exceptions.OutOfPlateauException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void testThrowingAnExceptionForSettingUpARoverWithInvalidInitialCoordinates() {
        assertThrows(InvalidRoverCoordinatesException.class, () -> {
            new Rover(-1, -2, Direction.NORTH);
        });
    }
    @Test
    void testMovingARoverInPositiveXDirection() {
        Rover rover = new Rover(0, 0, Direction.EAST);

        rover.move("MM");

        assertEquals("2 0 E", rover.position());
    }
    @Test
    void testMovingARoverInPositiveYDirection() {
        Rover rover = new Rover(0, 0, Direction.NORTH);

        rover.move("M");

        assertEquals("0 1 N", rover.position());
    }
    @Test
    void testMovingARoverInNegativeYDirection() {
        Rover rover = new Rover(1, 1, Direction.SOUTH);

        rover.move("M");

        assertEquals("1 0 S", rover.position());
    }
    @Test
    void testMovingARoverInNegativeXDirection() {
        Rover rover = new Rover(1, 1, Direction.WEST);

        rover.move("M");

        assertEquals("0 1 W", rover.position());
    }
    @Test
    void testThrowingAnExceptionWhenRoverFallsOutOfThePlateau() {
        Rover rover = new Rover(1, 1, Direction.WEST);

        assertThrows(OutOfPlateauException.class, () -> {
            rover.move("MM");
        });

    }
    @Test
    void testRotatingARoverRight() {
        Rover rover = new Rover(0, 0, Direction.NORTH);

        rover.move("R");

        assertEquals("0 0 E", rover.position());
    }
    @Test
    void testRotatingARoverLeft() {
        Rover rover = new Rover(0, 0, Direction.NORTH);

        rover.move("L");

        assertEquals("0 0 W", rover.position());
    }
    @Test
    void acceptance_test_1() {
        Rover rover = new Rover(1, 2, Direction.NORTH);

        rover.move("LMLMLMLMM");

        assertEquals("1 3 N", rover.position());
    }
    @Test
    void acceptance_test_2() {
        Rover rover = new Rover(3, 3, Direction.EAST);

        rover.move("MMRMMRMRRM");

        assertEquals("5 1 E", rover.position());
    }

}