# OOP

## Klase

* Klasa predstavlja šablon ili obrazac na osnovu kojih su objekti zapravo napravljeni.
  * Klasa = modla za kolače
  * Objekat = sam po sebi kolačić
  * Konkretan objekat koji predstavlja primerak klase
* Kada napravimo objekat iz neke klase kažemo da smo napravili **primerak** te klase
* Sav kod u Javi se nalazi unutar klase
* **Enkapsuliranje(skrivanje podataka)** predstavlja ključni koncept u radu sa objektima.
  * Enkapsuliranje je kombinovanje podataka i ponašanja u jednom paketu i sakrivanje implementacije tih podataka od korisnika objekta
* Podaci u objektu se nazivaju **polja**
* Procedure koje se izvršavaju nad podacima su **metode**
* Skup vrednosti je aktuelno stanje određenog objekta. Kad god se pozove metod nekog objekta njegovo stanje može da se promeni.
* Drugo svojstvo koje imaju klase je **nasleđivanje** - jedna klasa može da nasledi sva svojstva druge klase
* Sve klase u Javi dolaze iz superklase **Object**

## Enkapsulacija

* Način da enkapsulacija funkcioniše je da se obezbedi da metode nikada ne pristupaju direktno poljima objekta neke druge klase. 
* Programi treba da utiču da podatke objekta jedino kroz metode tog objekta.
* U suštini poenta je da programer koji je napravio klasu može potpuno da izmeni način da koji ona čuva svoje podatke, ali sve dok ostali objekti i dalje koriste iste metode za rukovanje tim podacima neće znati da je bilo šta izmenjeno

## Objekti

* Tri ključne karakteristike objekata:
  * **Ponašanje objekta** - šta može da se radi sa ovim objektom, koje su mu metode
  * **Stanje objekta** - kako objekat reaguje kad se pozovu metode
  * **Identitet objekta** - kako se razlikuje od ostalih objekata koji mogu imati slično ponašanje i stanja?

## Dizajniranje klasa

* Metode -> Glagoli
* Klase -> Imenice
  * primer klasa: Item, Order, Address, Payment, Bill
  * primer metodaL: add, cancel, ship....

## Relacije među klasama

* Najčešće relacije između klasa su
  * `Zavisnost` - **koristi** - primer Order koristi Account
    * jedna klasa zavisi od druge ako njene metode rukuju objektima te klase
  * `Posedovanje/agregacija` - **"sadrži"**
  * `Nasleđivanje` - **jeste**

## Konstruktori

* Da bi radili sa objektima prvo moramo da ih napravimo i da postavimo njihovo početno stanje.
* Nakon toga se primenjuju metode na te objekte
* Za izradu novog primerka klase - objekta - se koriste **konstruktori**
  * Konstruktor je specijalna metoda čije je namena da napravi i inicijalizuje objekte
  * Konstruktor uvek ima isto ime kao i klasa
  * Konstruktor može imati 0, jedan ili više parametara
  * Konstruktor ne vraća nikakvu vrednost
  * Konstruktor se uvek poziva operatorom **new**
* Promenljive koje se deklarišu **ne sadrže** neki objekat već **samo pokazuju** na njega
* **Dates** primer klase - 
  * predstavlja trenutke u vremenu u jednoj fiksnoj tački, epohi od 01.01.1970, UTC, 00:00:00
* **GregorianCalendarExample** primer klase
  * datumi prestavljeni kao moderni kalendarski zapis
  * izvedena iz generičke Calendar klase
* **.get()** metode služe kao **inspektori** - one samo vraćaju vrednosti
  * metode koje postavljamo unutar svojih klasa ako su instektori uvek nazivamo sa prefixom **get**
* **.set()** metode služe kao **mutatori** - one menjaju vrednosti
  * metode koje postavljamo unutar svojih klasa ako su mutatori nazivamo sa prefixom **set**
* **CurrentCalendar** primer korišćenja klase

## Definisanje sopstvenih klasa

* Sve klase do sada su imale main metod jedino
* Custom klase uglavnom nemaju main metode, uglavnom imaju sopstvena polja primeraka i metoda
* **Employee** klasa primer