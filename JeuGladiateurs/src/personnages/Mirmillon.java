package personnages;

import java.util.Random;

public class Mirmillon extends Personnage {
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }
    
    @Override
    public void setNewInitiativeRandom(){
        Random rand = new Random();
        int minValue = 0;
        int maxValue = 30;
        this.ini = rand.nextInt(maxValue - minValue) + minValue;
    }
    
    @Override
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println("\t" + nom + " (Mirmillon)");
        System.out.println("\tAttaque : " + getAttaqueMax());
        System.out.println("\tDéfense : " + getDefence());
        System.out.println("\tPoints de Vie : " + getPvs());
        System.out.println("\tInitiative : " + getIni());
        if (getPvs() <= 0) {
            System.out.println("\tStatut : Mort");
        } else {
            System.out.println("\tStatut : Vivant");
        }
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        System.out.println(nom + " (Mirmillon) attaque avec une première frappe !");
        
        super.frapperPersonnage(personnageCible);
        
        if (personnageCible.getPvs() <= 0) {
            System.out.println(nom + " décapite " + personnageCible.getNom() + " !");
        } else {
            System.out.println(nom + " (Mirmillon) attaque de nouveau !");
            super.frapperPersonnage(personnageCible);
        }
    }
}

