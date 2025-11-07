package com.demo.test;

public class StackLinked {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			next=null;
		}
		
		
	}
	public StackLinked() {
		top=null;
	}
	
	public void push(int num) {
		Node newnode=new Node(num);
		
		if(!isEmpty()) {
			newnode.next=top;
		}
		top=newnode;
		System.out.println("push: "+num);
	}
	
	public int pop() {
		if(!isEmpty()) {
			Node temp=top;
			top=top.next;
			temp.next=null;
			return temp.data;
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
	
		
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

}
