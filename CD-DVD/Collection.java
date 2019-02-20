import java.util.ArrayList;
/**
 * Décrivez votre classe Collection ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Collection
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Document> docList;

    /**
     * Constructeur d'objets de classe Collection
     */
    public Collection()
    {
        this.docList = new ArrayList<Document>();
    }
    
    public boolean ajouter(Document doc)
    {
        this.docList.add(doc);
        return true;
    }
    
    public Collection recherche(String key) 
    {
        Collection keyList = new Collection();
        for(int i=0; i<this.docList.size(); i++)
        {
            if(this.docList.get(i).getTitre().indexOf(key) != -1){
                keyList.docList.add(this.docList.get(i));
            }
        }
        return keyList;
    }
}
