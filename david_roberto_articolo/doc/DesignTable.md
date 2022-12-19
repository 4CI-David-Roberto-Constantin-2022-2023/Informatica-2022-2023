Class Articolo

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:------------:|
| Articolo | public | Costruttore non parametrizzato |
| Articolo | public | Costruttore parametrizzato |
| Articolo | public | Costruttore di copia |
| setDescrizione | public | imposta il valore dell'attributo descrizione |
| getDescrizione | public | ritorna il valore dell'attributo descrizione |
| setPrezzo | public | imposta il valore dell'attributo prezzo |
| getPrezzo | public | ritorna il valore dell'attributo prezzo |
| setCodice | public | imposta il valore dell'attributo codice |
| getCodice | public | ritorna il valore dell'attributo codice |
| setQuantita | public | imposta il valore dell'attributo quantita |
| vendi | public | diminuisce il valore dell'attributo quantita in base al parametro ricevuto |
| rifornisci | public | aumenta il valore dell'attributo quantita in base al parametro ricevuto |
| toString| public | ritorna una stringa contenente i valori degli attributi dell'oggetto |

Class VenditaArticolo

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:------------:|
| VenditaArticolo | public | Costruttore |
| start | public | richiama tutti i metodi della classe  |
| describeProgram | public | visualizza la descrizione del programma |
| getInput | public | prende in input i valori da istanziare nell'oggetto della classe Articolo |
| vendiArticolo | public | prende in input un valore, e lo sottrae a il valore dell'attributo quantita dell'oggetto di classe Articolo  |
| displayOutput | public | visualizza le informazioni del metodo toString della classe Articolo|

Classe ApplicazioneArticolo

| Metodo | Visibilità | Finalità |
|:----------|:--------:|:------------:|
| main | public | crea un oggetto di classe VenditaArticolo ed esegue il metodo start |

