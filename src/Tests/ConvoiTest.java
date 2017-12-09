import Exceptions.ConvoiVide;
import Exceptions.TropLourd;
import Exceptions.VehiculePasPresent;
import Exceptions.VehiculePresent;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shuwn on 05/12/2017.
 */
class  ConvoiTest {

    Convoi convoi = new Convoi();
    CamionCiterne cc1 = new CamionCiterne();
    CamionBache cb1 = new CamionBache();


    @Test
    void addVehicule() throws VehiculePresent {
        convoi.addVehicule(cc1);
        convoi.addVehicule(cb1);
        assertEquals(2,convoi.vehicules.size());
    }

    @Test
    void removeVehicule() throws VehiculePasPresent, VehiculePresent {
        convoi.addVehicule(cc1);
        convoi.addVehicule(cb1);
        convoi.removeVehicule(cc1);
        convoi.removeVehicule(cb1);
        assertEquals(0, convoi.vehicules.size());
    }

    @Test
    void getMaxCharge() throws VehiculePresent, TropLourd, ConvoiVide {
        convoi.addVehicule(cc1);
        cc1.setCharge(2000);
        convoi.addVehicule(cb1);
        cb1.setCharge(1000);
        assertEquals(3000, convoi.getMaxCharge());
    }

    @Test
    void getMaxVitesse() throws VehiculePresent, TropLourd, ConvoiVide {
        convoi.addVehicule(cc1);
        cc1.setCharge(2000);
        convoi.addVehicule(cb1);
        cb1.setCharge(1000);
        assertEquals(90, convoi.getMaxVitesse());
    }

}