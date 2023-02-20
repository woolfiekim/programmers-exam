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

    @Test
    void tres(){
        solution.solution2(new int[] {-2, 3, 0, 2, -5});
    }

    @Test
    void min(){
        int i = solution.solution3(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});
        System.out.println("--:"+i);
    }

}