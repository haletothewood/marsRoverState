package marsrover;

public class SouthHeading extends AbstractHeading {
    @Override
    public void move(MarsRover marsRover) {
        marsRover.setY(marsRover.getY() - 1);
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setHeading(new EastHeading());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setHeading(new WestHeading());
    }
}
