package com.exam.p0211;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12919

    public String solution1(String[] seoul) {
        // int num = Arrays.binarySearch(seoul, "Kim");
        int num = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+num+"에 있다";
        // int cnt = 0;
        // for (String s : seoul) {
        //     if(s.equals("Kim")){
        //         return "김서방은 "+cnt+"에 있다";
        //     }
        //     cnt++;
        // }
        // return null;
    }


    //https://school.programmers.co.kr/learn/courses/30/lessons/12910
    public int[] solution2(int[] arr, int divisor) {
        arr = Arrays.stream(arr)
            .filter(item -> (item%divisor) == 0)
            .toArray();
        Arrays.sort(arr);
        if(arr.length == 0 ){
            int[] answer = {-1};
            return answer;
        }
        return arr;
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/12948
    public String solution3(String phone_number) {

        String[] split = phone_number.split("");
        for(int cnt = 0 ; cnt <= split.length-5 ; cnt++){
            split[cnt] = "*";
        }
        return String.join("", split);
    }
}
