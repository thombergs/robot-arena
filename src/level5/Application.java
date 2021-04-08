package level5;

import java.util.Optional;

class Application {

    public static void main(String[] args) {
        Robot c3po = new Robot("C3PO");
        Robot r2d2 = new Robot("R2D2");

        Arena arena = new Arena(c3po, r2d2);
        Optional<Robot> winner = arena.startDuel();
        if (winner.isEmpty()) {
            System.out.println("Draw!");
        } else {
            System.out.println(winner.get().name + " wins!");
        }
    }

}
