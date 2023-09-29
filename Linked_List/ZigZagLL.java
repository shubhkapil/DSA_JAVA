class ZigZagLL {

    class Node {
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
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node rotateSecondHalf() {
        Node prev = null;
        Node curr;
        Node next;
        // Finding Mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        curr = slow;
        // Reversing Second Half
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public void changeToZigZag() {
        // First rotate the second half
        Node head2 = rotateSecondHalf();
        Node curr = head;
        Node curr2 = head2;
        Node next = null;
        Node next2 = null;

        while (curr != curr2) {
            if (curr2 == curr.next) {
                curr.next = curr2;
                return;
            }
            next = curr.next;
            next2 = curr2.next;
            curr.next = curr2;
            curr2.next = next;
            curr = next;
            curr2 = next2;
        }

    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.changeToZigZag();
        ll.print();

    }

}
