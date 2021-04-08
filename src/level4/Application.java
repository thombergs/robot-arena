package level4;

class Application {

    public static void main(String[] args) {
        Robot c3po = new Robot("C3PO");
        Robot r2d2 = new Robot("R2D2");

        Arena arena = new Arena(c3po, r2d2);
        Robot winner = arena.startDuel();
        if (winner == null) {
            System.out.println("Draw!");
        } else {
            System.out.println(winner.name + " wins!");
        }
    }

}
