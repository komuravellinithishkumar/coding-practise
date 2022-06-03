class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;

    }
}

public class LinkedList {
    Node head;
    int count;

    LinkedList() {
        this.head = null;
        // this.count = 0;
    }

    LinkedList(Node d) {
        this.head = d;
        this.count = 1;
    }

    LinkedList(int[] arr) {

        this.count = arr.length;

    }

    public void add(int d) {
        Node last = new Node(d);
        System.out.println(last);
        if (head == null) {
            this.head = last;
        } else {
            Node n = this.head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = last;
            // last.next= null;
        }
        count = count + 1;
    }

    public void atStart(int d) {
        Node start = new Node(d);
        System.out.println(start);
        start.next = head;
        this.head = start;
        count = count + 1;
    }

    public void middle(int index, int d) {
        Node middle = new Node(d);
        middle.data = d;
        Node n = this.head;

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        middle.next = n.next;
        n.next = middle;
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void findele(int x) {
        Node n = this.head;
        // int count = 0;
        // System.out.println(n.data);
        while (n != null) {
            // System.out.println(n.data);
            if (x == n.data) {
                // count = count + 1;
                System.out.println("True");
            }
            n = n.next;

            // System.out.println(count);
        }
        System.out.println("False");
        // if (count != 0) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }
    }

    public int loopdetect() {
        Node A = this.head;
        Node B = this.head;
        int leng = 0;
        // System.out.println(count);
        while (A != null && B != null && B.next != null) {
            A = A.next;
            B = B.next.next;
            leng = leng + 1;

            if (A == B) {
                System.out.println("Loop Found");
                return leng;
            }
        }
        return -1;

    }

    public int length() {
        Node A = this.head;
        Node middle = this.head;

        int count = 0;
        while (A != null) {
            count++;
            A = A.next;

        }
        System.out.println(count);
        if (count % 2 != 0) {
            count = count / 2;
            for (int i = 0; i < count; i++) {
                middle = middle.next;
            }
            System.out.println(middle.data);
        } else {
            count = count / 2;
            for (int i = 0; i < count - 1; i++) {
                middle = middle.next;
            }
            System.out.println(middle.data);
        }
        return count;
    }

    public void sort() {
        Node temp = head.next;
        Node answer = head;
        // System.out.println(temp.val);

        while (head != null || temp != null) {
            if (head.data == temp.data) {
                answer = head;
                System.out.println(answer.data);
                head = head.next.next;
                temp = head.next;
                

            } else {
                answer=head;
                System.out.println(answer.data);
                head = head.next;
                temp = head.next;
                

            }
            // answer = head;

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList(new Node(2));
        // int arr[] = { 1, 2, 3 };
        // LinkedList list3 = new LinkedList(arr);

        // list.add(4);
        // list.add(12);
        list.atStart(4);
        list.atStart(3);
        list.atStart(3);
        list.atStart(2);
        list.atStart(1);
        list.atStart(1);
        list.atStart(1);


        list.show();
        list.sort();
        // list2.show();

        // System.out.println("FROM COUNT");
        // System.out.println(list.count);
        // System.out.println(list2.count);

        // list.atStart(7);
        // list.middle(1, 4);
        // list.show();
        // list.length();
        // list.findele(9);

        // System.out.println(list.loopdetect());
        // list.loopdetect();
        // int leng = list.loopdetect();

    }
}