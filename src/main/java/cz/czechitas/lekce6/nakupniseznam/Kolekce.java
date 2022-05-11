package cz.czechitas.lekce6.nakupniseznam;

import java.util.*;

public class Kolekce {
    private List<String> seznamJmen = new ArrayList<>();
    private List<Integer> seznamCisel = new LinkedList<>();

    private Set<String> dnyVTydnu = new HashSet<>();

    public void test() {
       seznamJmen.remove("Honza");  //vždy dopíše
       seznamJmen.add("");

       dnyVTydnu.add ("pondeli");  //vraci true nebo false v zavislosti na tom zda prvek uz byl nebo ne

   }


}
