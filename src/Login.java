import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kysytään käyttäjän tiedot
        System.out.println("Etunimi?");
        String firstName = input.nextLine();

        System.out.println("Sukunimi?");
        String lastName = input.nextLine();

        System.out.println("Yrityksen verkkotunnus?");
        String domain = input.nextLine();

        // Tarkistetaan, että kaikki tiedot on annettu
        if (firstName.isEmpty() || lastName.isEmpty() || domain.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        } else {
            GenerateEmail(firstName, lastName, domain);
            GenerateUsername(firstName, lastName);
        }

        input.close();
    }

    // Luodaan sähköpostiosoite annetuista tiedoista
    public static void GenerateEmail(String firstName, String lastName, String domain) {
        String email = firstName + "." + lastName + "@" + domain;
        System.out.println(email.toLowerCase());
    }

    // Luodaan käyttäjätunnus etu- ja sukunimestä
    public static void GenerateUsername(String firstName, String lastName) {
        String firstPart = firstName.substring(0, 4);
        String lastPart = lastName.substring(lastName.length() - 4);

        String username = firstPart + lastPart;
        System.out.println(username.toLowerCase());
    }
}