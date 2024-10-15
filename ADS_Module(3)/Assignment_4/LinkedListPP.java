import java.util.Scanner;

class LinkedListPP {
    // Node class for LinkedList
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the LinkedList
    private Node head;

    // Operation 1: Add the node at the beginning of the list (AB)
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Operation 2: Print the linked list (PR)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Operation 3: Add the node at the end of the list (AE)
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Operation 4: Add the node after a particular node (AMA)
    public void addMiddleAfter(int afterData, int newData) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Operation 5: Add the node before a particular node (AMB)
    public void addMiddleBefore(int beforeData, int newData) {
        if (head == null) return;
        if (head.data == beforeData) {
            addAtBeginning(newData);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != beforeData) {
            current = current.next;
        }
        if (current.next != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Operation 6: Delete the node with the given data (DN)
    public void deleteNode(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Operation 7: Delete the node after a particular node (DNA)
    public void deleteNodeAfter(int afterData) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    // Main method to take commands and process them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPP list = new LinkedListPP();

        while (true) {
            String command = sc.next();

            if (command.equals("EXIT")) {
                break;
            }

            if (command.equals("AB")) {
                int data = sc.nextInt();
                list.addAtBeginning(data);
            } else if (command.equals("PR")) {
                list.printList();
            } else if (command.equals("AE")) {
                int data = sc.nextInt();
                list.addAtEnd(data);
            } else if (command.equals("AMA")) {
                int afterData = sc.nextInt();
                int newData = sc.nextInt();
                list.addMiddleAfter(afterData, newData);
            } else if (command.equals("AMB")) {
                int beforeData = sc.nextInt();
                int newData = sc.nextInt();
                list.addMiddleBefore(beforeData, newData);
            } else if (command.equals("DN")) {
                int data = sc.nextInt();
                list.deleteNode(data);
            } else if (command.equals("DNA")) {
                int afterData = sc.nextInt();
                list.deleteNodeAfter(afterData);
            }
        }

        sc.close();
    }
}
