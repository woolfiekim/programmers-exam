package com.exam.p0107;

import java.util.Arrays;

public class Solution {

    //https://school.programmers.co.kr/learn/courses/30/lessons/92334

    public int[] solution(String[] id_list, String[] report, int k) {

        int[][] reportList = new int[id_list.length][id_list.length];
        int[] countList = new int[id_list.length];

        for(String s : report){
            String[] result = s.split(" ");
            int number1 = Arrays.asList(id_list).indexOf(result[0]);
            int number2 = Arrays.asList(id_list).indexOf(result[1]);
            if(reportList[number1][number2] != 1){
                reportList[number1][number2] = 1;
                countList[number2]++;
            }
        }

        int[] answer = new int[id_list.length];

        int b = 0;
        for(int count : countList){
            if(count >= k){
                for(int c = 0 ; c < id_list.length ; c++){
                    if(reportList[c][b] == 1){
                        answer[c]++;
                    }
                }
            }
            b++;
        }

        return answer;
    }
}
