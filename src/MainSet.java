import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> pesels= new HashSet<>();
        Set<String> pesels_bydgoszcz=new HashSet<>(Arrays.asList("2222","3333","2345","4567"));
        System.out.println(pesels.add("1234"));
        System.out.println(pesels.add("3454"));
        System.out.println(pesels.add("4544"));
        System.out.println(pesels.add("1234"));
        System.out.println(pesels);
        System.out.println("Przynaleznosc: "+pesels.contains("1234"));
        System.out.println("Przynaleznosc: "+pesels.contains("1239"));
        System.out.println(pesels.remove("1234"));
        System.out.println(pesels);
        Set<String> temp=new HashSet<>();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println(temp);
    }
}
