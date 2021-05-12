package datastructures;
/**
 * stack implementation using array 
 * @author rituraj
 *Five operations we need to perform push ,pop,peek,isEmpty,isFull
 */
public class StackImplementation {
	int size;
	int arr[];
	int top;
	
	StackImplementation(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
		
	}
	//time complexity :O(1) as there is no for loop and we just need to perform only one single operation
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pushed element " + element);
		}
		else {
			System.out.println("stack is full now");
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("poped element : " + arr[returnedTop]);
			return arr[returnedTop];
			
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	public int peek()
	{
		if(!this.isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
		
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (size-1==top);
	}
    
	public static void main(String args[]) {
		StackImplementation stack = new StackImplementation(10) ;
		stack.pop();
		System.out.println(".......................");
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		System.out.println(".......................");
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
	
	
}

