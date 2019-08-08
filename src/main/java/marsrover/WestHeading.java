package marsrover;

public class WestHeading extends AbstractHeading {
    @Override
    public void move(MarsRover marsRover) {
        marsRover.setX(marsRover.getX()-1);
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setHeading(new SouthHeading());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setHeading(new NorthHeading());
    }
}
