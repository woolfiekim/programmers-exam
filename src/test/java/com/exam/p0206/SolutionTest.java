package com.exam.p0206;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("test1")
    void hashad(int x){

        boolean b = solution.solution1(x);

        System.out.println("b = " + b);

    }

    private static Stream<Arguments> test1(){
        return Stream.of(Arguments.of("10"));
    }

    @ParameterizedTest
    @MethodSource("test2")
    void colatx(int x){

        int i = solution.solution3(x);

        System.out.println("i = " + i);

    }

    private static Stream<Arguments> test2(){
        return Stream.of(Arguments.of("626331"));
    }


}