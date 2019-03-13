
/**
 * Décrivez votre classe CD ici.
 *
 * @author SERHAN
 * @version Fevr. 2019
 */
public class CD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String auteur;
    private int nbTitre;

    /**
     * Constructeur d'objets de classe CD
     */
    public CD(String titre, String auteur, int nbTitre)
    {
        super(titre);
        this.auteur = auteur;
        this.nbTitre = nbTitre;
    }

    /**
     * 
     * @return     le nom de l'auteur
     */
    public String getAuthor()
    {
       System.out.println(this.auteur);
       return this.auteur;
    }
    
    /**
     * @return     le nombre de titre
     */
    public int getNbTitre()
    {
       System.out.println(this.nbTitre);
       return this.nbTitre;
    }
    
    public String Consulter()
    {
       return super.Consulter() + " auteur : " + this.auteur + " nombre de titres : " + this.nbTitre;
    }
}
