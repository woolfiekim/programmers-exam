package com.exam.p0217;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12926
    public String solution1(String s, int n) {

        String answer = "";

        for(int size = 0 ; size < s.length() ; size++){
            char c = s.charAt(size);
            int num = (int)c;
            int i = c + n; //아스키코드로 변환

            if(64<num && num <91){
                if(90<i){
                    i -= 26;
                }
                c = (char)i;
                answer += c;
            } else if(num == 32){
                answer += c;
            } else if (96<num && num <123) {
                if(122<i){
                    i -=26;
                }
                c = (char)i;
                answer += c;
            }
        }

        /*
         * 65:A ~ 90:Z
         * 97:a ~ 122:z
         * 32 : space
         */

        return answer;
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/131705



    private int cntAnswer = 0;

    public int solution2(int[] number) {
        int n = number.length;
        int r = 3;
        // 크기가 5인 수열 arr에서 r인 3r개를 뽑은 경우를 출력한다.
        int[] combArr = new int[r]; // 뽑은 원소의 인덱스를 저장하는 배열

        doCombination(combArr, n, r, 0, 0, number);
        System.out.println(cntAnswer);
        return cntAnswer;
    }

    public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr) {
        if(r == 0) {
            int sum = 0;
            // 다 뽑았을 때
            for(int i=0; i<index; i++){
                sum += arr[combArr[i]];
            }
            if(sum == 0) cntAnswer++;

        } else if (target == n)
            return;
            //r개를 다 못뽑았는데 arr의 모든 원소를 다 검사했을 때, 실패 -> 아무것도 안하고 끝난다.
        else {
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr); // (i) 원소를 뽑는 경우
            doCombination(combArr, n, r, index, target+1, arr); // (ii) 원소를 안뽑는 경우
        }
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public int solution3(int[][] sizes) {

        int xMax = 0;
        int yMax = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            if(xMax <= size[0]){
                xMax = size[0];
            }
            if(yMax <= size[1]){
                yMax = size[1];
            }
        }
        return yMax * xMax;
    }

}
