package linkedlistPractice;

public class LinkedList<T> {

    pNode<T> head = null;
    public class pNode<T> {
        T data = null;
        pNode<T> next = null;

        public pNode(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(head == null){
            head = new pNode<>(data);
        } else{
            pNode<T> node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new pNode<>(data);
        }
    }

    public void printAll(){
        if(head != null){
            pNode<T> node = head;
            System.out.println("node data : " + node.data);
            while(node.next != null){
                node = node.next;
                System.out.println("node data : " + node.data);
            }
        }
    }
}
