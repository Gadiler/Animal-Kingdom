import java.awt.*;
import java.util.Random;

public class WhiteTiger extends Critter {
    private boolean isInfected;

    public Action getMove(CritterInfo info) {
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
        return Color.WHITE;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        if (!isInfected)
            return "tgr";

        return "TGR";
    }
}
