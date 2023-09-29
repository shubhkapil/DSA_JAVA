class Practice_LL {

    class Node {

        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node Head = null;
     Node Tail = null;

    public  void add_at_head(int data) {
        Node new_node = new Node(data);
        if (Head == null)
            Head = Tail = new_node;
        else {
            new_node.next = Head;
            Head = new_node;
        }
    }

    public  void add_at_tail(int data) {
        Node new_node = new Node(data);
        if (Tail == null)
            Head = Tail = new_node;
        else {
            Tail.next = new_node;
            Tail = new_node;
        }
    }

    public  void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice_LL ll = new Practice_LL();
        Practice_LL ll2 = new Practice_LL();
        ll.add_at_head(0);
        ll.add_at_tail(1);
        ll.add_at_head(0);
        ll.add_at_tail(1);
        ll.add_at_head(-1);

        ll2.add_at_head(0);
        ll2.add_at_tail(1);
        ll2.add_at_head(-1);
        ll.print();
        ll2.print();
        System.out.println(ll.Head.data + " " + ll.Tail.data );
    }

}
