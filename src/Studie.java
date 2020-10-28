import java.util.Arrays;

public class Studie {

    String studenten[] = new String[10];
    String vakken[] = {"onderzoeksmethoden", "religie", "burgerschap", "globalisatie"};

    private static String studienaam = "Culturele Antropologie";

    public String[] getStudenten() {
        return studenten;
    }

    public void setStudenten(String[] studenten) {
        this.studenten = studenten;
    }

    public String[] getVakken() {
        return vakken;
    }

    public void setVakken(String[] vakken) {
        this.vakken = vakken;
    }

    public void vakken() {
         System.out.println(Arrays.toString(vakken));
        }

}

