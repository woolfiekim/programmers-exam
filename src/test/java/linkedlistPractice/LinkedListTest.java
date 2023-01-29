package linkedlistPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void linklist(){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(6);
        ll.addNode(10);
        ll.printAll();
    }

}