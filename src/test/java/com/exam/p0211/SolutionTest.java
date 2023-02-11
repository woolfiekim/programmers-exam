package com.exam.p0211;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {

    Solution solution = new Solution();


    @ParameterizedTest
    @MethodSource("test1")
    void kim(String[] seoul){

        String s = solution.solution1(seoul);
        System.out.println("s = "+s);
    }

    private static Stream<Arguments> test1(){
        String[] seoul = {"Jane", "Kim"};
        return Stream.of(Arguments.of((Object)seoul));
    }

    @ParameterizedTest
    @MethodSource("test2")
    void num(int[] arr, int divisor){

        int[] ints = solution.solution2(arr, divisor);
        System.out.println("size"+ints.length);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static Stream<Arguments> test2(){
        int[] seoul = {3,2,6};
        int divisor = 10;
        return Stream.of(Arguments.of((Object)seoul, 10));
    }

    @ParameterizedTest
    @MethodSource("test3")
    void star(String phone_number){

        String s = solution.solution3(phone_number);
        System.out.println("s:"+s);
    }

    private static Stream<Arguments> test3(){
        return Stream.of(Arguments.of("027778888"));
    }
}
