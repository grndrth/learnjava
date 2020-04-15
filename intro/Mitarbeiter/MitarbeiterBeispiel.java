class Mitarbeiter {
    String m_name;
    String m_vorname;
    int m_gehalt;

    Mitarbeiter(String name, String vorname, int gehalt) {
        m_name = name;
        m_vorname = vorname;
        m_gehalt = gehalt;
    }

    void datenAusgeben() {
        System.out.println("\n");
        System.out.println(" Name   : " + m_name);
        System.out.println(" Vorname    : " + m_vorname);
        System.out.println(" Gehalt : " + m_gehalt);
    }

    void gehaltErhoehen(int erhoehung) {
        m_gehalt += erhoehung;
    }
}

public class MitarbeiterBeispiel {
    public static void main(String[] args) {
        Mitarbeiter billy = new Mitarbeiter("Gates", "Bill", 3000);
        Mitarbeiter stevie = new Mitarbeiter("Jobs", "Steve", 3500);

        billy.datenAusgeben();
        stevie.datenAusgeben();
        billy.gehaltErhoehen(500);
        billy.datenAusgeben();
        stevie.datenAusgeben();
    }
}
