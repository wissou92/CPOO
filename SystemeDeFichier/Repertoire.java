import java.util.ArrayList;
/**
 * Décrivez votre classe Repertoire ici.
 *
 * @author SERHAN
 * @version Fevr. 2019
 */
public class Repertoire
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private ArrayList<Repertoire> repList;
    private ArrayList<Fichier> ficList;

    /**
     * Constructeur d'objets de classe Repertoire
     */
    public Repertoire(String nom)
    {
        this.nom = nom;
        this.repList = new ArrayList<Repertoire>();
        this.ficList = new ArrayList<Fichier>();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void Ajouter(Repertoire rep)
    {
        this.repList.add(rep);
    }
    
    public void Ajouter(Fichier fic)
    {
        this.ficList.add(fic);
    }
    
    /**
     * Retourne la taille du répertoire
     * 
     *  
     * @return     la taille du dossier
     */
    
    public int getTaille()
    {
        
    }
    
}
