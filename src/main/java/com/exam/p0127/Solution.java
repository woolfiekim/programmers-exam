package com.exam.p0127;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(long n) {

        Test test = new Test();

        test.setA1("!").setA2("!").setA3("");

        List<Integer> list = new ArrayList<>();



        while(n > 0){
            list.add((int)(n % 10));
            n /= 10;
        }

        int[] a = list.stream().mapToInt(i->i).toArray();

        return a;
    }
}
