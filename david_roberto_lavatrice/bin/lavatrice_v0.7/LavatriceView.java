import java.util.Scanner;

public class LavatriceView
{
    private Scanner tastiera = new Scanner(System.in);
    private Lavatrice lav;
    
    public LavatriceView(){
        lav = new Lavatrice();
    }
    public void start(){
        lav.accendi();
        describeProgram();
        getInput();
        displayOutput();
        
    }
    public void describeProgram(){
        System.out.println("Il programma crea un oggetto lavatrice e prendendo in input alcuni valori le assegna marca, modello, prezzo e il programma da eseguire con tutte le informazioni necessarie.");
    }
    public void getInput(){
        System.out.println("Lavtrice:\nMarca: ");
        lav.setMarca(tastiera.next());
        System.out.println("Modello: ");
        lav.setModello(tastiera.next());
        System.out.println("Prezzo: ");
        lav.setPrezzo(tastiera.nextDouble());
        System.out.println("Peso bucato: ");
        lav.setKg(tastiera.nextInt());
        System.out.println("Programma: ");
        int prog = tastiera.nextInt();
        System.out.println("Temperatura: ");
        int temp = tastiera.nextInt();
        System.out.println("Giri centrifuga: ");
        int giri = tastiera.nextInt();
        System.out.println("Tempo: ");
        double tempo = tastiera.nextDouble();
        lav.setProgrammaCompleto(prog, temp, giri, tempo);
    }
    public void displayOutput(){
        System.out.println(lav.toString());
    }
}
