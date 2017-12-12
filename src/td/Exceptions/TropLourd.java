package td.Exceptions;

import java.util.UUID;

/**
 * Created by shuwn on 05/12/2017.
 */
public class TropLourd extends Exception {
    public TropLourd(UUID immatriculation, int charge){
        super("Cette charge:"+charge+" est trop lourde pour le véhicule :"+immatriculation);
    }
}
