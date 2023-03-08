package com.exam.p0307;

public class Solution {

    //https://school.programmers.co.kr/learn/courses/30/lessons/12918
    public boolean solution1(String s) {

        if(s.length() != 4 && s.length() != 6){
            return false;
        }

        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/12950

    public int[][] solution2(int[][] arr1, int[][] arr2) {
        //행렬 길이
        //https://hianna.tistory.com/517

        int len1 = arr1.length;
        int len2 = arr1[0].length;

        System.out.println("lengthA:"+len1);
        System.out.println("lengthB:"+len2);

        int[][] result = new int[len1][len2];

        for (int i = 0 ; i < len1 ; i++){
            for (int j = 0 ; j < len2 ; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println("result : "+ result[i][j]);
            }
        }

        return result;
    }

}
