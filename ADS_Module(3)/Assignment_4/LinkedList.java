import java.util.Scanner;

class LinkedList {

    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Add at the Beginning
    void addAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Add at the End
    void addAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    // Print the list
    void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println();
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add after a particular node
    void addAfterNode(int after, int new_data) {
        Node temp = head;
        while (temp != null && temp.data != after) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found.");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = temp.next;
        temp.next = new_node;
    }

    // Add before a particular node
    void addBeforeNode(int before, int new_data) {
        if (head == null) return;

        if (head.data == before) {
            addAtBeginning(new_data);
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && temp.data != before) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found.");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = temp;
        prev.next = new_node;
    }

    // Delete a node
    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        // If the head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the node to delete
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    // Delete the node after a particular node
    void deleteAfterNode(int after) {
        Node temp = head;
        while (temp != null && temp.data != after) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String command = sc.next();

            if (command.equals("EXIT")) {
                break;
            }

            switch (command) {
                case "AB":
                    int data = sc.nextInt();
                    list.addAtBeginning(data);
                    break;

                case "PR":
                    list.printList();
                    break;

                case "AE":
                    data = sc.nextInt();
                    list.addAtEnd(data);
                    break;

                case "AMA":
                    int after = sc.nextInt();
                    data = sc.nextInt();
                    list.addAfterNode(after, data);
                    break;

                case "AMB":
                    int before = sc.nextInt();
                    data = sc.nextInt();
                    list.addBeforeNode(before, data);
                    break;

                case "DN":
                    int deleteData = sc.nextInt();
                    list.deleteNode(deleteData);
                    break;

                case "DNA":
                    int deleteAfter = sc.nextInt();
                    list.deleteAfterNode(deleteAfter);
                    break;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }

        sc.close();
    }
}
