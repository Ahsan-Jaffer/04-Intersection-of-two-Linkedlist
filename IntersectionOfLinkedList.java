public class IntersectionOfLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lenA = size(headA);
        int lenB = size(headB);

        if (lenA > lenB) {
            int steps = lenA - lenB;
            for(int i=1;i<=steps;i++){
                tempA = tempA.next;
            }
        }
        else{
            int steps = lenB - lenA;
            for(int i=1;i<=steps;i++){
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        System.out.println(tempA.data);
        
    }

    
    public static int size(Node head){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(11);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        e.next = f;
        f.next = c;
        
        Node head1 = a;
        Node head2 = e;

        getIntersectionNode(head1,head2);
    }
}