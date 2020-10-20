# Studeren


- Maak een klasse genaamd ```Student``` met de volgende attributen
    - Naam
    - Studentnummer
- Maak een klasse genaamd ```Studie```. Een studie kan maximaal 10 studenten bevatten.
    - naam: Culturele Antropologie
    - studenten: een array van maximaal 10 ```Student``` objecten
    - vakken: onderzoeksmethoden, religie, burgerschap, globalisatie (```String``` array)
- Initialiseer de attributen naam en vakken direct met hun waarde(s).
- Maak een klasse genaamd ```Universiteit``` met een ```main``` methode.
    - Maak in de ```main``` methode een Studie object ```st``` aan
    - Maak in de ```main``` methode 2 Student objecten aan: ```s1``` en ```s2```. 
    - Vul deze 2 ```Student``` objecten de volgende waarden: (doe dit via de attributen ```naam``` en ```studentnummer``` van ieder ```Student``` object) 
        - Alex Zhao 89789
        - Peter Roest 72642 
    - Plaats deze 2 studenten in de array ```studenten``` van het ```Studie``` object
- Gebruik een *enhanced for loop* om ieder ```Student``` object 1 voor 1 uit de array ```studenten``` op te vragen. Druk voor ieder ```Student``` object de ```naam``` en het ```studentnummer``` af. Er zal  een ```NullPointerException``` optreden. Dit komt doordat de lege plekken van de array ```null``` (geen) verwijzingen bevatten.

Voorbeeld output:
```bash
Alex Zhao 89789
Peter Roest 72642
Exception in thread "main" java.lang.NullPointerException
at klassen.Universiteit.main(Universiteit.java:16)
```

- Maak de attribuut ```naam``` van klasse ```Student``` ```private```
- Implementeer de methode ```public void setNaam(String naam)```. Via deze methode wordt de naam van een ```Student``` object bepaald.
- Implementeer de methode ```public String getNaam()```. Via deze methode kun je de naam van een ```Student``` object  opvragen.
- Bekijk de klasse ```Universiteit```. Als het goed is zie je dat de klasse nu niet meer compileert. Dat komt doordat je de attribuut ```naam``` van een ```Student``` object rechtstreeks gebruikt. Dit veroorzaakt een compiler error (```java: naam has private access in...``` ).
- Vervang het rechtstreeks gebruik van de attribuut ```naam``` door het gebruik van de get (accessor) methode en set (mutator) methode van het ```Student``` object 
- Compileer en draai het programma opnieuw.
- Er treedt nog steeds een ```NullPointerException``` op. Gebruik een ```if``` statement om dit te vermijden.

**Extra**

- Maak in het Studie object een methode ```void vakken()``` die de vakken afdrukt
- Maak in het Studie object een methode ```Student zoekStudent(int studentnr)``` die een Student object teruggeeft 
