import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriInverse {
    static class Tri {
        public static void triInverse(List<String> liste) {
            Collections.sort(liste, (s1, s2) -> s2.compareTo(s1));
        }
    }

    public static void main(String[] args) {
        List<String> joeursList = new ArrayList<>();

        joeursList.add("Messi");
        joeursList.add("Ronaldo");
        joeursList.add("Zidane");
        joeursList.add("Neymar");
        joeursList.add("Henry");
        joeursList.add("Adriano");
        joeursList.add("Pélé");
        joeursList.add("Benzema");
        joeursList.add("Drogba");
        System.out.println("Liste des joeurs stockés dans une liste");
        joeursList.forEach(System.out::println);

        Tri.triInverse(joeursList);
        System.out.println("Liste des joeurs trié invsersement / par odre lexicographique  decroissant");
        joeursList.forEach(System.out::println);
    }
}