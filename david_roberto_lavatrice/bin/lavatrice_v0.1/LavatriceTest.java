import java.util.*;
public class LavatriceTest
{
    public static void main (String [] args){
       
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
    }
    
}
