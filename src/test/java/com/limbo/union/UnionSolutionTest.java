package com.limbo.union;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionSolutionTest {


    /**
     * [1061]按字典序排列最小的等效字符串 Test
     */
    @Test
    public void smallestEquivalentStringTest(){
        SmallestEquivalentStringSolution smallestEquivalentStringSolution = new SmallestEquivalentStringSolution();
        assertEquals("makkek", smallestEquivalentStringSolution.smallestEquivalentString("parker","morris", "parser"));
        assertEquals("hdld", smallestEquivalentStringSolution.smallestEquivalentString("hello","world", "hold"));
    }

    @Test
    public void fullBloomFlowersTest(){
        FullBloomFlowersSolution fullBloomFlowersSolution = new FullBloomFlowersSolution();
        fullBloomFlowersSolution.fullBloomFlowers(new int[][]{{1,6},{3,7},{9,12},{4,13}}, new int[]{2,3,7,11});
//        //输入：flowers = [[1,6],[3,7],[9,12],[4,13]], people = [2,3,7,11] 输出：[1,2,2,2]
//        assertArrayEquals(new int[]{1,2,2,2}, fullBloomFlowersSolution.fullBloomFlowers(new int[][]{{1,6},{3,7},{9,12},{4,13}}, new int[]{2,3,7,11}));
//
//        //输入：flowers = [[1,10],[3,3]], people = [3,3,2] 输出：[2,2,1]
//        assertArrayEquals(new int[]{2,2,1}, fullBloomFlowersSolution.fullBloomFlowers(new int[][]{{1,10},{3,3}}, new int[]{3,3,2}));
    }

}
