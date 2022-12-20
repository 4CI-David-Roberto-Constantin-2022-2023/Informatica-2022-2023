Class Bagaglio
| Metodo | Visibilità | Finalità |
|:----------|:--------:|:--------------:|
| Bagaglio | public | Costruttore non parametrizzato |
| Bagaglio | public | Costruttore parametrizzato |
| setWeight | public | imposta il valore dell'attributo weight |
| getWeight | public | ritorna il valore dell'attributo weight |
| sovraprezzo | public | ritorna un valore booleano comparando il peso del bagaglio con il peso massimo |
| toString | public | ritorna una stringa contenente il valore dell'attributo dell'oggetto |

Class BagaglioPrezzoCalculator
| Metodo | Visibilità | Finalità |
|:----------|:--------:|:--------------:|
| BagaglioPrezzoCalculator | public | Costruttore non parametrizzato |
| start | public | richiama tutti i metodi della classe |
| calcolaPrezzo | public | calcola il prezzo in base al peso del bagaglio  |
| descriviAttività | public | visualizza la descrizione del programma |
| prendiInput | public | prende in input un valore double, il quale viene istanziato nella variabile weight dell'oggetto di classe Bagaglio  |
| visualizzaRisultati | public | visualizza il peso e il prezzo del bagaglio |

Class BagaglioControl
| Metodo | Visibilità | Finalità |
|:----------|:--------:|:--------------:|
| main | public | crea un oggetto di classe BagaglioPrezzoCalculator e richiama il metodo start  |
