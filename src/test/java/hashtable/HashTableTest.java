package hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HashTableTest {

    @Test
    void HashTable(){
        HashTable hashTable = new HashTable(20);
        hashTable.saveData("DaveLee", "000000");
        hashTable.saveData("Dead", "11111");
        hashTable.saveData("hash", "22222");
        hashTable.saveData("vvvv", "33333");
        System.out.println(hashTable.getData("DaveLee"));
    }

    @Test
    void Chaing(){
        Chaining chaining = new Chaining(20);
        chaining.saveData("DaveLee", "000000");
        chaining.saveData("Dead", "11111");
        chaining.saveData("hash", "22222");
        chaining.saveData("vvvv", "33333");
        System.out.println(chaining.getData("DaveLee"));
    }

    @Test
    void Linear(){
        Linear linear = new Linear(20);
        linear.saveData("DaveLee", "000000");
        linear.saveData("Dead", "11111");
        linear.saveData("DaveLee", "22222");
        linear.saveData("vvvv", "33333");
        System.out.println(linear.getData("Dead"));
    }
}