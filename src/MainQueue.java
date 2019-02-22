import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<LocalTime> times = new ArrayDeque<>();
        times.add(LocalTime.of(12,00,00));
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());

        System.out.println(times);
        System.out.println(times.remove());
        System.out.println(times);

        Deque<String> people=new ArrayDeque<>();
        people.addFirst("Anna");
        people.addLast("VV");
        people.addLast("Ewa");
        people.addLast("CC");
        people.addLast("Ewa");
        System.out.println(people);

//        try {
//            while (people.getFirst() != null) {
//                System.out.println(people.removeLast());
//            }
//        }catch (NoSuchElementException e){
//            System.out.println("Koniec kolejki");
//        }
        System.out.println("Petla while v2!!");
        while (people.size()!=0){
            System.out.println(people.removeFirst());
        }
    }
}
