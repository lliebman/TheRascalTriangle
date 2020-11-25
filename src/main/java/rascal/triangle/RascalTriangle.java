package rascal.triangle;

public class RascalTriangle {

    DataSet dataSet;

    public RascalTriangle(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public int getNum() {
        int midpoint = dataSet.getIndex() / 2; //double check this is right

        int index =

        if (dataSet.getRow() % 2 == 0) { //odd

        }
        else { //even
            int numValue = 1;
            for (int rowIndex = 0; rowIndex != 0; increment-=2) {
                numValue += increment - 2;
                rowIndex++;
            }

        }
        return -1;
    }

}
