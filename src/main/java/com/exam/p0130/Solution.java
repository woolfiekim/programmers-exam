package com.exam.p0130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    /*
     * 문제 1
     * https://school.programmers.co.kr/learn/courses/30/lessons/12954
     */
    public long[] solution1(int x, int n) {

        long[] answer = new long[n];

        for(int a = 0; a < n; a++){
            answer[a] = x + (long)a * x;
        }

        return answer;
    }
    /*
     * 문제 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/12925
     */
    public int solution2(String s) {
        return Integer.parseInt(s);
    }

    /*
     * 문제 2
     * https://school.programmers.co.kr/learn/courses/30/lessons/12933
     */
    public long solution3(long n) {
        String[] ss = new StringBuilder(String.valueOf(n)).toString().split("");

        Arrays.sort(ss, Comparator.reverseOrder());

        String s1 = String.join("", ss);

        return Long.parseLong(s1);

    }

}
