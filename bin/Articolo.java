public class Articolo
{
    private String descrizione;
    private double prezzo;
    private int codice;
    private int quantita;
    
    public Articolo(){
        this.descrizione = "nessuna descrizione";
        prezzo = 0;
        codice = 0;
        quantita = 0;
    }
    public Articolo(String desc, double p, int c, int q){
        if(desc != ""){
            this.descrizione = desc;
        }
        else{
            desc = "nessuna descrizione";
        }
        if(p > 0){
            this.prezzo = p;
        }
        else{
            this.prezzo = 0;
        }
        if(c > 0){
            this.codice = c;
        }
        else{
            this.codice = 0;
        }
        if(q > 0){
            this.quantita = q;
        }
        else{
            this.quantita = 0;
        }
    }
    public Articolo(Articolo a){
        this.descrizione = a.descrizione;
        this.prezzo = a.prezzo;
        this.codice = a.codice;
    }
    public void setDescrizione(String d){
        if(d != ""){
            this.descrizione = d;
        }
        else{
            d = "nessuna descrizione";
        }
    }
    public String getDescrizione(){
        return this.descrizione;
    }
    public void setPrezzo(double p){
        if(p > 0){
            this.prezzo = p;
        }
        else{
            this.prezzo = 0;
        }
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setCodice(int c){
        if(c > 0){
            this.codice = c;
        }
        else{
            this.codice = 0;
        }
    }
    public int getCodice(){
        return this.codice;
    }
    public void setQuantita(int q){
        if(q > 0){
            this.quantita = q;
        }
        else{
            this.quantita = 0;
        }
    }
    public void vendi(int q){
        if( q > 0 && this.quantita >= q ){
            this.quantita -= q;
        }
    }
    public void rifornisci(int q){
        if( q > 0){
            this.quantita += q;
        }
    }
    public String toString(){
        String out = "Il prodotto: " + this.descrizione;
        out += " costa: " + this.prezzo;
        out += " ,il suo codice è: " + this.codice;
        out += " e ce ne sono: " + this.quantita;
        return out;
    }
}
