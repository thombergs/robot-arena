package level4;

class Arena {

    Robot robot1;
    Robot robot2;

    Arena(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }

    Robot startDuel() {
        String robot1Shape = robot1.rockPaperScissors();
        String robot2Shape = robot2.rockPaperScissors();

        System.out.println(robot1.name + ": " + robot1Shape);
        System.out.println(robot2.name + ": " + robot2Shape);

        if (robot1Shape.equals("rock") && robot2Shape.equals("scissors")) {
            return robot1;
        } else if (robot1Shape.equals("paper") && robot2Shape.equals("rock")) {
            return robot1;
        } else if (robot1Shape.equals("scissors") && robot2Shape.equals("paper")) {
            return robot1;
        } else if (robot2Shape.equals("rock") && robot1Shape.equals("scissors")) {
            return robot2;
        } else if (robot2Shape.equals("paper") && robot1Shape.equals("rock")) {
            return robot2;
        } else if (robot2Shape.equals("scissors") && robot1Shape.equals("paper")) {
            return robot2;
        } else {
            return null;
        }
    }
}
