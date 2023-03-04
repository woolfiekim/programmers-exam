package tree;

class Node{
    Node left;
    Node right;
    int value;

    public Node (int data){
        this.value = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {

    Node head = null;

    public boolean insertNode(int data){
        //CASE1 : Node가 하나도 없을 때
        if(this.head == null){
            this.head = new Node(data);
        } else{
            //CASE2 : Node가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while(true){
                //CASE2-1 : 현재 Node의 왼쪽에 Node가 들어가야 할 때
                if(data < findNode.value){
                    if(findNode.left != null){
                        findNode = findNode.left;
                    } else{
                        findNode.left = new Node(data);
                        break;
                    }
                //CASE2-2 : 현재 Node의 오른쪽에 Node가 들어가야 할 때
                } else {
                    if(findNode.right != null){
                        findNode = findNode.right;
                    } else{
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data){
        //CASE1 : Node가 하나도 없을 때
        if(this.head == null){
            return null;
        //CASE2 : Node가 하나 이상 있을 때
        } else{
            Node findNode = this.head;
            while(findNode != null){
                if(findNode.value == data){
                    return findNode;
                } else if(data < findNode.value){
                    findNode = findNode.left;
                } else{
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    public boolean delete(int data){
        Node searchNode = search(data);
        if(searchNode == null){
            return false;
        } else{
            //Child Node 유
            if(searchNode.right != null || searchNode.left != null){
                return false;
            //Child Node 무
            } else{
                searchNode = null;
                return true;
            }
        }
    }

    public boolean delete2(int value){
        boolean searched = false; //삭제할 노드를 찾았는지 확인
        Node currParentNode = this.head; //삭제할 노드의 부모
        Node currNode= this.head; //삭제할 노드

        //예외 케이스 1 : Node 가 하나도 없을 때
        if(this.head == null){
            return false;
        }

        //예외 케이스 2 : Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
        else {
            if(this.head.value == value && this.head.left == null && this.head.right == null){
                this.head = null;
                return true;
            }

            while(currNode != null){
                if(currNode.value == value){
                    searched = true;
                    break;
                } else if (value < currNode.value){
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else{
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if(searched == false){
                return false;
            }
        }

        /*
         * 여기까지 실행되면
         * currNode 에는 해당 데이터를 가지고 있는 Node,
         * currParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node
         */

        //case1 : 삭제할 Node 가 Leaf Node 인 경우
        if(currNode.left == null && currNode.right == null){
            if(value < currParentNode.value){
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
        }

        //case2-1 : 삭제할 Node가 Child node를 한 개 가지고 있을 경우(왼쪽에 Child node가 있을 경우)
        else if (currNode.left != null && currNode.right == null) {
            if(value < currParentNode.value){
                currParentNode.left = currNode.left;
                currNode = null;
            } else{
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        }

        //case2-2 : 삭제할 Node가 Child node를 한 개 가지고 있을 경우(오른쪽에 Child node가 있을 경우)
        else if (currNode.left == null && currNode.right != null) {
            if(value < currParentNode.value){
                currParentNode.left = currNode.right;
                currNode = null;
            } else{
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }

        return  true;

    }

}
