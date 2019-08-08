package marsrover;

public class EastHeading extends AbstractHeading {
    @Override
    public void move(MarsRover marsRover) {
        marsRover.setX(marsRover.getX() + 1);
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setHeading(new NorthHeading());

    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setHeading(new SouthHeading());
    }
}
