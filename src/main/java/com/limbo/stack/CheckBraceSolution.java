package com.limbo.stack;

import java.util.Stack;

/**
 *  [20]有效的括号	43.9%	Easy	0.0%
 */
public class CheckBraceSolution {


    /**
     * ()[]{}
     */
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();

        Stack<Integer> stack = new Stack<>();
        int tempItem;
        for (char item : charArray) {
            tempItem = item;
            if(tempItem == '(' || tempItem == '{' || tempItem == '[' ){
                stack.push(tempItem);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            int pop = stack.pop().intValue();

            if(pop != item-1 && pop != item-2){
                return false;
            }
        }

        return stack.isEmpty();
    }


}
