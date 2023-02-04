package linkedlistPractice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class LinkedListTest {

    @ParameterizedTest
    @MethodSource("testValue")
    void linklist(List<Integer> list) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (Integer item : list) {
            ll.addNode(item);
        }

        // ll.addNode(1);
        // ll.addNode(2);
        // ll.addNode(3);
        // ll.addNode(6);
        // ll.addNode(10);
        ll.printAll();
    }

    @ParameterizedTest
    @MethodSource("testMultiValue")
    void linklistMulti(List<Integer> list, int n1, int n2, int n3) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (Integer item : list) {
            ll.addNode(item);
        }
        ll.printAll();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    // @ValueSource(ints = 1)
    void linklistSingle(int n) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addNode(n);
        ll.printAll();
    }

    private static Stream<Arguments> testValue() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 4)));
    }

    private static Stream<Arguments> testMultiValue() {
        return Stream.of(
            Arguments.of(List.of(1, 2, 3, 4), 1, 2, 3));
    }


    @ParameterizedTest
    @MethodSource("testAddData")
    void linklistAddData(List<Integer> list, int n1, int n2) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (Integer item : list) {
            ll.addNode(item);
        }
        ll.addNodeInside(n2, n1);
        ll.printAll();
    }

    private static Stream<Arguments> testAddData(){
        return Stream.of(
            Arguments.of(List.of(1,2,3),1,5)
        );
    }

    @ParameterizedTest
    @MethodSource("testDelData")
    void linklistDelData(List<Integer> list, int n1) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (Integer item : list) {
            ll.addNode(item);
        }
        ll.printAll();
        System.out.println(ll.delNode(n1));
        ll.printAll();
    }

    private static Stream<Arguments> testDelData(){
        return Stream.of(
            Arguments.of(List.of(1,2,3,4,5),2)
        );
    }

}