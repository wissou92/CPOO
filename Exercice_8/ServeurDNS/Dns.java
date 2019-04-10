import java.util.*;
/**
 * Décrivez votre classe Dns ici.
 *
 * @author SERHAN Wissam
 * @version Avril. 2019
 */
public class Dns
{
    HashMap <AdresseIP, NomMachine> ipToMachine;
    HashMap <NomMachine, AdresseIP> machineToIp;
    
    /**
     * 
     */
    public Dns () {
        this.ipToMachine = new HashMap<AdresseIP, NomMachine>();
        this.machineToIp = new HashMap<NomMachine, AdresseIP>();
    }
    
    /**
     * 
     */
    public void DnsAdd(DnsItem item) {
        this.ipToMachine.put(item.getAdresse(), item.getNom());
        this.machineToIp.put(item.getNom(), item.getAdresse());
    }
    
    /**
     * 
     */
    public DnsItem getItem(NomMachine nom){
        if (machineToIp .containsKey (nom) && machineToIp .containsValue (nom)) {
            return new DnsItem (machineToIp.get (nom), nom);
        }
        else return null;
    }
    
    /**
     * 
     */
    public DnsItem getItem(AdresseIP adresse){
        if (ipToMachine .containsKey (adresse) && ipToMachine .containsValue (adresse)) {
            return new DnsItem (adresse, ipToMachine.get (adresse));
        }
        else return null;
    }
    
    /**
     * 
     */
    public Collection<DnsItem> getItems(String nomDomaine){
        ArrayList<DnsItem> output = new ArrayList<>();
        for (NomMachine nom : ipToMachine .values ()) {
            if (nom.getDomaine().equals(nomDomaine)) {
                output.add (getItem (nom));
            }
        }
        return output;
    }
}
