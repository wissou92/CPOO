
/**
 * Décrivez votre classe Client ici.
 *
 * @author (SERHAN)
 * @version (20/02/2019)
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private Serveur serveur;

    /**
     * Constructeur d'objets de classe Client
     */
    public void Client(String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean seConnecter(Serveur serveur)
    {
       this.serveur = serveur;
       return serveur.connecter(this);
    }
    
    public void recevoir(String msg)
    {
        System.out.println(msg);
    }
    
    public void envoyer(String msg) 
    {
        if(this.serveur != null) serveur.diffuser(msg);
    }
}
