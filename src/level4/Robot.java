package level4;

import java.util.Random;

class Robot {

    String name;
    Random random = new Random();

    Robot(String name) {
        this.name = name;
    }

    String rockPaperScissors() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
