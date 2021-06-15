import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int numbersOfTrees = 20;
        int depth = 4;
        int balancedTrees = 0;

        for (int i = 0; i <= numbersOfTrees; i++) {
            Tree<Integer> myTree = new TreeImpl<>(depth);
            fillTreeWithData(myTree, depth);
            if (myTree.isBalanced()) {
                balancedTrees++;
                System.out.println("Дерево: " + i + " сбалансировано");
            } else {
                System.out.println("Дерево: " + i);
            }
        }
        System.out.println("Balanced Tree Count = " + ((balancedTrees / (numbersOfTrees * 1.0)) * 100) + "%");
    }

    private static void fillTreeWithData(Tree<Integer> tree, int depth) {
        int nodeCount = (int) (Math.pow(2, depth) - 1);
        for (int i = 0; i < nodeCount; i++) {
            tree.add(new Random().nextInt(25 * 2 + 1) - 25);
        }
    }
}
