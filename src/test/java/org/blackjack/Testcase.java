package org.blackjack;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class Testcase {

    @Test
    public double Bet(){
        Testcase first = new Testcase();
        first.Bet();
        assertEquals(first.Bet(), "Total number of amount");
        return 0;
    }


}
