/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Pangling
 */
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        TreeNode node;
        node = new TreeNode(5);
        tree.insert(node);
        node = new TreeNode(3);
        tree.insert(node);
        node = new TreeNode(4);
        tree.insert(node);
        
        System.out.println("Traversal dengan preorder :");
        tree.preOrder();
        System.out.println("Treversal dengan inOrder :");
        tree.inOrder();
        System.out.println("Traversal dengan postOrder");
        tree.postOrder();
        System.out.println("");
    }
    
}
