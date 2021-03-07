import java.awt.*;
import java.util.Random;

import static java.util.Random.*;

public class Tiger extends Critter {
    private int moves = 0;
    private Color myColor;


    public Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront().equals(Neighbor.OTHER))
            return Action.INFECT;
        else if (info.getFront().equals(Neighbor.WALL) || info.getRight().equals(Neighbor.WALL))
            return Action.LEFT;
        else if (info.getFront().equals(Neighbor.SAME))
            return Action.RIGHT;

        return Action.HOP;
    }

    // This method should be overriden (default color is black)
    public Color getColor() {
        if (moves == 3 || moves == 0) {
            moves = 0;
            randomColor();
        }
        return myColor;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        return "TGR";
    }

    private void randomColor() {
        int color = new Random().nextInt(3) + 1;

        switch (color) {
            case 1:
                myColor = Color.BLUE;
                break;

            case 2:
                myColor = Color.RED;
                break;

            case 3:
                myColor = Color.GREEN;
                break;
        }
    }
}
