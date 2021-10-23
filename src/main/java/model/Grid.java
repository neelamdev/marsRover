package model;

public class Grid {

    private int maxWidth;
    private int maxHeight;

    public Grid(int maxWidth, int maxHeight) {
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public boolean validateValidGridSize() {
        if(maxHeight <= 0 || maxWidth <=0)
            throw new IllegalArgumentException("please provide positive values of grid coordinates");
        else
            return true;

    }

}
