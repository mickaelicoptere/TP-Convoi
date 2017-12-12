package td.Exceptions;

import java.util.UUID;

/**
 * Created by shuwn on 05/12/2017.
 */
public class VehiculePasPresent extends Exception {
    public VehiculePasPresent(UUID immatriculation){
        super(immatriculation+"Ne fais pas partie du convoi");
    }
}
