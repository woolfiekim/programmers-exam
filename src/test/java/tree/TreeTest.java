package tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeTest {

    @Test
    void tree(){
        Tree tree = new Tree();
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(4);
        tree.insertNode(6);

        Node testNode = tree.search(3);
        System.out.println("=="+testNode.right.value);

        System.out.println(tree.delete(6));
    }

}