package class3;

import java.util.*;

class TreeNode {
    int val;
    List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

 class TreeLevelTraversal {
    public static void printLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                System.out.println(  node.val + "    --    " + levelSize);

                for (TreeNode child : node.children) {
                    queue.offer(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.children.add(new TreeNode(1));
        root.children.add(new TreeNode(2));
        root.children.get(0).children.add(new TreeNode(3));
        root.children.get(0).children.add(new TreeNode(4));
        root.children.get(0).children.add(new TreeNode(5));
        root.children.get(1).children.add(new TreeNode(5));
        root.children.get(1).children.add(new TreeNode(6));
        root.children.get(1).children.get(1).children.add(new TreeNode(7));

        System.out.println("Node and Level:");
        printLevels(root);
    }
}