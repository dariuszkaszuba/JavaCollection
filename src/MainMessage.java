import controller.MessageController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMessage {
    public static void main(String[] args) {
        MessageController mc = new MessageController();

        Scanner sc = new Scanner(System.in);
        int decision = -1;

        while (decision != 0) {
            System.out.println("Twoja poczta glosowa");
            System.out.println("Masz " + mc.getSize() + "wiadomosc");
            System.out.println("1. Odczytaj wiadomosc \n2. Usun waidomosc \n3. Dodaj waidomosc");
            try {
                decision = sc.nextInt();
                sc.nextLine();
                switch (decision) {
                    case 1:
                        mc.getMessage();
                        break;
                    case 2:
                        mc.deleteMessage();
                        break;
                    case 3:
                        System.out.println("Podaj adresata: ");
                        String author = sc.nextLine();
                        System.out.println("Tresc wiadomosci: ");
                        String content = sc.nextLine();
                        mc.addMessage(content, author);
                        System.out.println("Zapisano wiadomosc ");
                        break;
                    case 0:
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Musisz podac wartosc liczbowa z zakresu 0-3");
                sc.nextLine();
            }
        }
    }
}
