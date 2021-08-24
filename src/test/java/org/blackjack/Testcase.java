import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class Testcase {

    @Test
    public double Bet(){
        Testcase test1 = new Testcase();
        test1.Bet();
        assertEquals(test1.Bet(), "Total number of amount");
        return 0;
    }


}
