package level5;

import java.util.Optional;

class Arena {

    Robot robot1;
    Robot robot2;

    Arena(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }

    Optional<Robot> startDuel() {
        Shape robot1Shape = robot1.rockPaperScissors();
        Shape robot2Shape = robot2.rockPaperScissors();

        System.out.println(robot1.name + ": " + robot1Shape.name);
        System.out.println(robot2.name + ": " + robot2Shape.name);

        if (robot1Shape.beats(robot2Shape)) {
            return Optional.of(robot1);
        } else if (robot2Shape.beats(robot1Shape)) {
            return Optional.of(robot2);
        } else {
            return Optional.empty();
        }
    }
}
