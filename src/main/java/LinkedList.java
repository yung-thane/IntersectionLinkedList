public class LinkedList {
    Node head;


    //Making a Node class for our Linked List.
    class Node{
        int data;
        Node next;

        //Constructor for our new code.
        Node(int d) {
            data = d;
        }
    }

    //Method to get Intersection Node, takes in two head nodes from two lists of which it saves to pointer nodes.

    public Node getIntersection(Node head1, Node head2){

        //Pointer Nodes being made from the two Head nodes passed through.
        Node point1 = head1;
        Node point2 = head2;

        while(point1 != point2){
            //Will use terniary operator to verify that if point1 is equal to null, point1 == null ?
            //If the condition is true, then point1 will have the value of head2 saved to it.
            //If the condition is false, : p1.next, then p1 will have the value of the next node saved to it.
            point1 = point1 == null ? head2 : point1.next;
            point2 = point2 == null ? head1 : point2.next;
        }
        return point1;
    }

}
