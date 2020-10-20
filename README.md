# Studeren


- Maak een klasse genaamd ```Student``` met de volgende attributen
    - Naam
    - Studentnummer
- Maak een klasse genaamd ```Studie```. Een studie kan maximaal 10 studenten bevatten.
    - naam: Culturele Antropologie
    - studenten: een array van maximaal 10 ```Student``` objecten
    - vakken: onderzoeksmethoden, religie, burgerschap, globalisatie
- Initialiseer de attributen Naam en Vakken direct met hun waarde.
- Maak een klasse genaamd ```Universiteit``` met een ```main``` methode.
    - Maak in de ```main``` methode een Studie object ```st``` aan
    - Maak in de ```main``` methode 2 Student objecten aan: ```s1``` en ```s2```. Geef deze 2 studenten de volgende waarden: 
        - Alex Zhao 89789
        - Peter Roest 72642
    - Doe dit via de attributen ```naam``` en ```studentnummer``` van ieder Student object 
        - Plaats deze 2 studenten in de array ```studenten``` van het ```Studie``` object
- Schrijf een enhanced for loop om ieder ```Student``` object 1 voor 1 uit de array ```studenten``` op te vragen. Druk voor ieder ```Student``` object de ```naam``` en het ```studentnummer``` af. Er zal als laatst een ```Exception``` optreden. Dit komt doordat de lege plekken van de array ```null``` verwijzingen naar Objecten bevatten.

Voorbeeld output:
```bash
Alex Zhao 89789
Peter Roest 72642
Exception in thread "main" java.lang.NullPointerException
at klassen.Universiteit.main(Universiteit.java:16)
```

- Zet de attribuut ```naam``` van klasse ```Student``` op ```private```
- Implementeer de methode ```void setNaam(String naam)```. Via deze methode wordt de naam van een ```Student``` object bepaald.
- Implementeer de methode ```String getNaam()```. Via deze methode kun je de naam van een ```Student``` object  opvragen.
- Bekijk de klasse ```Universiteit```. Als het goed is zie je dat de klasse nu niet meer compileert. Dat komt doordat je de attribuut ```naam``` van een ```Student``` object rechtstreeks gebruikt. Dit veroorzaakt nu een compiler error.
- Vervang het rechtstreekse gebruik van de attribuut ```naam``` door het gebruik van de getter en setter van het ```Student``` object 
- Compileer en draai het programma opnieuw.
- Er treedt nog steeds een ```null``` pointer exception op. Gebruik een ```if``` statement om dit te vermijden.

**Extra**

- Maak een methode ```void vakken()``` die de vakken van een Studie object afdrukt
- Maak een zoekmethode ```Student zoekStudent(int studentnr)``` die een Student object teruggeeft 
