class Node {
	
    int data;
    Node next;

    Node(int data) {
    	
        this.data = data;
    }

 public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        while (head != null) {
        	
            System.out.print(head.data + " ");
            head = head.next;
        }
        
    }
 
}