import java.util.Scanner;

public class Powtorka2Dzien {
    public static void main(String[] args) {
        System.out.println("Cześć, jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();
        System.out.println(wiek + " to całkiem nie dużo, " + imie + " !");
    }
}
