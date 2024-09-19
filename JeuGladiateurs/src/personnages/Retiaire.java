package personnages;

public class Retiaire extends Personnage {
    
    private boolean siFilet;

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
    
    
}
