
/**
 * Décrivez votre classe Paire ici.
 *
 * @author SERHAN Wissam
 * @version Avril. 2019
 */
public class DnsItem
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private AdresseIP adresse;
    private NomMachine nom;

    /**
     * Constructeur d'objets de classe Paire
     */
    public DnsItem(AdresseIP adresse, NomMachine nom)
    {
        this.adresse = adresse;
        this.nom = nom;
    }
    /**
     * @return          adresse ip de l'objet
     */
    public AdresseIP getAdresse() {
        return this.adresse;   
    }
    /**
     * @return          nom machine de l'objet
     */
    public NomMachine getNom() {
        return this.nom;
    }
    /**
     * @return          nom machine et adresse ip de l'objet
     */
    @Override
    public String toString() {
        return nom.toString() + "   " + adresse.toString();
    }
}
