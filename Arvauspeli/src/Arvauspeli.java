import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    String salaisuus = "Emma";
    String muuttuja;
    int yritys = 0;

      while (true) {
            System.out.println("Guess my name (type stop to exit)");
            muuttuja = scanner.nextLine();
            

            if (muuttuja.equalsIgnoreCase("stop")) {
                
                break;
            }
                yritys++;
                
            if (muuttuja.equalsIgnoreCase(salaisuus)) {
                System.out.println("Congratulations!");
                break;
            }  
        }
        System.out.println("You guessed " + yritys + " times.");
        scanner.close();

    }
}
