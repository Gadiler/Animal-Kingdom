import java.awt.*;

public class Giant extends Critter {
    private int moves;
    private String myName;

    public Action getMove(CritterInfo info) {
        moves++;
        return Action.LEFT;
    }

    // This method should be overriden (default color is black)
    public Color getColor() {
        return Color.GRAY;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        if (moves < 6) {
            myName = "fee";
        } else if (moves >= 6 && moves < 12) {
            myName = "fie";
        } else if (moves >= 12 && moves < 18) {
            myName = "foe";
        } else if (moves >= 18 && moves < 24) {
            myName = "fum";
        } else if (moves >= 24) {
            moves = 0;
            myName ="fee";
        }

        return myName;
    }


}
