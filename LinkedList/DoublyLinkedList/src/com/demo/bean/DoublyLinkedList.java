package com.demo.bean;

public class DoublyLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		
		public Node(int data) {
			
			this.data = data;
			next=null;
			prev=null;
		}
		
		
	}

	public DoublyLinkedList() {
		 head = null;
	}
	
	public void addNode(int val) {
		Node newnode=new Node(val);
		
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newnode;
			newnode.prev=null;
					
		}
		
	}
	
	public void DisplayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"....>");
				
			}
			System.out.println("null");
		}
	}
	
	public void addData(int value,int num) {
		Node newNode=new Node (value);
		Node temp=head;
		
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
	
			
		}
		if(temp!=null) {
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next.prev=newNode;
		temp.next=newNode;
		
		}else {
			System.out.println("not found");
		}
	}
	
	public void AddBypos(int pos,int num) {
		Node newNode=new Node(num);
		
		if(pos==1) {
			newNode.next=head;
			newNode.prev=null;
			head=newNode;
		}
		
		else {
			Node temp=head;
			for(int i=1;i<=pos-2&& temp.next!=null;i++) {
				temp=temp.next;
				
			}
			
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				if(temp.next!=null) {
					temp.next.prev=newNode;
				}
				temp.next=newNode;
				
			}else {
				System.out.println("position not found");
			}
		}
	}
}
