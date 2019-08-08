package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverFeature {

    @Test
    void moveForward() {
        MarsRover marsRover = new MarsRover(1, 1, new NorthHeading());
        marsRover.move();
        assertThat(marsRover.getY()).isEqualTo(2);
    }

    @Test
    void moveAroundByTurningRightAndBackToWhereItWas() {
        MarsRover marsRover = new MarsRover(1, 1, new NorthHeading());
        marsRover.move();
        marsRover.turnRight();
        marsRover.move();
        marsRover.turnRight();
        marsRover.move();
        marsRover.turnRight();
        marsRover.move();
        marsRover.turnRight();
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getHeading()).isEqualTo(new NorthHeading());
    }

    @Test
    void moveAroundByTurningLeftAndBackToWhereItWas() {
        MarsRover marsRover = new MarsRover(2, 2, new WestHeading());
        marsRover.move();
        marsRover.turnLeft();
        marsRover.move();
        marsRover.turnLeft();
        marsRover.move();
        marsRover.turnLeft();
        marsRover.move();
        marsRover.turnLeft();
        assertThat(marsRover.getX()).isEqualTo(2);
        assertThat(marsRover.getY()).isEqualTo(2);
        assertThat(marsRover.getHeading()).isEqualTo(new WestHeading());
    }
}
