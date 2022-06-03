// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

public class Stack {
    Node head;

    int min = 100000;

    public int getMin() {
        return this.min;
    }

    public void printStack() {

        Node ctr = this.head;

        while (ctr != null) {
            System.out.println(ctr.data + " ");
            ctr = ctr.next;
        }
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int min(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void push(int data) {

        this.min = this.min(this.min, data);
        Node d = new Node(data);
        d.next = this.head;
        this.head = d;
    }

    public Node pop() {
        if (this.isEmpty()) {
            return null;
        }

        Node ret = this.head;
        if (ret.data == this.min) {

            // O(N)
        }
        this.head = this.head.next;
        return ret;
    }

    public Node peek() {
        return this.head;
    }

    public static void main(String args[]) {

        Stack s = new Stack();
        Stack s1 = new Stack();

        System.out.println(s);
        System.out.println(s1);

        s.push(5);
        s.push(4);

        s.printStack();
    }

}
