package rascal.triangle;

public class DataSet {

    private final int index;
    private final int row;
    private final int col;
    private final int number;

    public DataSet(int index, int row, int col) {
        this.index = index;
        this.row = row;
        this.col = col;
        this.number = new RascalTriangle(this).getNum();
    }

    public int getIndex() {
        return index;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return this.index + " " + this.number;
    }
}
