
/**
 * Cette classe représente les cases (abscisse, ordonnés, contenu) et leurs méthodes.
 *
 * @author Serhan Wissam
 * @version 18/03/2019
 */
public class Case
{
    // abscisse de la case
    private int x;
    // ordonné de la case
    private int y;
    // contenu de la case
    private Piece contenu;
   
    /**
     * Constructeur d'objets de classe Case
     * Attribue les coordonnées de la case et son contenu
     */
    public Case(int x, int y, Piece contenu)
    {
        // initialisation des variables d'instance
        this.x = x;
        this.y = y;
        this.contenu = contenu;
    }

    /**
     * Test si la case est vide
     * 
     * @return     true si la case est vide faux sinon
     */
    public boolean estVide()
    {
        return (this.contenu == null);
    }
}
