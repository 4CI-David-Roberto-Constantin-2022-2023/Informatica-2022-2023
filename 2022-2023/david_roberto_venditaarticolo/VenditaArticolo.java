import java.util.*;
public class VenditaArticolo
{
    private Articolo art;
    
    
    public VenditaArticolo(){
        this.art = new Articolo();
    }
    public void start(){
        this.describeProgram();
        this.getInput();
        this.vendiArticolo();
    }
    public void describeProgram(){
        System.out.println("Il programma crea un articolo e ne permette la ventita di una determinata quantita");
    }
    public void getInput(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire i dati dell'articolo\nDescrizione:");
        art.setDescrizione(tastiera.next());
        System.out.println("Prezzo: ");
        art.setPrezzo(tastiera.nextDouble());
        System.out.println("Codice: ");
        art.setCodice(tastiera.nextInt());
    }
    public void vendiArticolo(){
        
    }
    
}
