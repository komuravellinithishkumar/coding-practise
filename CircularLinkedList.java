class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}
public class CircularLinkedList {
    
    Node head;

    public void empty(Node last,int data){
        if(last!=null){
            Node temp = new Node( ata);
            temp.data=data;
            last.next=last; 

        }
    }
    public void atstart(Node last,int data){
        Node start = new Node(data);
        start.data=data;
        start.next=last.next;
        last=start.next;
    }
    public void atmid(int pos,int data){
        Node insert = new Node(data);
        insert.next=this.head;
        for (int i=0;i<pos;i++){
            insert=insert.next;
        }


    }
}
