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
public class MyLinkedList {
    protected Node pHead;
    protected Node pTail ;
    public int size ;
 
    /*  Constructor  */
    public MyLinkedList()
    {
        pHead = null;
        pTail = null;
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return pHead == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element */
    public void insertNode(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(pHead == null) 
        {
            pHead = nptr;
            pTail = pHead;
        }
        else 
        {
            pTail.setNextNode(nptr);
            pTail = nptr;
        }
    }
    
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            pHead = pHead.getNextNode();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = pHead;
            Node t = pHead;
            while (s != pTail)
            {
                t = s;
                s = s.getNextNode();
            }
            pTail = t;
            pTail.setNextNode(null);
            size --;
            return;
        }
        Node ptr = pHead;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNextNode();
                tmp = tmp.getNextNode();
                ptr.setNextNode(tmp);
                break;
            }
            ptr = ptr.getNextNode();
        }
        size-- ;
    }    
    
    /*  Function clean LinkedList */
    public void clean(){
        while(!this.isEmpty()){
             this.deleteAtPos(1);
        }
    }
    
    /* Function delete all element have value >= data */
    public void deleteNode(int data){
        int i = 1;
        Node pTemp = pHead;
        while(pTemp != null){
            if(pTemp.getData() >= data){
                deleteAtPos(i);
                i--;
            }
            pTemp = pTemp.getNextNode();
            i++;
        }
    }
    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("LinkedList: ");
        if (size == 0) 
        {
            System.out.println("");
            return;
        }    
        if (pHead.getNextNode() == null) 
        {
            System.out.println(pHead.getData() );
            return;
        }
        Node ptr = pHead;
        System.out.print(pHead.getData()+ "->");
        ptr = pHead.getNextNode();
        while (ptr.getNextNode() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNextNode();
        }
        System.out.println(ptr.getData()+ "\n");
    }
}
