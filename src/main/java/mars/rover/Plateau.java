package mars.rover;

import java.util.List;
import java.util.zip.DeflaterInputStream;

public class Plateau {
    List<Rover> rovers;
    private final int topRightX;
    private final int topRightY;
    Plateau(int topRightX, int topRightY, List<Rover> rovers) {
        if (topRightY < 0 || topRightX < 0) {
            throw new IllegalArgumentException();
        }
        this.rovers = rovers;
        this.topRightY = topRightY;
        this.topRightX = topRightX;
    }
    void add(int x, int y, Direction direction) {
        if (x > topRightX || y > topRightY) {
            throw new IllegalArgumentException();
        }
        rovers.add(new Rover(x, y, direction));
    }
}
