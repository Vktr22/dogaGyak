public class Ember {
    private String nev;
    private int kor;
    private String cim;

    public Ember(String nev, int kor, String cim) {
        this.nev = nev;
        this.kor = kor;
        this.cim = cim;
    }

    public Ember(String sor) {
        String[] adatok = sor.split(";");
        this.nev = adatok[0].trim();
        this.kor = Integer.parseInt(adatok[1]);
        this.cim = adatok[2].trim();
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                ", cim='" + cim + '\'' +
                '}';
    }
}
