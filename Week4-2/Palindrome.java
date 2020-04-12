import java.util.Scanner;

interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;
	StackNode link;
}

class LinkedStack implements Stack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is Empty!!");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else {
			top = top.link;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else
			return top.data;
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.printf("Linked Stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedStack pd = new LinkedStack();
		boolean res = true;
		String n;
		Scanner sc = new Scanner(System.in);
		char[] cArr;
		char item;
		int len;
		n = sc.nextLine();
		len = n.length();
		
		cArr = n.toCharArray();
		for(int i=0; i<len/2; i++) {
			pd.push(cArr[i]);
		}
		
		for(int i=0; i<len/2; i++) {
			if((len%2) == 1)
				item = cArr[len/2+i+1];
			else
				item = cArr[len/2+i];
			if(pd.pop() != item) {
				res = false;
			}
		}
		if(res) {
			System.out.println("회문입니다.");
		}
		else {
			System.out.println("회문이 아닙니다.");
		}
		
	}

}
