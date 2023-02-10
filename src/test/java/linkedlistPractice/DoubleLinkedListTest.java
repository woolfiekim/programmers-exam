package linkedlistPractice;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DoubleLinkedListTest {


    @ParameterizedTest
    @MethodSource("testValue")
    void doubleList(List<Integer> list, int num1, int num2){
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<>();

        for (Integer item : list) {
            MyLinkedList.addNode(item);
        }

        MyLinkedList.insertToFront(num1, num2);

        MyLinkedList.printAll();

        System.out.println(MyLinkedList.searchFromHead(1));
        System.out.println(MyLinkedList.searchFromTail(1));
        System.out.println(MyLinkedList.searchFromTail(6));
    }

    private static Stream<Arguments> testValue(){
        return Stream.of(
          Arguments.of(List.of(1,2,4,6,8,3), 4, 3)
        );
    }
}
