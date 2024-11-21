package cwiczenia_;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> cyfry = new ArrayList<>(); 
        
        System.out.println("Podaj liczbę: ");
        
        String input = scanner.nextLine(); // Odczytaj całą linię

        


        int liczba = Integer.parseInt(input);
        // Sprawdzanie, czy liczba jest pierwsza
        if (liczba <= 1) {
            System.out.println("Nie jest liczbą pierwszą.");
        } else {
            boolean jestPierwsza = true; // Zmienna do śledzenia, czy liczba jest pierwsza
            for (int i = 2; i <= Math.sqrt(liczba); i++) {
                if (liczba % i == 0) {
                    System.out.println("Nie jest liczbą pierwszą."); // Od razu informujemy, jeśli nie jest
                    jestPierwsza = false;
                    break; // Kończymy sprawdzanie, jeśli nie jest pierwsza
                }
            }
            if (jestPierwsza) {
                System.out.println("Jest liczbą pierwszą.");
            }
        }
        
        // Przekształcenie każdej cyfry w liście
        for (char c : input.toCharArray()) {
            int cyfra = Character.getNumericValue(c); // Zamiana znaku na cyfrę
            cyfry.add(cyfra); // Dodaj cyfrę do listy
        }
        
        System.out.println("Wprowadzone cyfry: " + cyfry);
        
        int parzyste = 0;
        int nieparzyste = 0;
        int iloscN = 0;
        int iloscP = 0;
        
        for (int cyfra : cyfry) {
            if ((cyfra % 2) == 0) {
                parzyste += cyfra;
                iloscP++;
            } else {
                nieparzyste += cyfra;
                iloscN++;
            }
        }
        
        double srednian = 0;
        double sredniap = 0;
        
        if (iloscN != 0) {
            srednian = (double) nieparzyste / iloscN;
        }
        if (iloscP != 0) {
            sredniap = (double) parzyste / iloscP;
        }
        
        System.out.println("Srednia parzystych to: " + sredniap + " Srednia nieparzystych: " + srednian);
        
        scanner.close();
    }
}
