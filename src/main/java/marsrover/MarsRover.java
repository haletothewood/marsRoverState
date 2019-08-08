package marsrover;

public class MarsRover {
    private  int x;
    private  int y;
    private  Heading heading;

    public MarsRover(int x, int y, Heading startDirection) {

        this.x = x;
        this.y = y;
        this.heading = startDirection;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Heading getHeading() {
        return heading;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    public void move() {
        this.heading.move(this);
    }

    public void turnRight() {
        this.heading.turnRight(this);
    }

    public void turnLeft() {
        this.heading.turnLeft(this);
    }
}
