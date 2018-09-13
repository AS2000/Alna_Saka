package lt.vianet.alna.saka.actions;

import lt.vianet.alna.saka.Data.DataTree;
import lt.vianet.alna.saka.Data.TreeBranch;
import lt.vianet.alna.saka.calculation.CalculateBranches;
import lt.vianet.alna.saka.io.PrintAll;

public class Actions {

    public void startApp() {
        countBranches();
    }


    private void countBranches() {

        int longestTreeTrank = countTreeBranches(getDataTree());

        printBranches(longestTreeTrank);
    }


    private TreeBranch getDataTree() {

        return new DataTree().getDataTree();
    }


    private int countTreeBranches(TreeBranch treeTrunk) {

        return new CalculateBranches().getLongestTrank(treeTrunk);
    }


    private void printBranches(int longestTreeTrank) {
        new PrintAll().printBranches(longestTreeTrank);
    }
}
