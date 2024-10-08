package com.linkedlist.customLL;


public class CustomList {
	
	Node head;
	Node tail;
	int size;
	
	public CustomList() {
		
	}
	
	
	
	public CustomList(Node head, Node tail, int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = size;
	}
	
	//Insert@FirstPosition
	
	/**
	 * @param val
	 * create a new node
	 * assign head val to nextnode since head is null
	 * check if there is tail element if it is null then tail becomes head
	 */
	public void insertAtFirst(int val) {
		Node node = new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size += 1;
	}
	
	//display
	/**
	 * to Display the element in list
	 * first take temp node assign head head
	 * check temp is null or not if it is not print the val
	 * then check next temp element as temp node
	 */
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println("end");
		
	}
	
	//Insert at last
	/**
	 * @param val
	 * insert at last
	 * take a new node
	 * check if tail is null, if it is call inserFirstFunction
	 * else
	 * next node will be tail i.e tail.next =tail
	 * assign it tail to node
	 * increment size of the list
	 */
	public void insertLast(int val) {
		if(tail==null) {
			insertAtFirst(val);
			return;
		}else {
			Node node= new Node(val);
			tail.next=node;
			tail=node;
			size++;
		}
		
	}
	
	//InsertInbetween
	/**
	 * insert the element inbetwen the nodes accoarding to the index posiitiin
	 * @param val
	 * @param index
	 * 
	 * check if the index =0 rthen call insertFirst
	 * if index= length then call insertLast
	 * 
	 * make the previous node where have to insert as head and assign as temp node
	 * traverse the list till index then the head becomes the current node
	 * 
	 * create new node with val and nextPosition
	 * then assign the temp node to new node
	 * 
	 */
	public void insertAtIndex(int val, int index) {
		if(index==0) {
			insertAtFirst(val);
		}
		if(index==size) {
			insertLast(val);
		}
		Node temp=head;
		for(int i=1; i<index;i++) {
			temp=temp.next;
		}
		Node node =new Node(val, temp.next);
		temp.next=node;
		size++;
	}
	
	
	
	
	

}
