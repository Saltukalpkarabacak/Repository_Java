
package Ddlpack;

public class DoublyLinkedList<Type> implements List<Object> {
   public Node head;
   public Node tail;
   public int size=0;
   int n=0;

    /**
	 * Returns the item at the specified index.
         * 
     * @param node for start to list
	
	 * @see print the list.
    */
     public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println(" "); 
        while (node != null) { 
            System.out.print(node.data + " <--> "); 
            last = node; 
            node = node.next; 
            size+=1;
        } 
        
        
        
        System.out.println("");
    } 
    
   
    
    
    @Override
    public void add(Object t) {
       
      
        Node new_node = new Node(t); 
  
        Node last = head; 
  
        new_node.next = null; 
  
        
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        
        while (last.next != null) 
            last = last.next; 
  
        
        last.next = new_node; 
  
        
        new_node.prev = last; 
    }
    
    /**
	 * Returns the item at the specified index.
     * @param t for add list head
	 
    */
    
    public void insertFirst(Object t){
    //Create a new node
    Node newNode = new Node(t);
    // if first insertion tail should
    // also point to this node
    if(isEmpty()){
        tail = newNode;
    }else{
        head.prev = newNode;
    }
    newNode.next = head;
    head = newNode;
    size++;
  }
    
  /**
	 * Returns the item at the specified index.
     * @param t for add list end
	 
    */
  public void insertLast(Object t){
    Node newNode = new Node(t);
    // if first insertion head should
    // also point to this node
    if(isEmpty()){
      head = newNode;
    }else{
      tail.next = newNode;
      newNode.prev = tail;
    }
    tail = newNode;
    size++;
  }

    @Override
    public void add(int index, Object t) {
       
    if(index>size){
        System.out.println("out of index!!!!");
    }
    Node newNode = new Node(t);
    Node current = head;
    //insert at the start
    if(index == 0){
      insertFirst(t);
    }
    // insert at last
    else if(index == size){
      insertLast(t);
    }else{
      for(int j = 0; j < index && current.next != null; j++){
        current = current.next;
      }
      newNode.next = current;
      current.prev.next = newNode;
      newNode.prev = current.prev;
      current.prev = newNode;
      size++;    
    }      
    }
    
    /**
	 * Returns the enters index's object
     * @param int i index
     * @return node object p
	 
    */
    Node getNode(int i) {
        Node p = null;
        if (i < n / 2) {
            p = head.next;
            for (int j = 0; j < i; j++)
                p = p.next;
        } else {
            p = head;
            for (int j = n; j > i; j--)
                p = p.prev;
        }
        return p;
    }
    
    @Override
    public void addAll(List<Object> list) {
        
        DoublyLinkedList<Type>temp=(DoublyLinkedList<Type>)list;
        this.getNode(this.size()-1).next=temp.head;
        temp.head.prev=this.tail;
	this.tail=temp.tail;
        
    }

    @Override
    public int addAll(int index, List<Object> list) {
        
       if(index == this.size()) {
			this.addAll(list);
		}else if(index>this.size()) {
			System.out.println(" Out of index, add end of list.");
			this.addAll(list);
		}else {
			DoublyLinkedList<Type> temp = (DoublyLinkedList<Type>) list;
			temp.tail.next=this.getNode(index);
			this.getNode(index).prev=temp.tail;
			this.getNode(index-1).next=temp.head;
			temp.head.prev=this.getNode(index-1);
		}
		return 0;
    }
     /**
	 * Returns the enters index's object
     * @param index
     * @param node head for start
     * @see index's value 
	 
    */
    public void gets(int index,Node node){
        Node last=null;
        int i=0;
        while (node != null) {
            if(i==index){
            System.out.print(node.data + " "); 
            System.out.println("");
            }
            last = node; 
            node = node.next; 
            i+=1;
        } 
       
    }

    @Override
    public Object get(int index) {
         if(index < 0)
    {
        throw new IndexOutOfBoundsException();
    }
    
    Node current = head;
    for (int i = 0; i < index; i++)
    {
        current = current.next;
    }
    return (Object) current.data;
}

    @Override
    public void clear() {
     head=null;  
     
    
    }
    
    @Override
    public void remove(int index){
         if(index < 0)
    {
        throw new IndexOutOfBoundsException();
    }
    
    Node current = head;
    for (int i = 0; i < index; i++)
    {
        current = current.next;
    }
    
    current.data=null;
        
    }
    

    @Override
    public int size() {
       return size;
    }

    @Override
    public boolean contains(Object t) {
       int i = 1;  
        boolean flag = false;  
         
        Node current = head;  
  
         
        if(head == null) {  
            System.out.println("List is empty");  
            return false;  
        }  
        while(current != null) {  
             
            if(current.data == t) {  
                return flag = true;  
                 
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
            return true; 
        else  
             return false; 
    }  
    
    /***
     *
     * @return head next    
     */
    
    public Node<Type> first() {
		return head.next;
	}

    @Override
    public boolean isEmpty() {
        return head == null;   
    }
    
}

