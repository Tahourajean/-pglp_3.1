package uvsq.fr;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void calculSalaire() {
        Employe emp =new Employe();
        double commission=100;
        double expResult = 1100.0;
        double result = emp.calculSalaire(commission);
        assertEquals(expResult, result, 1100.0);
        
    }
}
