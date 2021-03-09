In acest proiect, am implementat definit interfetele Visitable(in care avem ora de deschidere si inchidere a unui obiectiv), Payable(in care avem un pret al biletului de intrare
la un obiectiv) si Classifiable(unde vom avea disponibila o clasificare).
Clasele ce implementeaza interfata Visitable sunt Church si Museum;
Interfata Classifiable este implementata de catre Restaurant si Hotel;
Interfata Payable este implementata de Museum;
In plus fata de Compulsory, voi avea implementate anumite metode, precum:
 - doua metode default in interfata visitable, care imi seteaza ora de deschidere/inchidere a unei locatii;
 - o metoda statica getVisitingDuration ce imi returneaza un obiect de tip duration, ce reprezinta durata de vizita a unui obiectiv;
In clasa City voi avea o metoda displayVisitableButNotPayable, ce imi va afisa numele locatiilor ce pot fi vizitate fara a se achita un pret de intrare(in cazul nostru,
acestea ar fi obiectele de tip Church). Ordinea va fi facuta dupa ora deschiderii obiectivelor; functia de sortare se va folosi de o functie de tip lambda.
