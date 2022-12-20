public class Frigorifero
{
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFreezer;
    private double prezzo;
    private boolean acceso;
    private int consumoKwat;
    private double temperaturaFrigo;
    private double temperaturaFreezer;
    
    
    public Frigorifero(){
        this.marca = "Anonima";
        this.modello = "Anonimo";
        this.prezzo = 0;
        this.litriFrigo = 0;
        this.litriFreezer = 0;
        this.acceso = false;
        this.consumoKwat = 0;
        this.temperaturaFrigo = 0;
        this.temperaturaFreezer = 0;
    }
    public Frigorifero(String marca, String modello, double prezzo){
        if (marca == null){
            this.marca = "Anonima";
        }
        else{
            this.marca = marca;
        }
        if (modello == null){
            this.modello = "Anonimo";
        }
        else{
            this.modello = modello;
        }
        if (prezzo < 0){
            this.prezzo = 0;
        }
        else{
            this.prezzo = prezzo;
        }
        this.litriFrigo = 0;
        this.litriFreezer = 0;
        this.acceso = false;
        this.consumoKwat = 0;
        this.temperaturaFrigo = 0;
        this.temperaturaFreezer = 0;
    }
    public String toString(){
        String out = "Il frigorifero di marca: " + this.marca + " e modello: " + this.modello + " costa " + this.prezzo + "€.";
        out += "\nIl frigo può contenere " + this.litriFrigo + " L, mentre il freezer ne contiene " + this.litriFreezer + "L.";
        out += "\nIl frigorifero è ";
        if(this.acceso){
            out += "acceso e consuma " + this.consumoKwat + "Kwh.";
        }
        else{
            out += "spento e non consuma";
        }
        out += "La temperatura del frigo è di " + this.temperaturaFrigo + "°C, mentre quella del freezer è di " + this.temperaturaFreezer + "°C";
        return out;
    }
}
