package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {
    @Test
    void turnLeft() {
        Heading initialHeading = new NorthHeading();
        MarsRover marsRover = new MarsRover(1, 1, initialHeading);

        marsRover.turnLeft();
        assertThat(marsRover.getHeading()).isEqualTo(new WestHeading());
    }

    @Test
    void turnRight() {
        Heading initialHeading = new NorthHeading();
        MarsRover marsRover = new MarsRover(1, 1, initialHeading);

        marsRover.turnRight();
        assertThat(marsRover.getHeading()).isEqualTo(new EastHeading());
    }
}
