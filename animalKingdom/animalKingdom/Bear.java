import java.awt.*;

public class Bear extends Critter {
    private boolean isPolar;
    private int isEven = 0;

    public Bear(Boolean polar) {
        this.isPolar = polar;
    }

    public Action getMove(CritterInfo info) {
        isEven++;
        if (info.getFront().equals(Neighbor.OTHER))
            return Action.INFECT;
        else if (info.getFront().equals(Neighbor.EMPTY))
            return Action.HOP;

        return Action.LEFT;
    }


    public Color getColor() {
        if (isPolar)
            return Color.WHITE;

        return Color.BLACK;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        if (isEven % 2 == 0)
            return "/";

        return "\\";
    }
}
