/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tga1;

/**
 *
 * @author leonardo
 */
public class BinaryTree {

    // Root node pointer. Will be null for an empty tree. 
    private Node root; 
 
    /** 
        Creates an empty binary tree -- a null root pointer. 
    */ 
    public void BinaryTree() {
        root = null;
    }
 
    /**
        Returns true if the given target is in the binary tree.
        Uses a recursive helper.
    */
    public boolean lookup(int data) { 
        return(lookup(root, data)); 
    } 
 

    /** 
        Recursive lookup  -- given a node, recur
        down searching for the given data.
    */ 
    private boolean lookup(Node node, int data) { 
        if (node == null) { 
          return(false);
        }

        if ( data == node.getData() ) { 
            return(true); 
        } else if ( data < node.getData() ) { 
            return(lookup(node.getLeft(), data)); 
        } else { 
            return(lookup(node.getRight(), data)); 
        }
    } 
 

    /** 
        Inserts the given data into the binary tree. 
        Uses a recursive helper. 
    */ 
    public void insert(int data) { 
        root = insert(root, data); 
    } 
 

    /** 
        Recursive insert -- given a node pointer, recur down and 
        insert the given data into the tree. Returns the new 
        node pointer (the standard way to communicate 
        a changed pointer back to the caller).
    */
    private Node insert(Node node, int data) { 
        if ( node == null ) { 
            node = new Node(data); 
        } else {
            if ( data <= node.getData() ) { 
                node.setLeft( insert(node.getLeft(), data) );
            } else { 
                node.setRight( insert(node.getRight(), data) ); 
            } 
        }

        return(node); // in any case, return the new pointer to the caller 
    }  
}