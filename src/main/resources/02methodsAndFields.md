## Privatne metode

* Po pravilu pomoćne metode ne bi trebalo da budu javne, već privatne, da im pristup imaju samo one klase i metodi u kojima se nalaze
* Da bi se u javi implementirala privatna metoda jednostavno se upiše `private` umesto `public`
* Kada je metoda privatna možemo biti sigurni da metodu nikada neće koristiti druga klasa

## Final polja objekta

* Polja objekta možemo da definišemo kao `final`
* Takvo polje mora da se inicjalizuje kada se objekat napravi, tj mora se garantovati da je polju dodeljena vrednost po završetku svih konstruktora
* Posle toga ovo polje **ne može** da se menja
  * primer - ako za polje `private String name` nemamo metodu `setName` već ćemo sa čitamo vrednosti preko `getName` onda nam je vrednost polja name konačna i možemo da stavimo `private final String name`

## Statička polja objekta i statičke metode

* Ukoliko se polje definiše kao `static` tada u klasi postoji samo jedno takvo polje. 
* **Statičke promenljive** su jako retke, ali su **statičke konstante** jako česte
  * Primer `private static int nextId = 1; private int id;` 
  * Primer - Ukoliko postoji 1000 objekata klase Emplozee tada postoji 1000polja id, po jedno za svaki objekat. ali postoji samo jedno statičko polje nextId. 
  * primer - PI broj
* **Statičke metode**
  * Metode koje se ne izvršavaju nad objektima, nemaju implicitne parametre
  * To su u stvari metode koje nemaju parametar **this**