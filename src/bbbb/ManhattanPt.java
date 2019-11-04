package bbbb;

public class ManhattanPt extends PointD {
    int x;  //fieldS
    int y;

    public ManhattanPt(int x, int y) { //Constractor
        this.x = x;
        this.y = y;
    }
    //---------------------------------------

    @Override
    public String toString() {
        return "new " + getClass().getSimpleName() + "(" + x + "," + y + ")";
    }

}
