package td;

import td.Exceptions.*;

import java.util.UUID;

/**
 * Created by shuwn on 04/12/2017.
 */
public abstract class Vehicule implements Machine {
    private final UUID immatriculation;
    protected int charge;
    private final int poidsAVide;
    private final int maxCharge;
    protected int vitesseMax;

    protected static final int VITESSE_MAX = 130;
    protected static final int HORSE_POWER = 110;

    public Vehicule(int poidsAVide, int maxCharge, int vitesseMax){
        this.charge=0;
        this.poidsAVide=poidsAVide;
        this.immatriculation=UUID.randomUUID();
        this.maxCharge=maxCharge;
        this.vitesseMax=vitesseMax;
    }

    public int getVitesseMax(){
        return this.vitesseMax;
    }

    public UUID getImmatriculation(){
        return immatriculation;
    }

    public int getHorsePower() {
        return HORSE_POWER;
    }
    public int getWeight() {
        return this.charge+this.poidsAVide;
    }

    public void setCharge(int charge) throws TropLourd {
        if((this.tropLourd(charge))){
            this.charge=charge;
        }else{
            throw new TropLourd(this.immatriculation, this.charge);
        }
    }
    private boolean tropLourd(int charge) {
        return this.charge<this.maxCharge;
    }



}
