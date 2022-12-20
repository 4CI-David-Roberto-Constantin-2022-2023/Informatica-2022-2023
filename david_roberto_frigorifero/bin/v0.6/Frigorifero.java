public class Frigorifero
{
    //v0.1
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
            out += "acceso e consuma " + this.consumoKwat + "Kwh. ";
        }
        else{
            out += "spento e non consuma. ";
        }
        out += "La temperatura del frigo è di " + this.temperaturaFrigo + "°C, mentre quella del freezer è di " + this.temperaturaFreezer + "°C";
        return out;
    }
    
    //v0.2
    public void setMarca(String mar){
        if(mar == null){
            this.marca = "Anonima";
        }
        else{
            this.marca = mar;
        }
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModello(String mod){
        if(mod == null){
            this.modello = "Anonimo";
        }
        else{
            this.modello = mod;
        }
    }
    public String getModello(){
        return this.modello;
    }
    
    //v0.3
    public void setLitriFrigo(int l){
        if(l>=0){
            this.litriFrigo = l;
        }
        else{
            this.litriFrigo = 0;
        }
    }
    public int getLitriFrigo(){
        return this.litriFrigo;
    }
    public void setLitriFreezer(int l){
        if(l>=0){
            this.litriFreezer = l;
        }
        else{
            this.litriFreezer = 0;
        }
    }
    public int getLitriFreezer(){
        return this.litriFreezer;
    }
    
    //v0.4
    public void setPrezzo(double p){
        if(p>=0){
            this.prezzo = p;
        }
        else{
            this.prezzo = 0;
        }
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setConsumoKwat(int k){
        if(k>=0){
            this.consumoKwat = k;
        }
        else{
            this.consumoKwat = 0;
        }
    }
    public int getConsumoKwat(){
        return this.consumoKwat;
    }
    
    //v0.5
    public void setTemperaturaFrigo( double temp){
        if(temp <= 10 ){
            this.temperaturaFrigo = temp;
        }
        else{
            this.temperaturaFrigo = 0;
        }
    }
    public double getTemperaturaFrigo(){
        return this.temperaturaFrigo;
    }
    public void setTemperaturaFreezer( double temp){
        if(temp <= 0 ){
            this.temperaturaFreezer = temp;
        }
        else{
            this.temperaturaFrigo = 0;
        }
    }
    public double getTemperaturaFreezer(){
        return this.temperaturaFreezer;
    }
    
    //0.6
    public void accendi(){
        this.acceso = true;
    }
    public void spegni(){
        this.acceso = false;
    }
    public String getAcceso(){
        String acce;
        if(this.acceso){
            acce = "acceso";
        }
        else{
            acce = "spento";
        }
        return acce;
    }
    
    public Frigorifero(Frigorifero frigo){
        this.marca = frigo.marca;
        this.modello = frigo.modello;
        this.prezzo = frigo.prezzo;
        this.litriFrigo = frigo.litriFrigo;
        this.litriFreezer = frigo.litriFreezer;
        this.acceso = frigo.acceso;
        this.consumoKwat = frigo.consumoKwat;
        this.temperaturaFrigo = frigo.temperaturaFrigo;
        this.temperaturaFreezer = frigo.temperaturaFreezer;
    }
}
