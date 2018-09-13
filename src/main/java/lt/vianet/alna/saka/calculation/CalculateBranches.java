package lt.vianet.alna.saka.calculation;

import lt.vianet.alna.saka.Data.TreeBranch;

public class CalculateBranches {

    private int longestTrank = 0;
    private int branchQty = 1;

    public int getLongestTrank(TreeBranch treeTrunk) {

        if (!countBranches(treeTrunk)) {

            return longestTrank;
        }

        return longestTrank = 0;
    }


    private boolean countBranches(TreeBranch treeTrunk) {

        if (treeTrunk.getTreeBranches().isEmpty()) {

            if (branchQty > longestTrank) {
                longestTrank = branchQty;
            }

            return false;
        }

        branchQty++;

        for (int i = 0; i < treeTrunk.getTreeBranches().size(); i++) {

            if (countBranches(treeTrunk.getTreeBranches().get(i))) {
                return true;
            }
        }

        branchQty--;

        return false;
    }
}
