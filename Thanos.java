import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
;
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero, Hero compare) {
                return hero.getName().compareTo(compare.getName());
            }
        };

        Map<Hero,Flower > heroesFlowers = new TreeMap<>(comparator);

        heroesFlowers.put(hulk , rose);
        heroesFlowers.put(thor , rose);
        heroesFlowers.put(scarletWitch , rose);
        heroesFlowers.put(vision , tulip);
        heroesFlowers.put(captainAmerica , lily);
        heroesFlowers.put(doctorStrange , violet);
        heroesFlowers.put(blackWidow , violet);


        // TODO 2 : Print if `begonia` is contained in the TreeMap

        System.out.println(heroesFlowers.containsValue("Begonia"));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower

        for (Map.Entry<Hero,Flower> entry : heroesFlowers.entrySet()){
            System.out.println(entry.getValue().getName());
        }

    }
}