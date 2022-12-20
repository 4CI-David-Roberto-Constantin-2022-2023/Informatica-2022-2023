Class Lavatrice

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:--------------:|
| Lavatrice | public | Costruttore non parametrizzato |
| Lavatrice | public | Costruttore parametrizzato |
| toString | public | ritorna una stringa contenente i valori degli attributi dell'oggetto |
| setMarca | public | imposta il valore dell'attributo marca |
| getMarca | public | ritorna il valore dell'attributo marca |
| setModello | public | imposta il valore dell'attributo modello |
| getModello | public | ritorna il valore dell'attributo modello |
| setPrezzo | public | imposta il valore dell'attributo prezzo |
| getPrezzo | public | ritorna il valore dell'attributo prezzo |
| setProgramma | public | imposta il valore dell'atttibuto programma |
| getProgramma | public | ritorna il valore dell'attributo programma |
| setTemperatura | public | imposta il valore dell'attributo temperatura |
| getTemperatura | public | ritorna il valore dell'attributo temperatura |
| setGiriCentrifuga | public | imposta il valore dell'attributo giriCentrifuga |
| getGiriCnetrifuga | public | ritorna il valore dell'attributo giriCentrifuga |
| setKg | public | imposta il valore dell'attributo kg |
| getKg | public | ritorna il valore dell'attributo kg |
| setTempo | public | imposta il valore dell'attributo tempo |
| getTempo | public | ritorna il valore dell'attributo tempo |
| setProgrammaCompleto | public | imposta i valori degli attributi programma, temperatura, giriCentrifuga, tempo |
| accendi | public | imposta l'attributo acceso a true |
| spegni | public | imposta l'attributo accesso a false |
| getAcceso | public | ritorna il valore dell'attributo acceso |

Class LavatriceView

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:--------------:|
| LavatriceView | public | Costruttore |
| start | public | richiama il metodo accendi sull'oggetto di classe Lavatrice e tutti i metodi della classe |
| describeProgram | public | visualizza la descrizione del programma |
| getInput | public | prende in input dei valori, i quali vengono istanziati opportunamente nell'oggetto di classe Lavatrice |
| displayOutput | public | visualizza le informazioni del metodo toString della classe Lavatrice

Class LavatriceControl

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:------------:|
| main | public | crea un oggetto di classe LavatriceView ed esegue il metodo start|


