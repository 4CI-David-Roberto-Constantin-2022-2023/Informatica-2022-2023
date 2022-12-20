import java.util.*;
public class FrigoriferoTest
{
    public static void main (String [] args){
        
        //v0.1
        
        Scanner tastiera = new Scanner(System.in);
        
        Frigorifero f1 = new Frigorifero();
        Frigorifero f2 = new Frigorifero("Samsung", "x19", 1999.99);
        Frigorifero f3 = new Frigorifero(null ,null ,-200);
        System.out.println("Frigorifero 1: " + f1.toString() + "\n\nFrigorifero 2: " + f2.toString() + "\n\nFrigorifero 3: " + f3.toString() + "\n");
        
        //v0.2

        f1.setMarca("Omen");
        f1.setModello("tri12");
        System.out.println("Frigorifero 1:\nMarca: " + f1.getMarca() + "\nModello: " + f1.getModello());
        f3.setMarca("Anun");
        System.out.println("\nFrigorifero 3: " + f3.toString() + "\n");
        
        //v0.3
        
        f1.setLitriFrigo(25); f1.setLitriFreezer(5);
        f2.setLitriFrigo(30); f2.setLitriFreezer(10);
        f3.setLitriFrigo(-12);f3.setLitriFreezer(7);
        System.out.println("Frigorifero 1:\nLitri frigo " + f1.getLitriFrigo() + "; litri freezer " + f1.getLitriFreezer());
        System.out.println("Frigorifero 2:\nLitri frigo " + f2.getLitriFrigo() + "; litri freezer " + f2.getLitriFreezer());
        System.out.println("Frigorifero 3:\nLitri frigo " + f3.getLitriFrigo() + "; litri freezer " + f3.getLitriFreezer());
        f3.setLitriFrigo(15); f3.setLitriFreezer(-5);
        System.out.println("Frigorifero 3:\nLitri frigo " + f3.getLitriFrigo() + "; litri freezer " + f3.getLitriFreezer() + "\n");
        
        //v0.4
        
        System.out.println("Prezzi: Frigorifero 1 " +  f1.getPrezzo() + " Frigorifero 2 " + f2.getPrezzo() + " Frigorifero 3 " +f3.getPrezzo());
        f1.setPrezzo(799.99); f2.setPrezzo(-200); f3.setPrezzo(1499.99);
        System.out.println("Prezzi: Frigorifero 1 " +  f1.getPrezzo() + " Frigorifero 2 " + f2.getPrezzo() + " Frigorifero 3 " +f3.getPrezzo());
        f2.setPrezzo(1999.99); f3.setPrezzo(-599.99);
        System.out.println("Prezzi: Frigorifero 1 " +  f1.getPrezzo() + " Frigorifero 2 " + f2.getPrezzo() + " Frigorifero 3 " +f3.getPrezzo() + "\n");
        
        f1.setConsumoKwat(20); f2.setConsumoKwat(10); f3.setConsumoKwat(-17);
        System.out.println("Consumo: Frigorifero-1: " + f1.getConsumoKwat() + " Frigorifero-2: " + f2.getConsumoKwat() + " Frigorifero-3: " + f3.getConsumoKwat());
        f1.setConsumoKwat(-12); f3.setConsumoKwat(13);
        System.out.println("Consumo: Frigorifero-1: " + f1.getConsumoKwat() + " Frigorifero-2: " + f2.getConsumoKwat() + " Frigorifero-3: " + f3.getConsumoKwat() + "\n");
        
        
        
    }
}
