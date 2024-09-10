package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    private String nom;
    private int pvs;
    private int attaqueMax;
    private int defence;
    private int ini;
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pvs = pvs;
        this.attaqueMax = attaqueMax;
        this.defence = defence;
        this.ini = ini;
    }

    public Personnage() {
        nom = "";
        pvs = 0;
        attaqueMax = 0;
        defence = 0;
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
        this.defence = defence;
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
        return defence;
    }

    public int getIni() {
        return ini;
    }
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n");
        System.out.println("\t" + nom);
        System.out.println("\tAttaque : " + attaqueMax);
        System.out.println("\tDéfence : " + defence);
        System.out.println("\tPOint de Vie : " + pvs);
        System.out.println("\tInitiative : " + ini);
        if (pvs <= 0) {
            System.out.println("\tStatut : Mort");
        } else {
            System.out.println("\tStatut : Vivant");
        }
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
