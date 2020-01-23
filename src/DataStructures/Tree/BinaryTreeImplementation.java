package DataStructures.Tree;

import java.util.Stack;

public class BinaryTreeImplementation {

    /**
     * insert new left child
     * @param root
     * @return
     */
    private static void insertLeft(BinaryTree<Integer> root,Integer y){
        if(root.left == null){
            root.left = new BinaryTree<>(y);
        }
        else{
            BinaryTree<Integer> newLeft= new BinaryTree<>(y);
            newLeft.left = root.left;
            root.left = newLeft;
        }
    }


    /**
     * insert new right Child
     * @param root
     * @return
     */
    private static void insertRight(BinaryTree<Integer> root,Integer x){
        if(root.right == null){
            root.right =  new BinaryTree<>(x);
        }
        else{
            BinaryTree<Integer> newRight= new BinaryTree<Integer>(x);
            newRight.right = (BinaryTree<Integer>) root.right;
            root.right = newRight;
        }
    }

    /**
     * Get right child of the tree instance
     * @return
     */
    private static BinaryTree<Integer> getRightChild(BinaryTree<Integer> root){
        return root.right;

    }

    /**
     * Get left child of the tree instance
     * @return
     */
    private static BinaryTree<Integer> getLeftChild(BinaryTree<Integer> root){
        return root.left;

    }

    /**
     * Get value of the node
     * @param root
     * @return
     */
    private static int getKeyValue(BinaryTree<Integer> root){
        return root.val;
    }


    /**
     * Pre-order tree traversal
     * @param node
     */
    private static void printPreOrderTraversal(BinaryTree<Integer> node){
        if (node == null)
            return;
        System.out.println(node.val+" ");
        /*recur on the left node*/
        printPreOrderTraversal(node.left);
        /*recur on the right node*/
        printPreOrderTraversal(node.right);

    }
    /**
     * Post-order tree traversal
     * @param node
     */
    private static void printPostOrderTraversal(BinaryTree<Integer> node){
        if (node == null)
            return;
        /*recur on the left node*/
        printPostOrderTraversal(node.left);
        /*recur on the right node*/
        printPostOrderTraversal(node.right);
        System.out.println(node.val+" ");
    }
    /**
     * In-order tree traversal
     * @param node
     */
    private static void printInOrderTraversal(BinaryTree<Integer> node){
        if (node == null)
            return;
        /*recur on the left node*/
        printInOrderTraversal(node.left);
        System.out.println(node.val+" ");
        /*recur on the right node*/
        printInOrderTraversal(node.right);

    }

    /**
     * Breadth-first search tree traversal
     * @param node
     */
    private static void  printLevelOrderTraversal(BinaryTree<Integer> node){
        int h = BinaryTreeImplementation.height(node);
        int i;
        for (i=1; i<=h; i++){
            printGivenLevel(node,i);
        }
    }

    /**
     * get height of the tree
     * @param node
     * @return
     */
    private static int height(BinaryTree<Integer> node){
        if(node == null){
            return 0;
        }
        /*compute height of each sub-tree*/
        int lheight = height(node.left);
        int rheight = height(node.right);

        if(lheight > rheight){
            return lheight+1;
        }
        return rheight+1;
    }

    /**
     * print given tree level
     * @param node
     * @param level
     */
    private static void printGivenLevel(BinaryTree<Integer> node,int level){
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.val + " ");
        else if (level > 1)
        {
            printGivenLevel(node.left, level-1);
            printGivenLevel(node.right, level-1);
        }
    }

    /**
     * pre-order traversal without recursion(using stack)
     */
    private static void preorderTraversalWithoutRecursion(BinaryTree<Integer> root){
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTree<Integer> current =  stack.pop();
            System.out.println(current.val+" ");
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }

    /**
     * in-order traversal without recursion(using stack)
     */
    private static void inorderTraversalWithoutRecursion(BinaryTree<Integer> root){
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            while(root.left != null){
                root = root.left;
                stack.push(root);
            }
            BinaryTree<Integer> current =  stack.pop();
            System.out.println(current.val);
            if(current.right != null){
                current = current.right;
                stack.push(current);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<>(1);
        BinaryTreeImplementation.insertLeft(root,2);
        BinaryTreeImplementation.insertRight(root,3);
        BinaryTree<Integer> leftChild = BinaryTreeImplementation.getLeftChild(root);
        BinaryTreeImplementation.insertLeft(leftChild,4);
        BinaryTreeImplementation.insertRight(leftChild,5);
        BinaryTree<Integer> rightChild = BinaryTreeImplementation.getRightChild(root);
        BinaryTreeImplementation.insertLeft(rightChild,6);
        BinaryTreeImplementation.insertRight(rightChild,7);
        System.out.println("Pre-order traversal using recursion: ");
        BinaryTreeImplementation.printPreOrderTraversal(root);
        System.out.println("\n");
        System.out.println("Pre-order traversal using stack: ");
        BinaryTreeImplementation.preorderTraversalWithoutRecursion(root);
        System.out.println("\n");
        System.out.println("in-order traversal using stack: ");
        BinaryTreeImplementation.inorderTraversalWithoutRecursion(root);
        System.out.println("\n");
        System.out.println("in-order traversal using recursion: ");
        BinaryTreeImplementation.printInOrderTraversal(root);
        System.out.println("\n");
        BinaryTreeImplementation.printPostOrderTraversal(root);
        System.out.println("\n");
        /*Breadth first search*/
        BinaryTreeImplementation.printLevelOrderTraversal(root);
    }
}
