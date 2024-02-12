package mars.rover;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlateauTest {
    @Test
    void testThrowingAnExceptionWhenPlateauHasNonPositiveTopRightCoords() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Plateau(-1, -2, new ArrayList<>());
        });
    }
    @Test
    void testThrowingAnExceptionWhenPlacingARoverOutOfBounds() {
        Plateau plateau = new Plateau(2, 2, new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> {
            plateau.add(3, 3, Direction.NORTH);
        });
    }

}