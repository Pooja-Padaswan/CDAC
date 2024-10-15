import java.util.Scanner;

class CircularQueueP1 {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueueP1(int cap) {
        capacity = cap;
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enque(int value) {
        if (size == capacity) {
            System.out.println("FULL");
        } else {
            queue[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
        }
    }

    public void deque() {
        if (size == 0) {
            System.out.println("EMPTY");
        } else {
            System.out.println(queue[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        CircularQueueP1 cq = new CircularQueueP1(N);

        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.equals("enque")) {
                int value = scanner.nextInt();
                cq.enque(value);
            } else if (command.equals("deque")) {
                cq.deque();
            } else if (command.equals("exit")) {
                break;
            }
        }

        scanner.close();
    }
}
