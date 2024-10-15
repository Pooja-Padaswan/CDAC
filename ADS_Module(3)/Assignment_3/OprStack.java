

class OprStack{

static final int MAX =10;
int top; //showing current position

int a[] = new int[MAX];
	OprStack()
	{
		top = -1;
	
	}

	boolean isEmpty()
	{
		return (top<0);    //top==-1;
	}
	
	boolean push(int x)
	{
		if(top >= (MAX-1))
		{
			System.out.println("Stack Overflow");
			return false;
			
		}
		a[++top] = x;
		return true;
		
	}
	
	
	//pop()
	int pop()
	{
		if(top<0)
		{	
			System.out.println("Stack Underflow");
			
			return 0;
			
		}
		return a[top--];
	}
	
	
	//peek
	
	int peek()
	{
		return (top <0)? 0: a[top];
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Empty stack!");
		}
		else
			System.out.println("Stack elements are: ");
		show(top);
		System.out.println();
		
	}
	void show(int index)
	{
		if(index<0)      //base condition
			return;
		System.out.println(a[index] + "");
		show(index-1);  //recursive call
		
	}
	

	public static void main(String args[])
	{
		OprStack s1 = new OprStack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		s1.display();
		s1.pop(10);
		s1.display();
	}
}
		
