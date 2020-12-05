/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ddlpack;

/**
 *
 * @author saltu
 */
public class Node<Type> {
    
	protected Type data;
	protected Node<Type> next;
        protected Node<Type> prev ;
	
	Node(Type d) { 
            data = d;
        } 

    public Type getData() {
        return data;
    }

    public Node<Type> getNext() {
        return next;
    }

    public Node<Type> getPrev() {
        return prev;
    }
        
	
	
}
