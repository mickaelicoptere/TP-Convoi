package Exceptions;

import java.util.UUID;

/**
 * Created by shuwn on 05/12/2017.
 */
public class VehiculePresent extends Exception {
    public VehiculePresent(UUID immatriculation){
        super("Ce véhicule est déjà présent ! :"+immatriculation);
    }
}
