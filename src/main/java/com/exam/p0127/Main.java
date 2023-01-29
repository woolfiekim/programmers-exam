package com.exam.p0127;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        long n = 12345;

        int[] result = new Solution().solution(n);



        System.out.println("result=" + Arrays.stream(result).boxed().collect(Collectors.toList()));

    }
}
