import java.util.Scanner;

class Queue3 {
    int front, rear, max;
    int[] array;

    Queue3(int size) {
        front = 0;
        rear = -1;
        max = size;
        array = new int[max];
    }

    boolean isEmpty() {
        return front > rear;
    }

    boolean enqueue(int x) {
        if (rear >= max - 1) {
            System.out.println("Queue Overflow");
            return false;
        }
        array[++rear] = x;
        return true;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return array[front++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // Size of the queue
        Queue3 queue = new Queue3(size);

        while (true) {
            String command = sc.next(); // Read user command
            if (command.equalsIgnoreCase("enque")) {
                int value = sc.nextInt(); // Read the value to enqueue
                queue.enqueue(value);
            } else if (command.equalsIgnoreCase("deque")) {
                int result = queue.dequeue();
                if (result != -1) {
                    System.out.println(result);
                }
            } else if (command.equalsIgnoreCase("exit")) {
                break; // Exit the program
            } else {
                System.out.println("Invalid command");
            }
        }
        sc.close();
    }
}
