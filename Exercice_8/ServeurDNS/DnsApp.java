
/**
 * Décrivez votre classe DnsApp ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class DnsApp
{
   public static void main(String[] args) {
     Dns BD = new Dns();
     DnsItem item1 = new DnsItem (new AdresseIP ("192.52.0.1"), new NomMachine ("nom.machine.1"));
     DnsItem item2 = new DnsItem (new AdresseIP ("192.53.0.4"), new NomMachine ("nom.machine.2"));
     DnsItem item3 = new DnsItem (new AdresseIP ("192.52.255.0"), new NomMachine ("nom.machine.3"));
     BD.DnsAdd (item1);
     BD.DnsAdd (item3);
     BD.DnsAdd (item2);
   }
}
