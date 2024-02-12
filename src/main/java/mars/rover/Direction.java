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
        @Override
        String toLabel() {
            return "N";
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
        @Override
        String toLabel() {
            return "S";
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
        @Override
        String toLabel() {
            return "E";
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
        @Override
        String toLabel() {
            return "W";
        }
    };
    abstract Direction turnLeft();
    abstract Direction turnRight();
    abstract String toLabel();
}
