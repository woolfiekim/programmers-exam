package hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HashTableTest {

    @ParameterizedTest
    void HashTable(){
        HashTable hashTable = new HashTable(20);
        hashTable.saveData("DaveLee", "000000");
        hashTable.saveData("Dead", "11111");
        hashTable.saveData("hash", "22222");
        hashTable.saveData("vvvv", "33333");
        System.out.println(hashTable.getData("DaveLee"));
    }

    @ParameterizedTest
    void chaing(){
        Chaining chaining = new Chaining(20);
        chaining.saveData("DaveLee", "000000");
        chaining.saveData("Dead", "11111");
        chaining.saveData("hash", "22222");
        chaining.saveData("vvvv", "33333");
        System.out.println(chaining.getData("DaveLee"));
    }
}