package com.limbo.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySolutionTest {


    @Test
    public void sumDistanceSolutionTest(){
        SumDistanceSolution sumDistanceSolution = new SumDistanceSolution();

        assertEquals(8, sumDistanceSolution.sumDistance(new int[]{1,0}, "RL", 2));
    }

}
