package session2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Phone Factory");
        System.out.println("What kind of phone would you like us to build?");
        System.out.println("samsung|iphone");

        System.out.println("Your option: ");

        String option = scanner.nextLine().toLowerCase();

        switch (option){
            case "samsung":
                System.out.print("model: ");
                String model = scanner.nextLine();
                System.out.print("brand: ");
                String brand = scanner.nextLine();
                System.out.print("touchScreen? (true/false");
                boolean touchScreen = scanner.hasNextBoolean();
                System.out.println("5G? (true/false");
                boolean fiveG = scanner
                System.out.print("Capacity?: ");
                int capacity = scanner.nextInt();
                scanner.nextLine();
                Samsung samsung = new Samsung(model, brand, touchScreen, fiveG,capacity, os);
                System.out.println("Your phone is ready: ");

                break;
            case "iphone":

                break;
            default:
                System.out.println("Invalid phone type");
        }
    }
}
