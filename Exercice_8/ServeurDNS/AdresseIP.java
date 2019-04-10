
/**
 * Décrivez votre classe Adresse ici.
 *
 * @author SERHAN Wissam
 * @version Avril. 2019
 */
public class AdresseIP
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String adresse;

    /**
     * Constructeur d'objets de classe Adresse
     */
    public AdresseIP(String adresse)
    {
        this.adresse = adresse;
    }
    /**
     * Renvoit l'adresse de l'objet
     * @return          l'adresse de l'objet
     */
    @Override
    public String toString () {
        return this.adresse;
    }
}
