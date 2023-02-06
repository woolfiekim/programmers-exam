package com.exam.p0206;

import java.util.stream.Stream;

public class Solution {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12947

    public boolean solution1(int x) {

        int[] arrNum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i : arrNum) {
            sum += i;
        }

        if(x % sum == 0){
            return true;
        }
        return false;

    }


    // https://school.programmers.co.kr/learn/courses/30/lessons/12912
    public long solution2(int a, int b) {
        long answer = 0;
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }
        for (int num = a ; num <= b ; num++){
            answer += num;
        }
        return answer;
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/12943
    public int solution3(int num) {
        /*
         *   1-1. 입력된 수가 짝수라면 2로 나눕니다.
         *   1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
         *   2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
         *   단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
        */

        int answer = 0;
        long largeNum = num;
        if(num == 1) {
            return 0;
        }
        while(largeNum > 1){
            if(largeNum % 2 == 0){
                largeNum = largeNum / 2;
            } else{
                largeNum = largeNum * 3 + 1;
            }
            answer++;
            if(answer == 500) {
                return -1;
            }
        }

        return answer;
    }
}
