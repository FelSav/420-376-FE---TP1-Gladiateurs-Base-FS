package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Personnage("Bob le Bricoleur", 15, 15, 70, 15);
    Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    Bob.afficherInfosPersonnage();
    Igor.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    
        do {
            tour.afficheTour();
            for (int i = 0; i <= 100; i++) {
                if (Bob.getIni() == i) {
                    Bob.frapperPersonnage(Igor);
                }
                if (Igor.getIni() == i) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            
            affichage.afficherSeparateurInfosPerso();
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            
            tour.augmenteTour();
            
            affichage.afficherSeparateurDeTour();
            
            
            
        } while (Bob.getPvs() > 0 && Igor.getPvs() > 0);
        
        affichage.afficheVictoire(Bob, Igor);
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
