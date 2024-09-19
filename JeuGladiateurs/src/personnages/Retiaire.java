package personnages;

import java.util.Random;

public class Retiaire extends Personnage {
    
    private boolean siFiletMain;

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }
    
    @Override
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println("\t" + nom + " (Rétiaire)");
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
    
    private boolean lancerFilet() {
        Random rand = new Random();
        return rand.nextInt(10) == 1;
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if (siFiletMain) {
            System.out.println(nom + " lance son filet !");
            
            if (lancerFilet()) {
                System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'ampale sauvagement avec sa lance !");
                personnageCible.setPvs(0);
            }else {
                System.out.println("Le filet n'atteint pas sa cible !");
            }
            
            siFiletMain = false;
        }else {
            System.out.println(nom + " ramasse son filet et en profite pour attaquer !");
            super.frapperPersonnage(personnageCible);
            siFiletMain = true;
        }
    }
}
