package rascal.triangle;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RascalInputReader {

    private final List<DataSet> dataSets = new ArrayList<>();

    public RascalInputReader(String file) {
        try {
            Scanner inputFile = new Scanner(new File(file));
            int numDataSets = inputFile.nextInt();
            for (int i = 1; i <= numDataSets; i++) {
                DataSet dataSet = new DataSet(inputFile.nextInt(),
                        inputFile.nextInt(),
                        inputFile.nextInt());
                dataSets.add(dataSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<DataSet> getCases() {
        return dataSets;
    }
}
