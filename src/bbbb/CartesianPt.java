package bbbb;

public class CartesianPt extends PointD {
    int x;
    int y;

    public CartesianPt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //---------------------------------------


    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + "," + y + ")";
    }
}
