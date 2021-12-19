package br.com.abruzzo.turing.Challenges_DIO_LeetCode_Among_Others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emmanuel Abruzzo
 * @link https://leetcode.com/problems/interval-list-intersections/
 */
class IntervalListIntersections {

    public static void main(String[] args) {
        int[][] firstList= {{4,6},{7,8},{10,17}};
        int[][] secondList = {{5, 10}};
        new IntervalListIntersections().intervalIntersection(firstList,secondList);
    }


    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        int startMax = 0;
        int endMin = 0;
        List<int[]> intersectionList = new ArrayList<int[]>();

        while(i<firstList.length && j<secondList.length){
            startMax = Math.max(firstList[i][0],secondList[j][0]);
            endMin = Math.min(firstList[i][1],secondList[j][1]);
            if(endMin>=startMax){
                intersectionList.add(new int[]{startMax,endMin});
            }
            if(endMin == firstList[i][1])
                i++;
            if(endMin == secondList[j][1])
                j++;
        }
        return (int[][]) intersectionList.toArray(new int[0][0]);
    }


}
