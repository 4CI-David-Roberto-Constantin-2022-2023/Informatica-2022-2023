import java.util.*;
public class FrigoriferoTest
{
    public static void main (String [] args){
        
        //v0.1
        Scanner tastiera = new Scanner(System.in);
        
        Frigorifero f1 = new Frigorifero();
        Frigorifero f2 = new Frigorifero("Samsung", "x19", 1999.99);
        Frigorifero f3 = new Frigorifero(null ,null ,-200);
        System.out.println("Frigorifero 1: " + f1.toString() + "\n\nFrigorifero 2: " + f2.toString() + "\n\nFrigorifero 3" + f3.toString() + "\n");
        
        //v0.2
        f1.setMarca("Omen");
        f1.setModello("tri12");
        System.out.println("Frigorifero 1:\nMarca: " + f1.getMarca() + "\nModello: " + f1.getModello());
        f3.setMarca("Anun");
        System.out.println("\nFrigorifero 3: " + f3.toString());
        
        
        
        
    }
}
