class Linked_list {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newdata = new Node(data);
        if (head == null) {
            head = tail = newdata;
            return;
        }

        tail.next = newdata;
        tail = newdata;

    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // public int find_recur(Node temp,int i,int key)
    // {

    // if(temp==null)
    // return -1;
    // if(temp.data==key)
    // return i+1;
    // return find_recur(temp.next,i+1,key);
    // }

    // Without Passing a index variable
    public int find_recur(Node temp, int key) {

        if (temp == null)
            return -1;
        if (temp.data == key)
            return 0;

        int idx = find_recur(temp.next, key);

        if (idx == -1)
            return -1;

        return idx + 1;

    }

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.find_recur(head, 4));

    }
}