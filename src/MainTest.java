import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("JCollections");
        List<String> fruits = new ArrayList<>();
        System.out.println(fruits.size());
        fruits.add("Jabłko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogorek");
        fruits.add("Mandarynka");
        fruits.add(1, "Mango");
//        fruits.add(10,"Mango");

        System.out.println(fruits);
//        fruits.forEach(f-> System.out.println(f));
//        for(String f:fruits){
//            System.out.println(f);
//        }
        fruits.set(1, "Kaka");
        System.out.println(fruits);
        System.out.println(fruits.get(1));

        fruits.remove("Gruszka");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));
//        fruits.clear();
        System.out.println(fruits.size());
        List<String> brands = new ArrayList<>(Arrays.asList("BMW","Audi","VW","Toyota"));
        brands.add("Porsche");
        System.out.println(brands);

    }
}
