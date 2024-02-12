package mars.rover;

public enum Direction {
    NORTH {
        @Override
        Direction turnLeft() {
            return WEST;
        }
        @Override
        Direction turnRight() {
            return EAST;
        }
    },
    SOUTH {
        @Override
        Direction turnLeft() {
            return EAST;
        }
        @Override
        Direction turnRight() {
            return WEST;
        }
    },
    EAST{
        @Override
        Direction turnLeft() {
            return NORTH;
        }
        @Override
        Direction turnRight() {
            return SOUTH;
        }
    },
    WEST{
        @Override
        Direction turnLeft() {
            return SOUTH;
        }
        @Override
        Direction turnRight() {
            return NORTH;
        }
    };
    abstract Direction turnLeft();
    abstract Direction turnRight();
}
