class Node1 {
	
    int data;
    Node1 prev, next;

    Node1(int data) {
    	
        this.data = data;
    }
	
  public static void main(String[] args) {

        Node1 head = new Node1(10);
        Node1 second = new Node1(20);
        Node1 third = new Node1(30);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        Node1 temp = head;

        while (temp != null) {
        	
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
  
}