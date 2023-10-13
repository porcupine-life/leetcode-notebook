package com.limbo.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackSolutionTest {

    /**
     * [20]有效的括号
     */
    @Test
    public void checkBraceSolutionTest(){
        CheckBraceSolution checkBraceSolution = new CheckBraceSolution();

        assertTrue(checkBraceSolution.isValid("()"));
        assertTrue(checkBraceSolution.isValid("()[]{}"));
        assertFalse(checkBraceSolution.isValid("(]"));
    }

}
