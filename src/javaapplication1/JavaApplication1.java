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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n= 3;
        
        MyLinkedList list = new MyLinkedList();           

        System.out.println("Append an element into the linkedlist");   
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(1);
        list.insertNode(4);
        list.insertNode(2);
        list.insertNode(0);
        list.insertNode(05);
        list.display();
        
        System.out.println("Remove the tail element from linkedlist");  
        list.deleteAtPos(list.getSize());
        list.display();
        
        System.out.println("Remove all element have value >= "+n);  
        list.deleteNode(n);
        list.display();
            
    }
}
