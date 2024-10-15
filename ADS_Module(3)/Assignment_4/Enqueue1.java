

static class Enqueue1{

public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
	static	int size;
int num = sc.nextInt();
static		int rear = -1;

	public static boolean isEmpty(){
	return rear ==-1;
	}
	
	//equeue
	
	public static void add(int data){
	
	if(rear == size-1){
	System.out.println("Queue is Full");
	return;
	}
	rear++;
	arr[rear]=data;
}

//dequeue

public static 	int remove(){
	
	if(isEmpty()){
		System.out.println("Empty Queue");
		return -1;
	}
	int front = arr[0];
	for(int i=0;i<rear;i++){
	arr[i] = arr[i+1];
	}
	rear--;
	
	return front;
	}
	
	
	Enqueue1 eq = new Enqueue1();
	eq.add(1);
	eq.add(2);
	eq.add(3);
	}

}


	
	