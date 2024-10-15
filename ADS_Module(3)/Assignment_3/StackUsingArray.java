import java.util.Scanner;

class Stack {
    private int[] arr; // Array to hold stack elements
    private int top;   // Index of the top element
    private int maxSize; // Maximum size of the stack

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow"); // Stack is full
        } else {
            arr[++top] = value; // Increment top and add the value
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow"); // Stack is empty
        } else {
            System.out.println(arr[top--]); // Print top value and decrement top
        }
    }

    public void printStack() {
        if (top < 0) {
            System.out.println("Stack is empty"); // If stack is empty
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " "); // Print all elements in the stack
            }
            System.out.println();
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt(); // Read the size of the stack
        Stack stack = new Stack(size);
        String command;

        while (true) {
            command = sc.next(); // Read the command

            if (command.equals("exit")) {
                stack.printStack(); // Print stack contents before exiting
                break; // Exit the program
            } else if (command.equals("push")) {
                int value = sc.nextInt(); // Read the value to push
                stack.push(value);
            } else if (command.equals("pop")) {
                stack.pop(); // Pop the top value
            }
        }

        sc.close(); // Close the scanner
    }
}
