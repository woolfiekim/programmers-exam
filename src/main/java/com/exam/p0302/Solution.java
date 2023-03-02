package com.exam.p0302;

import java.util.Arrays;

public class Solution {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12935
    public int[] solution1(int[] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = {};
        answer = Arrays.stream(arr)
            .filter(item -> item != min)
            .toArray();
        if(answer.length <= 0) answer = new int[]{-1};
        return answer;
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/12903
    public String solution2(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0){
            answer = String.valueOf(s.charAt(length/2 - 1))
                    + String.valueOf(s.charAt(length/2));
        } else{
            answer = String.valueOf(s.charAt(length / 2));
        }

        return answer;
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/12922
    public String solution3(int n) {
        String answer = "";
        // int cnt = 1;
        // while(true){
        //     answer += "수";
        //     if(cnt == n){
        //         break;
        //     }
        //     cnt++;
        //     answer += "박";
        //     if(cnt == n){
        //         break;
        //     }
        //     cnt++;
        // }

        int cnt = n / 2;
        for(int i=1 ; i <= cnt ; i++){
            answer += "수박";
        }
        if(n%2 != 0){
            answer += "수";
        }

        return answer;
    }
}
