package cz.czechitas.lekce6.nakupniseznam;

import java.util.ArrayList;
import java.util.List;

public class NakupniSeznam {
    private final List<Polozka> seznam = new ArrayList<>();

    public void run() {
        naplnSeznam();
        System.out.printf("Na začátku seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);

        Polozka tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Třetí položka je: %s", tretiPolozka).println();

        smazDruhouPolozku();
        tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Nová třetí položka je: %s", tretiPolozka).println();

        pridejDalsiPolozku();
        System.out.printf("Na konci seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);
    }

    /**
     * Naplní seznam alespoň 4 položkami.
     */
    private void naplnSeznam() {
        Polozka mleko = new Polozka("Mleko", 1, "litr");
        seznam.add(mleko);

        Polozka maslo = new Polozka("Maslo", 1, "kus");
        seznam.add(maslo);

        Polozka pivo = new Polozka("Pivo", 1, "lahev");
        seznam.add(pivo);

        Polozka voda = new Polozka("Voda", 1, "litr");
        seznam.add(voda);
    }



    /**
     * Vrátí třetí položku ze seznamu.
     *
     * @return
     */
    private Polozka ziskejTretiPolozku() {
        Polozka treti = seznam.get(2);   //vrací třetí položku
        return treti;

    }

    /**
     * Smaže druhou položku ze seznamu.
     */
    private void smazDruhouPolozku() {
        seznam.remove (1);

    }

    /**
     * Přidá novou položku na konec seznamu.
     */
    private void pridejDalsiPolozku() {
        Polozka avokado = new Polozka("Avokado", 1, "ks");
        seznam.add(avokado);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nákupní seznam");
        builder.append("\n");
        for (Polozka polozka : seznam) {
            builder.append("* ");
            builder.append(polozka);
            builder.append("\n");
        }
        return builder.toString();
    }
}
