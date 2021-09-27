public class Grid {

    int maxWidth;
    int minHeight;

    public Grid(int maxWidth, int minHeight) {
        this.maxWidth = maxWidth;
        this.minHeight = minHeight;
    }

    public boolean gridInFirstQuaderant() {
        if (minHeight <= 0 || maxWidth <= 0)
            return false;
        else
            return true;

    }

}
