
public class Lavatrice
{
    private String marca;
    private String modello;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private double prezzo;
    private int kg;
    private boolean acceso;
    private double tempo;
    
    
    public Lavatrice(){
        this.marca = "anonima";
        this.modello = "anonimo";
        this.programma = 0;
        this.temperatura = 0;
        this.giriCentrifuga = 0;
        this.prezzo = 0;
        this.kg = 0;
        this.acceso = false;
        this.tempo = 0;
    }
    public Lavatrice(String m, String mod, double prezzo){
        if(m == null){
            this.marca = "nessuna";
        }
        else{
            this.marca = m;
        }
        if(mod == null){
            this.modello = "nessuno";
        }
        else{
            this.modello = mod;
        }
        if(prezzo < 0){
            this.prezzo = 0;
        }
        else{
            this.prezzo = prezzo;
        }
        this.programma = 0;
        this.temperatura = 0;
        this.giriCentrifuga = 0;
        this.kg = 0;
        this.acceso = false;
        this.tempo = 0;
    }
    public String toString(){
        String out = "La lavatrice di marca: " + this.marca + " e modello: " + this.modello + "\n";
        out+= "di prezzo " + this.prezzo + "€, è ";
        if (this.acceso){
            out+= "accesa\n";
        }
        else{
            out+= "spenta\n";
        }
        out+= "ed è impostata sul programma " + this.programma + " alla temperatura scelta di " + this.temperatura + "°C\n";
        out+= "i giri della centrifuga sono " + this.giriCentrifuga + " e il peso del bucato è di " + this.kg + " kg\n";
        out+= "e la durata del programma è di " + this.tempo + "ore";
        return out;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public String getModello(){
        return this.modello;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setProgramma(int p){
        this.programma = p;
    }
    public int getProgramma(){
        return this.programma;
    }
    public void setTemperatura(int t){
        this.temperatura = t;
    }
    public int getTemperatura(){
        return this.temperatura;
    }
}