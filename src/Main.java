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
        ehhez Ember osztályt létrehozni

        kiirni/kilistazni a legidosebb ember nevet
        mindenki elmult 18?

        jegyzet, stackoverflow
    */
}