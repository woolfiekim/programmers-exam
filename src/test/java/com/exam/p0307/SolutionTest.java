package com.exam.p0307;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("inputData")
    void solution1Test(String s, boolean result){
        boolean solution1 = solution.solution1(s);

        assertThat(solution1).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("inputData2")
    void solution2Test(int[][] arr1, int[][] arr2, int[][] result){
        int[][] ints = solution.solution2(arr1, arr2);

        assertThat(ints).isEqualTo(result);

    }

    private static Stream<Arguments> inputData() {
        return Stream.of(
            Arguments.of("12A3", false)
        );
    }

    private static Stream<Arguments> inputData2() {
        return Stream.of(
            Arguments.of(new int[][] {{1}, {2}}, new int[][] {{3}, {4}}, new int[][]{{4},{6}})
        );
    }

}