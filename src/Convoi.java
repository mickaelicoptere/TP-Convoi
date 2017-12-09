import Exceptions.ConvoiVide;
import Exceptions.VehiculePasPresent;
import Exceptions.VehiculePresent;

import java.util.ArrayList;


/**
 * Created by shuwn on 04/12/2017.
 */
public class Convoi {

    public ArrayList<Vehicule> vehicules;


    public Convoi(){
        vehicules=new ArrayList<>();
    }

    public void addVehicule(Vehicule v) throws VehiculePresent {
        if(!(vehicules.contains(v))){
            vehicules.add(v);
        } else {
            throw new VehiculePresent(v.getImmatriculation());
        }
    }

    public void removeVehicule(Vehicule v)throws VehiculePasPresent {
        if(vehicules.contains(v)){
            vehicules.remove(v);
        }else{
            throw new VehiculePasPresent(v.getImmatriculation());
        }
    }

    public int getMaxCharge() throws ConvoiVide {
        if(!(vehicules.isEmpty())){
            int totalMaxCharges=0;
            for(int i=0; i<vehicules.size();i++){
                totalMaxCharges+=vehicules.get(i).charge;
            }
            return totalMaxCharges;
        }else{
            throw new ConvoiVide();
        }
    }

    public int getMaxVitesse() throws ConvoiVide{
        int minVitesse = vehicules.get(0).getVitesseMax();
        int vitesseActuelle = minVitesse;
        for (Vehicule v : vehicules ) {
            vitesseActuelle=v.getVitesseMax();
            if(minVitesse < vitesseActuelle ){
                vitesseActuelle=minVitesse;
            }
        }
        return vitesseActuelle;
    }


}
