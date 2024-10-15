import java.util.ArrayList;
import java.util.Scanner;

class Assig1_Queue {
    int size;
    int[] Q;
    int front, rear;
    ArrayList<Integer> deletedElements; // List to keep track of deleted elements

    // Constructor to initialize the queue with user-defined size
    Assig1_Queue(int size) {
        this.size = size;
        Q = new int[size];
        front = -1;
        rear = -1;
        deletedElements = new ArrayList<>(); // Initialize the list
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    void enqueue(int x) {
        if (!isFull()) {
            if (front == -1) {
                front = 0; // Set front to 0 if the queue is empty
            }
            rear++;
            Q[rear] = x;
            System.out.println("Enqueued: " + x);
        } else {
            System.out.println("Queue is full");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int x = Q[front];
            deletedElements.add(x); // Add the dequeued element to the list
            System.out.println("Dequeued: " + x);
            if (front == rear) { // Reset both front and rear if the last element is dequeued
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            return x;
        }
    }

    void display() {
        if (!isEmpty()) {
            System.out.print("Queue = [");
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i]);
                if (i < rear) {
                    System.out.print(", "); // Format for array elements
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Queue is empty");
        }

        // Display deleted elements
        if (!deletedElements.isEmpty()) {
            System.out.print("Deleted elements = ");
            for (int i = 0; i < deletedElements.size(); i++) {
                System.out.print(deletedElements.get(i));
                if (i < deletedElements.size() - 1) {
                    System.out.print(", "); // Format for deleted elements
                }
            }
            System.out.println(); // Move to the next line
        } else {
            System.out.println("No elements have been deleted.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the queue
        System.out.print("Enter the size of the queue: ");
        int queueSize = sc.nextInt();

        Assig1_Queue q1 = new Assig1_Queue(queueSize);

        while (true) {
            System.out.println("Enter command (enqueue <number>, dequeue, or exit):");
            String command = sc.next();

            if (command.equalsIgnoreCase("enqueue")) {
                int number = sc.nextInt();
                q1.enqueue(number);
            } else if (command.equalsIgnoreCase("dequeue")) {
                q1.dequeue();
            } else if (command.equalsIgnoreCase("exit")) {
                break; // Exit the loop
            } else {
                System.out.println("Invalid command. Please enter enqueue, dequeue, or exit.");
            }

            q1.display(); // Display remaining queue and deleted elements after each command
        }

        sc.close(); // Close the scanner
    }
}
