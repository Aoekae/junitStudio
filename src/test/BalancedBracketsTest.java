package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


//     *   things to test:
//             *   -that the brackets are in the right order
//             *   -that each opening bracket has a closing bracket
//             *   -that nested brackets are also balanced. ex: [Launch[Code]]
//             *   -

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyBracketsReverseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void doubleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void doubleReverseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void nestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void oneSidedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code["));
    }
}
