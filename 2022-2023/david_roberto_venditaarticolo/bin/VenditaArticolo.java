package bin;

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
        this.displayOutput();
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
        System.out.println("Quantita: ");
        art.setQuantita(tastiera.nextInt());
    }
    public void vendiArticolo(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Qaunti elementi dell'articolo vendere?");
        art.vendi(tastiera.nextInt());
    }
    public void displayOutput(){
        System.out.println("Queste sono le informazioni dell'articolo dopo la vendita: " + art.toString());
    }
}
