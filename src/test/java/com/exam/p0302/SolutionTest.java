package com.exam.p0302;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void minimum(){
        int[] ints = solution.solution1(new int[]{10});
        for (int anInt : ints) {
            System.out.println("==" + anInt);
        }
    }

    @Test
    void center(){
        String s = solution.solution2("abcdef");
        System.out.println("=="+s);
    }

    @Test
    void watermelon(){
        String s = solution.solution3(3);
        System.out.println("=="+s);
    }
}