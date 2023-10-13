package com.limbo.union;

/**
 * D	[2251]花期内花的数目	50.9%	Hard	0.0%
 */
public class FullBloomFlowersSolution {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int[] result = new int[people.length];
        int tempCount=0;
        for (int i = 0; i < people.length; i++) {
            tempCount=0;
            for (int j = 0; j < flowers.length; j++) {
                if(flowers[j][0] <= people[i] && people[i] <= flowers[j][1]){
                    tempCount+=1;
                }
            }
            result[i] = tempCount;
        }

        return result;
    }

}
