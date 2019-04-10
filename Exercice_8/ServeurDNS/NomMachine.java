
/**
 * Décrivez votre classe Nom ici.
 *
 * @author SERHAN Wissam
 * @version Avril. 2019
 */
public class NomMachine
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nommachine;
    private String nomdomaine;

    /**
     * Constructeur d'objets de classe Nom
     */
    public NomMachine(String nommachine, String nomdomaine)
    {
        // initialisation des variables d'instance
        this.nommachine = nommachine;
        this.nomdomaine = nomdomaine;
    }
    
    /**
     * 
     */
    public String getDomaine(){
        return this.nomdomaine;
    }
    
    /**
     * Renvoit le nom de l'objet
     * @return          le nom de domaine et le nom de machine de l'objet
     */
    @Override
    public String toString () {
        return this.nommachine + "  " + this.nomdomaine;
    }
}
