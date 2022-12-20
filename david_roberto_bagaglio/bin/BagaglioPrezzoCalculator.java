import java.util.Scanner;

public class BagaglioPrezzoCalculator    {
    private static final double COSTO_PER_KG=5.00;
    private static final double SOVRAPPREZZO=10.00;
    private Bagaglio bag;
    private Scanner tastiera = new Scanner(System.in);
    public BagaglioPrezzoCalculator(){
        bag = new Bagaglio();
    }
    public void start(){
        this.descriviAttività();
        this.prendiInput();
        double price = this.calcolaPrezzo();
        this.visualizzaRisultati(price);
    }
    public double calcolaPrezzo(){
        double prezzo;
        if(!bag.sovrapprezzo()){
            prezzo = bag.getWeight() * COSTO_PER_KG;
        }else{
            prezzo = 20 * COSTO_PER_KG + (bag.getWeight() - 20) * SOVRAPPREZZO;
        }
        return prezzo;
    }
    public void descriviAttività(){
        System.out.println("Il programma prende in input il peso di un bagaglio e ne calcola il prezzo, aggiungendo se necessario un sovraprezzo.");
    }
    public void prendiInput(){
        System.out.println("Inserire il peso del bagaglio");
        bag.setWeight(tastiera.nextDouble());
     }
    public void visualizzaRisultati(double prezzo){
        System.out.println(bag.toString() + " ed il costo è di: " + prezzo + "€.");
    }
}


