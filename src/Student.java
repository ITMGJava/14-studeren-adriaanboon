public class Student {

    private String naam;
    private int studentnummer;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public void StudentinArray (String naam, int studentnummer) {
        this.naam=naam;
        this.studentnummer=studentnummer;
    }

    public String toString() {
        return this.naam.toString() + " - "+ this.studentnummer;
    }
}
