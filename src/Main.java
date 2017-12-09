import Exceptions.ConvoiVide;
import Exceptions.TropLourd;
import Exceptions.VehiculePresent;

public class Main {

    public static void main(String[] args) throws TropLourd, ConvoiVide, VehiculePresent {
        Convoi convoi=new Convoi();
        CamionBache cb1 = new CamionBache();
        cb1.setCharge(300);
        CamionCiterne cc1 = new CamionCiterne();
        cc1.setCharge(1000);

        convoi.addVehicule(cb1);
        convoi.addVehicule(cc1);

        System.out.println("charge :"+convoi.getMaxCharge());
        System.out.println("vitesse du convoi :"+convoi.getMaxVitesse());

    }
}
