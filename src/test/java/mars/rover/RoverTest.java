package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void testThrowingAnExceptionForSettingUpARoverWithInvalidInitialCoordinates() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rover(-1, -2, Direction.NORTH);
        });
    }

}