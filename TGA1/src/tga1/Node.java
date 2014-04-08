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
public class Node {

    private Node    left; 
    private Node    right; 
    private int     data;
    
    Node(int newData) { 
        left = null; 
        right = null; 
        data = newData; 
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
}
