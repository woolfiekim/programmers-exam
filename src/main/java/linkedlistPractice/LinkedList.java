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

    public pNode<T> search(T data){
        if(this.head == null){
            return null;
        } else{
            pNode<T> node = this.head;
            while(node != null){
                if(node.data == data){
                    return node;
                } else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData){
        pNode<T> searchedNode = this.search(isData);

        if(searchedNode == null){
            this.addNode(data);
        } else{
            pNode<T> nextNode = searchedNode.next;
            searchedNode.next = new pNode<>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData){
        if(this.head == null){
            return false;
        } else {
            pNode<T> node = this.head;
            if(node.data == isData){
                this.head = this.head.next;
                return true;
            } else{
                while(node.next != null){
                    if(node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }
}
