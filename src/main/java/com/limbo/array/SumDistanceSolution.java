package com.limbo.array;

/**
 * D	[2731]移动机器人	39.4%	Medium	0.0%
 */
public class SumDistanceSolution {


    public int sumDistance(int[] nums, String s, int d) {
        char[] charArray = s.toCharArray();
        int[] directionArray = new int[nums.length];

        for (int i=0; i < d; i++){

        }
        return 0;
    }

    public int getDirection(char[] charArray, int[] directionArray, int index){
        if(directionArray[index] != 0){
            return directionArray[index];
        }

        if(charArray[index] == 'L'){
            directionArray[index] = -1;
        }else {
            directionArray[index] = 1;
        }
        return directionArray[index];
    }

}
