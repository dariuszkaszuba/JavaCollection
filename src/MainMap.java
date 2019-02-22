import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Double> eq_prices = new HashMap<>();
        eq_prices.put("Tapicerka skorzana", 7000.);
        eq_prices.put("Klimatyzacja dwustrfowa", 5000.);
        eq_prices.put("Automatyczna skrzynia", 10000.);
        eq_prices.put("Lakier perlowy", 3000.);
        System.out.println(eq_prices);
        eq_prices.put("Lakier perlowy", 5000.);
        System.out.println(eq_prices);
        System.out.println(eq_prices.size());
        System.out.println(eq_prices.keySet());
        System.out.println(eq_prices.keySet().contains("Tapicerka skorzana"));
        System.out.println(eq_prices.keySet().contains("Tapicerka cccddd"));
        System.out.println(eq_prices.values());
        for(Map.Entry<String, Double> eq: eq_prices.entrySet()){
            System.out.println(eq.getKey()+" "+eq.getValue());
        }
        eq_prices.remove("Lakier perlowy");
        System.out.println(eq_prices);

        double suma=0.;
        for(Map.Entry<String, Double> eq:eq_prices.entrySet()){
            suma+=eq.getValue();
        }
        System.out.println("Suma za full opcje: "+suma);

    }
}
