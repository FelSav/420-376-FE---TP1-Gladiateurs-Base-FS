package personnages;

import java.util.Random;

public class Personnage {

    String nom;
    private int pvs;
    private int attaqueMax;
    private int valeurDefense;
    int ini;
    
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pvs = pvs;
        this.attaqueMax = attaqueMax;
        this.valeurDefense = defense;
        this.ini = ini;
    }

    public Personnage() {
        nom = "";
        pvs = 0;
        attaqueMax = 0;
        valeurDefense = 0;
        ini = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPvs(int pvs) {
        this.pvs = pvs;
    }

    public void setAttaqueMax(int attaqueMax) {
        this.attaqueMax = attaqueMax;
    }

    public void setDefence(int defence) {
        this.valeurDefense = defence;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }
    
    
    public String getNom() {
        return nom;
    }

    public int getPvs() {
        return pvs;
    }

    public int getAttaqueMax() {
        return attaqueMax;
    }

    public int getDefence() {
        return valeurDefense;
    }

    public int getIni() {
        return ini;
    }
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println("\t" + nom);
        System.out.println("\tAttaque : " + attaqueMax);
        System.out.println("\tDéfence : " + valeurDefense);
        System.out.println("\tPOint de Vie : " + pvs);
        System.out.println("\tInitiative : " + ini);
        if (pvs <= 0) {
            System.out.println("\tStatut : Mort");
        } else {
            System.out.println("\tStatut : Vivant");
        }
    }

    private int attaqueCalcul() {
        Random rand = new Random();
         
        int minValue = 0;
        int maxValue = attaqueMax;
        int attaque = rand.nextInt(maxValue - minValue) + minValue;
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int dommages;
        do {
            dommages = attaqueCalcul() - personnageCible.valeurDefense;
        } while (dommages < 0);
        
        personnageCible.pvs -= dommages;
        if (personnageCible.pvs < 0) {
            personnageCible.pvs = 0;
        }
        
        System.out.println();
        System.out.println(this.nom + " Attaque avec un puissance de : " + attaqueCalcul());
        System.out.println(personnageCible.nom + " À un défence de  : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();

        int minValue = 0;
        int maxValue = 100;
        this.ini = rand.nextInt(maxValue - minValue) + minValue;
    }
    // </editor-fold>
}
