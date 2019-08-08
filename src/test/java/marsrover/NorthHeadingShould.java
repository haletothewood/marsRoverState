package marsrover;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NorthHeadingShould {
    @Test
    void increase_rover_y_when_move() {

        Heading headingNorth = new NorthHeading();
        MarsRover marsRover = new MarsRover(1, 1, headingNorth);

        headingNorth.move(marsRover);
        assertThat(marsRover.getY()).isEqualTo(2);
    }

    @Test
    void change_mars_rover_heading_to_west_heading_when_turn_left_command_given() {
        Heading headingNorth = new NorthHeading();
        MarsRover marsRover = new MarsRover(1, 1, headingNorth);

        headingNorth.turnLeft(marsRover);
        assertThat(marsRover.getHeading()).isEqualTo(new WestHeading());
    }
}
