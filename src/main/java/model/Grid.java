package model;

public class Grid {

    private int maxWidth;
    private int maxHeight;

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public Grid(int maxWidth, int maxHeight) {
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }

    public boolean gridInFirstQuaderant() {
        if (maxHeight <= 0 || maxWidth <= 0)
            return false;
        else
            return true;

    }

}
