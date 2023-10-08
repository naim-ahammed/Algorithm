package class3;

import java.util.LinkedList;
import java.util.Queue;

class LevelNodeBfs {
        int data;
        int level;
    LevelNodeBfs left;
    LevelNodeBfs right;

        public LevelNodeBfs(int data) {
            this.data = data;
            this.level = 0;
            this.left = null;
            this.right = null;
        }
    }

    public class FindLevelOfEachNodeUsingBFS {

        public static void findLevel(LevelNodeBfs root) {
            if (root == null) {
                return;
            }

            Queue<LevelNodeBfs> queue = new LinkedList<>();
            queue.add(root);
            root.level = 1;

            while (!queue.isEmpty()) {
                LevelNodeBfs node = queue.poll();

                if (node.left != null) {
                    node.left.level = node.level + 1;
                    queue.add(node.left);
                }

                if (node.right != null) {
                    node.right.level = node.level + 1;
                    queue.add(node.right);
                }
            }
        }

        public void main(String[] args) {
            LevelNodeBfs root = new LevelNodeBfs(1);
            root.left = new LevelNodeBfs(2);
            root.right = new LevelNodeBfs(3);
            root.left.left = new LevelNodeBfs(4);
            root.left.right = new LevelNodeBfs(5);

            findLevel(root);

            System.out.println("Level of node 4 is " + root.left.left.level); // 3
        }
    }

