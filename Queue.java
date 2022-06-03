public class Queue {
    Node head;
    Node tail;
    int count;

    Queue() {
        this.head = null;
        this.tail = null;
    }

    Queue(Node data) {
        this.head = data;
        this.tail = data;
    }

    public void push(int d) {

        this.count += 1;

        if (this.head == null) {
            this.head = new Node(d);
            this.tail = this.head;
        } else {
            this.tail.next = new Node(d);
            this.tail = this.tail.next;
        }

    }

    public void pop() {
        if (this.head == null) {
            System.out.println("empty");
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public void isEmpty() {
        if (this.head == null) {

        }
    }

    public void display() {
        Node n = this.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(3);
        q.push(4);
        q.display();
        q.pop();

        Queue q2 = new Queue(new Node(5));

    }
}
