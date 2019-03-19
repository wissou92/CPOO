import java.util.ArrayList;
/**
 * Cette classe concerne les joueurs et leurs méthodes
 *
 * @author Serhan Wissam
 * @version Mars 2019
 */
public class Joueur
{
    // Définition des constantes représentant les nombres de pièces par joueur
    private final int nb_pion = 8;
    private final int nb_tour = 2;
    private final int nb_fou = 2;
    private final int nb_cavalier = 2;
    private final int nb_reine = 1;
    private final int nb_roi = 1;
    private final int nb_pieces = nb_pion + nb_tour + nb_fou + nb_cavalier + nb_reine + nb_roi;
    // mode == 0 ? : IA || mode == 1 ? : Player
    private int mode;
    // Liste des pièces restantes au joueur
    private ArrayList<Piece> p_Liste;
    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur(int mode)
    {
        // Joueur ou IA ?
        this.mode = mode;
        // Liste des pièces du joueur pleine au départ
        for(int i=0; i<nb_pieces; i++){
            
        }
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    
}
