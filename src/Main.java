import controller.FileMuveletek;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vesszővel elválasztott nevek:");
        var nevek = FileMuveletek.nevekBeolvasasa("nevek.txt");
        nevek.forEach(System.out::println);

        System.out.println("\nTöbb sor beolvasása:");
        var sorok = FileMuveletek.sorokBeolvasasa("sorok.txt");
        sorok.forEach(System.out::println);
    }


    /*
        a lista--> collections osztály

        stringbeEgySorbol
        stringListabaTobbSorbol

        sajatTipustTobbSorbol -->
        NÉV;KOR;CÍM
        Béla;22;Bp
        Cecil;33;Bp
        Anna;18;Érd
        ehhez Ember osztályt létrehozni --- ide kellenek getterek, h elerjuk az adattagokat(mivel privatak ugye)

        kiirni/kilistazni a legidosebb ember nevet
        mindenki elmult 18? --->eldontes tetele
        hany féle helyen laknak? --->set (halmaz) HashSet<>()
        hol, mennyien laknak? --->map
            (kulcs értékek növelése if-ben, elseben adott kulcsra az 1 ertek elhelyezese
            iter + tab
        jegyzet, stackoverflow

        rendezesek!!! --sajat osztalyok rendezese
    */
}