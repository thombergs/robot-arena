package level5;

public enum Shape {

    ROCK("rock", "scissors"),

    PAPER("paper", "rock"),

    SCISSORS("scissors", "paper");

    String name;

    String beats;

    Shape(String name, String beats) {
        this.name = name;
        this.beats = beats;
    }

    boolean beats(Shape otherShape) {
        return otherShape.name.equals(this.beats);
    }
}
