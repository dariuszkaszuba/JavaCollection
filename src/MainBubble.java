import controller.BubbleController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBubble {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>(Arrays.asList(2,3,6,7,9,6));
        BubbleController bc= new BubbleController();
        System.out.println(bc.sortASC(myList));
        System.out.println(bc.sortDESC(myList));
    }
}
