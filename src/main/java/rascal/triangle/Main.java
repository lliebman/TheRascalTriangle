package rascal.triangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RascalInputReader inputReader = new RascalInputReader(args[0]);
        List<DataSet> dataSets = inputReader.getCases();
        for (DataSet set : dataSets) {
            System.out.println(set.toString());
        }
    }
}
