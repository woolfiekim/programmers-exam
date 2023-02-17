package com.exam.p0217;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void siser(){

        String s = solution.solution1("a B z", 4);
        System.out.println("s = "+s);
    }


}