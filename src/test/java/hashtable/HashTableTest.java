package hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HashTableTest {

    @ParameterizedTest
    @MethodSource("testValue")
    void HashTable(){
        HashTable hashTable = new HashTable(20);
        hashTable.saveData("DaveLee", "000000");
        hashTable.saveData("Dead", "11111");
        System.out.println(hashTable.getData("DaveLee"));
    }

    private static Stream<Arguments> testValue(){
        return Stream.of(
            Arguments.of(List.of(1,2,4,6,8,3), 4, 3)
        );
    }

}