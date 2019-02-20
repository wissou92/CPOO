
/**
 * Décrivez votre classe DVD ici.
 *
 * @author SERHAN
 * @version Fevr. 2019
 */
public class DVD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int date;
    private String realisateur;

    /**
     * Constructeur d'objets de classe DVD
     */
    public DVD(String titre, int date, String realisateur)
    {
       super(titre);
       this.date = date;
       this.realisateur = realisateur;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int getDate()
    {
        System.out.println(this.date);
        return this.date;        
    }
    
    public String Consulter(){
        return super.Consulter() + " date : " + this.date + " realisateur : " + this.realisateur;
    }
}
