
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author SERHAN
 * @version Fevr. 2019
 */
public class Fraction
{
    private int numerateur;
    private int denominateur;
    
    final Fraction ZERO = new Fraction(0, 1);
    final Fraction UN = new Fraction(1, 1);
    
    /**
     * Constructeurs d'objets de classe Fraction
     */
    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    
    public Fraction(int numerateur)
    {
        this.numerateur = numerateur;
        this.denominateur = 1;
    } 
    
    public Fraction()
    {
        this.numerateur = 0;
        this.denominateur = 1;
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void Consultation()
    {
        System.out.println("dénominateur : " + this.denominateur + "nominateur : " + this.numerateur);
    }
    
    public double ConsultationVal()
    {
        return (this.numerateur/this.denominateur);
    }
    
    public Fraction Addition(Fraction f1, Fraction f2)
    {
        Fraction fTmp = new Fraction();
        fTmp.denominateur = f1.denominateur*f2.denominateur;
        fTmp.numerateur = f1.numerateur*f2.denominateur + f2.numerateur*f1.denominateur;
        return fTmp;
    }
    
    public boolean Egale(Fraction f1, Fraction f2)
    {
        return (f1.ConsultationVal() == f2.ConsultationVal());
    }
    
    public String FracToString()
    {
        String frac = this.numerateur + "/" + this.denominateur;
        System.out.println(frac);
        return frac;
    }
    
    public String Comparaison(Fraction f1, Fraction f2)
    {
        if (Egale(f1,f2)) 
            return f1.FracToString() + "=" + f2.FracToString();
        else if(f1.ConsultationVal() > f2.ConsultationVal()) 
            return f1.FracToString() + ">" + f2.FracToString();
        else
            return f1.FracToString() + "<" + f2.FracToString();
    }
}
