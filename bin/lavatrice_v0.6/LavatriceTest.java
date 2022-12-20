import java.util.*;
public class LavatriceTest
{
    public static void main (String [] args){
        //v1
        Scanner tastiera = new Scanner(System.in);
        
        Lavatrice l1 = new Lavatrice();
        System.out.println("Marca lavatrice 2 :");
        String marca = tastiera.nextLine();
        System.out.println("Modello lavatrice 2 :");
        String modello = tastiera.nextLine();
        System.out.println("Prezzo lavatrice 2 :");
        double prezzo = tastiera.nextDouble();
        Lavatrice l2 = new Lavatrice(marca, modello, prezzo);
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n");
        System.out.println("Lavatrice 2: \n" + l2.toString() + "\n");
        //v2
        System.out.println("Marca lavatrice 1: ");
        l1.setMarca(tastiera.next());
        System.out.println("Modello lavatrice 1: ");
        l1.setModello(tastiera.next());
        
        System.out.println("Prezzo lavatrice 1: ");
        l1.setPrezzo(tastiera.nextDouble());
        System.out.println("Lavatrice 1:\nMarca: " + l1.getMarca() + "\nModello: "+  l1.getModello() + "\nPrezzo: " + l1.getPrezzo());
        //v3
        System.out.println("Programma lavatrice 1: ");
        l1.setProgramma(tastiera.nextInt());
        System.out.println("Temperatura lavatrice 1: ");
        l1.setTemperatura(tastiera.nextInt());
        System.out.println("Lavatrice 1:\nProgramma: " + l1.getProgramma() + "\nTemperatura: " + l1.getTemperatura());
        System.out.println("Programma lavatrice 2: ");
        l2.setProgramma(tastiera.nextInt());
        System.out.println("Temperatura lavatrice 2: ");
        l2.setTemperatura(tastiera.nextInt());
        System.out.println("Lavatrice 2:\nProgramma: " + l2.getProgramma() + "\nTemperatura: " + l2.getTemperatura() + "\n");
        //v4
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n");
        System.out.println("Lavatrice 2: \n" + l2.toString() + "\n");
        
        System.out.println("Giri centrifuga, lavatrice 1: ");
        l1.setGiriCentrifuga(tastiera.nextInt());
        System.out.println("Giri centrifuga, lavatrice 2: ");
        l2.setGiriCentrifuga(tastiera.nextInt());
        System.out.println("Giri centrifuga:\nLavatrice 1: " + l1.getGiriCentrifuga() + "\nLavatrice2: " + l2.getGiriCentrifuga());
        
        System.out.println("Kg lavatrice 1: ");
        l1.setKg(tastiera.nextInt());
        System.out.println("Kg lavatrice 2: ");
        l2.setKg(tastiera.nextInt());
        System.out.println("Lavatrice 1: " + l1.getKg() + "kg\nLavatrice 2: " + l2.getKg() + "kg\n");
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n");
        System.out.println("Lavatrice 2: \n" + l2.toString() + "\n");
        
        //v5
        System.out.println("Tempo lavatrice 1: ");
        l1.setTempo(tastiera.nextDouble());
        System.out.println("Tempo lavatrice 2: ");
        l2.setTempo(tastiera.nextDouble());
        System.out.println("Tempo lavatrice 1: " + l1.getTempo() + "\nTempo lavatrice 2: " + l2.getTempo());
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n\nLavatrice 2: " + l2.toString() + "\n");
        
        l1.setProgrammaCompleto(7, 17, 4000, 00.25);
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n");
        
        //v6
        l1.accendi(); l2.accendi();
        System.out.println("Lavatrice 1 " + l1.getAcceso() + " lavatrice 2 " + l2.getAcceso());
        l2.spegni();
        System.out.println("Lavatrice 1: \n" + l1.toString() + "\n\nLavatrice 2: " + l2.toString());
    }
    
}
