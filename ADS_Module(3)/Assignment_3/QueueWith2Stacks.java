import java.util.Stack;


public class QueueWith2Stacks {
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enqueue(int data){
		
		stack1.push(data);
		
	}
	
	public Integer dequeue(){
		
		if(stack2.isEmpty()){
			
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			
		}
		
		return stack2.pop();
		
	}
	
	public static void peek(){
		
		if(!stack2.isEmpty()){
			System.out.println(stack2.peek());
		}
		
		else{
			System.out.println("stack is empty");
		}
		
	}
	public static void main(String[]args){
		
		QueueWith2Stacks q = new QueueWith2Stacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}