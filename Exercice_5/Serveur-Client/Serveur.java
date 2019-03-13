import java.util.ArrayList;
/**
 * Décrivez votre classe Serveur ici.
 *
 * @author (SERHAN)
 * @version (20/02/2019)
 */
public class Serveur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Client> clientList;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        // initialisation des variables d'instance
        this.clientList = new ArrayList<Client>();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean connecter(Client client)
    {
        this.clientList.add(client);
        return true;
    }
    
    public void diffuser(String msg)
    {
        for(int i=0; i < clientList.size(); i++)
        {
            clientList.get(i).recevoir(msg);
        }
    }
}
