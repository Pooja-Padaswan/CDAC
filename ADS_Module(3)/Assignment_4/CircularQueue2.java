import java.util.Scanner;

class CQueue {
    int size = 5;
    int CQ[] = new int[size];
    int front, rear;

    CQueue() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return ((rear + 1) % size == front);
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) {
                front = 0; // Set front to 0 if queue is empty
            }
            rear = (rear + 1) % size; // Increment rear circularly
            CQ[rear] = x;
            System.out.println(x + " Inserted");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int x = CQ[front];
            System.out.println(x + " Deleted");
            if (front == rear) {
                front = -1; // Queue is empty after deletion
                rear = -1;
            } else {
                front = (front + 1) % size; // Increment front circularly
            }
            return x;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue = [");
            int i = front;
            while (true) {
                System.out.print(CQ[i]);
                if (i == rear) break; // Break loop when we reach rear
                System.out.print(", ");
                i = (i + 1) % size; // Move to next element circularly
            }
            System.out.println("]");
        }
    }

    public static void main(String args[]) {
        CQueue q1 = new CQueue();
        Scanner sc = new Scanner(System.in);
        
        // Sample input as a demonstration
        String input = "Enqueue 1, 2, 3, 4, Dequeue, Dequeue, Enqueue 5";
        String[] commands = input.split(", ");

        for (String command : commands) {
            command = command.trim();
            if (command.startsWith("Enqueue")) {
                String[] values = command.substring(8).trim().split(", ");
                for (String value : values) {
                    try {
                        int num = Integer.parseInt(value);
                        q1.enqueue(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Not a valid integer.");
                    }
                }
            } else if (command.equals("Dequeue")) {
                q1.dequeue();
            }
        }

        // Display the current state of the queue
        q1.display();
        sc.close();
    }
}
