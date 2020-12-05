import jdk.nashorn.internal.objects.NativeArray;

import Ddlpack.DoublyLinkedList;
import Ddlpack.Node;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saltu
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DoublyLinkedList<Integer> d = new DoublyLinkedList();
      
      System.out.println(d.isEmpty());
      
      d.add(10);// add to list
      d.add(6);
      d.add(4);
      d.add(3);
      
      
      d.printlist(d.head);// print the list
      
      
      
      System.out.println(d.isEmpty());
      
      d.gets(0,d.head);// get indexs object
      
      System.out.println(d.size()); // found length of list
      
      System.out.println(d.isEmpty()); // isempty >true or flase
      
      System.out.println(d.contains(6));
      System.out.println(d.contains(40));
      
      d.add(3, 100);
      
      d.printlist(d.head);
      
      System.out.println(d.get(2)); // get index have value
      
      d.clear();
      
      System.out.println(d.isEmpty());
      
      d.add(10);
      d.add(60);
      d.add(40);
      d.add(30);
      
      d.printlist(d.head);
      
      d.remove(2); // remove index value 
      
      d.printlist(d.head);
      
      DoublyLinkedList<Integer> d2 = new DoublyLinkedList(); 
      d2.add("j");
      d2.add("k");
      d2.add("s");
      
      d.addAll(d2);// add liat to list 1
     
      d.printlist(d.head);
      
     
    }
    
}
