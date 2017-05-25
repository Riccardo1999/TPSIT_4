package corsa;

import java.util.Vector;
import javax.swing.JOptionPane;
/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    private Pista pista;
    private Vector vincitore = new Vector(1,1);
    public boolean via=false;
    
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        Atleta a1 = new Atleta("Atleta 1",this.pista.atleta1,this);                                       
        Atleta a2 = new Atleta("Atleta 2",this.pista.atleta2,this);
        Atleta a3 = new Atleta("Atleta 3",this.pista.atleta3,this);                                       
        Atleta a4 = new Atleta("Atleta 4",this.pista.atleta4,this);
        Atleta a5 = new Atleta("Atleta 5",this.pista.atleta5,this);                                       
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        this.via=true;
        //notifyAll();
        try{
            a1.join();
            a2.join();
            a3.join();
            a4.join();
            a5.join();
        }
        catch(Exception e){
            
        }
        JOptionPane.showMessageDialog(null, "Gara conclusa\n\nPrimo posto: "+this.vincitore.get(0)+"\nSecondo posto: "+this.vincitore.get(1)+"\nTerzo posto: "+this.vincitore.get(2)+"\nQuarto posto: "+this.vincitore.get(3)+"\nQuinto posto: "+this.vincitore.get(4), "Risultati gara", JOptionPane.INFORMATION_MESSAGE);
    }
    
    synchronized public void hoFinito(String nomeAtleta){
            this.vincitore.add(nomeAtleta);
    }
}
