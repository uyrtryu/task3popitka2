import java.io.File;

public class MyQueue {
    public static Node head;

    public class Node{
        public File data;
        public Node next;

        public Node(File data){
            this.data = data;
            next = null;
        }
    }
    public MyQueue() {
        head = null;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public void add(File data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if(head == null){
            head = newNode;
        }else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }


    }

    public File pop1(){
        if (head != null){
            File result = head.data;
            head = head.next;
            return result;
        } else {
            throw new NullPointerException() ;
        }
    }
}
