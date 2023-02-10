package linkedlistPractice;

public class DoubleLinkedList<T> {

    public jNode<T> head = null;
    public jNode<T> tail = null;

    public class jNode<T>{
        T data;
        jNode<T> prev = null;
        jNode<T> next = null;

        public jNode(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new jNode<T>(data);
            this.tail = this.head;
        } else{
            jNode<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new jNode<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if(this.head != null){
            jNode<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){
            return null;
        } else{
            jNode<T> node = this.head;
            while(node != null){
                if(node.data == isData){
                    return node.data;
                } else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(this.head == null){
            return null;
        } else{
            jNode<T> node = this.tail;
            while(node != null){
                if(node.data == isData){
                    return node.data;
                } else{
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData, T addData){
        if(this.head == null){
            this.head = new jNode<T>(addData);
            this.tail = this.head;
            return true;
        } else if (this.head.data == existedData) {
            jNode<T> newHead = new jNode<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else{
            jNode<T> node = this.head;
            while(node != null){
                if(node.data == existedData) {
                    jNode<T> nodePrev = node.prev;

                    nodePrev.next = new jNode<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                } else{
                    node = node.next;
                }
            }
            return false;
        }
    }
}
