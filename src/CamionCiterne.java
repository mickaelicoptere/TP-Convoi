/**
 * Created by shuwn on 05/12/2017.
 */
public class CamionCiterne extends Vehicule {

    public CamionCiterne(){
        super(3000, 10000, VITESSE_MAX);
        this.vitesseMax=getVitesseMax();
    }

    @Override
    public int getVitesseMax(){

        //int vitesse = ((this.charge<1000) && (this.charge>=4000)) ? 90 : 80;

        if((this.charge>1000) && (this.charge<=4000)) {
            return 90;
        }else if(this.charge <= 1000) {
            return 110;
        }else if(this.charge==0) {
            return VITESSE_MAX;
        } else
            return 80;
    }
}
