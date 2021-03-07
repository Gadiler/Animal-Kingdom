import java.awt.*;

public class NinjaCat extends Critter {
    public Action getMove(CritterInfo info) {
        if(info.getRight().equals(Neighbor.OTHER))
            return Action.INFECT;

        return Action.LEFT;
    }

    // This method should be overriden (default color is black)
    public Color getColor() {
        return Color.PINK;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        return "()";
    }
}
