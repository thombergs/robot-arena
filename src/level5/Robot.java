package level5;

import java.util.Random;

class Robot {

    String name;
    Random random = new Random();

    Robot(String name) {
        this.name = name;
    }

    Shape rockPaperScissors() {
        int randomNumber = random.nextInt(3);
        return Shape.values()[randomNumber];
    }

}
