package rascal.triangle;

public class RascalTriangle {

    DataSet dataSet;

    public RascalTriangle(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public int getNum() {
        int midpoint = dataSet.getRow() / 2;
        int row = dataSet.getRow();
        int col = dataSet.getCol();
        int index = col;
        int num = 1;
        int increment = row - 1;

        if (midpoint > col) {
            index = row - col;
        }
        for (int rowIndex = 0; rowIndex != index; rowIndex++) {
            num += increment;increment -= 2;
        }
        return num;
    }

}
