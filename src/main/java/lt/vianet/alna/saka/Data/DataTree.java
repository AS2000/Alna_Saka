package lt.vianet.alna.saka.Data;


public class DataTree {

    public TreeBranch getDataTree() {

        return addData();
    }

    private TreeBranch addData() {

        // kamienas
        TreeBranch treeTrunk = new TreeBranch();

        treeTrunk.getTreeBranches().add(new TreeBranch());
        treeTrunk.getTreeBranches().add(new TreeBranch());

        treeTrunk.getTreeBranches().get(0).getTreeBranches().add(new TreeBranch());

        treeTrunk.getTreeBranches().get(1).getTreeBranches().add(new TreeBranch());
        treeTrunk.getTreeBranches().get(1).getTreeBranches().add(new TreeBranch());
        treeTrunk.getTreeBranches().get(1).getTreeBranches().add(new TreeBranch());

        treeTrunk.getTreeBranches().get(1).getTreeBranches().get(0).getTreeBranches().add(new TreeBranch());

        treeTrunk.getTreeBranches().get(1).getTreeBranches().get(1).getTreeBranches().add(new TreeBranch());
        treeTrunk.getTreeBranches().get(1).getTreeBranches().get(1).getTreeBranches().add(new TreeBranch());

        treeTrunk.getTreeBranches().get(1).getTreeBranches().get(1).getTreeBranches().get(0).getTreeBranches().add(new TreeBranch());

        return treeTrunk;
    }

}
