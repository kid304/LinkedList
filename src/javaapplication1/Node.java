/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Admin
 */
public class Node {
    protected int data;
    protected Node nextNode;
 
    /*  Constructor  */
    public Node()
    {
        nextNode = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        nextNode = n;
    }    
    /*  Function to set link to next Node  */
    public void setNextNode(Node n)
    {
        nextNode = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getNextNode()
    {
        return nextNode;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
