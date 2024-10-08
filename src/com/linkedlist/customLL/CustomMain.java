package com.linkedlist.customLL;

public class CustomMain {
	
	public static void main(String[] args) {
		CustomList list= new CustomList();
		list.insertAtFirst(10);
		list.insertAtFirst(20);
		list.insertAtFirst(30);
		list.insertLast(100);
		list.insertLast(90);
		list.insertAtIndex(2, 2);
		list.insertAtIndex(300, 4);
		
		list.display(); //30 20 10, 100, 90 end
	}
	

}
