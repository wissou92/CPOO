
/**
 * Décrivez votre classe Document ici.
 *
 * @author SERHAN Wissam
 * @version Fevr. 2019
 */
public class Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre;

    /**
     * Constructeur d'objets de classe Document, initialise le titre du document
     */
    public Document(String titre)
    {
        // initialisation des variables d'instance
        this.titre = titre;
    }

    /**
     * Permet de donner le titre du Document
     * @return     le titre du document
     */
    public String getTitre()
    {
        System.out.println(this.titre);
        return this.titre;
    }
    
    public String Consulter(){
        return "titre : " + this.titre;
    }
}
