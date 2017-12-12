package td;

/**
 * Created by shuwn on 05/12/2017.
 */
public class CamionBache extends Vehicule {

    public CamionBache() {
        super(4000,20000,VITESSE_MAX);
        this.vitesseMax=getVitesseMax();
    }

    @Override
    public int getVitesseMax(){
        if(this.charge > 3000 && this.charge <= 7000){
            return 90;
        }else if(this.charge <= 3000){
            return 110;
        } else if(this.charge == 0){
            return VITESSE_MAX;
        }else return 80;
    }


}
