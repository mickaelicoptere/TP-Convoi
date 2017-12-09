import Exceptions.TropLourd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shuwn on 05/12/2017.
 */

class VehiculeTest {
    CamionBache cb1 = new CamionBache();
    CamionCiterne cc1 = new CamionCiterne();

    @Test
    void setCharge() throws TropLourd {
        cb1.setCharge(2000);
        cc1.setCharge(1000);
        assertEquals(6000, cb1.getWeight());
        assertEquals(4000, cc1.getWeight());
    }

    @Test
    void getWeight() {
        assertEquals(4000, cb1.getWeight());
    }

    @Test
    void getVitesseMax() {
        assertEquals(110, cc1.getVitesseMax());
        assertEquals(110, cb1.getVitesseMax());
    }

    /*@Test Pas besoin car 'UUID' de 'java.util' sort un 'universal unique identifier'
   void getImmatriculation(){
   }*/

    @Test
    void getHorsePower() {
        assertEquals(110, cb1.getHorsePower());
    }

}