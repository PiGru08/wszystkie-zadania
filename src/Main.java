//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //zadania 1-8
/*
zadanie 1
public class Main {
    public static void main(String[] args) {


    for(int i = 10; i < 100; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
    }

 */
        /*
        zadanie 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie słowa z klawiatury
        String slowo = wpiszLiczbyZKlawiatury();

        // Sprawdzenie, czy słowo jest palindromem
        boolean palindrom = palindrom(slowo);

        if (palindrom) {
            System.out.println("Tak, jest palindromem");
        } else {
            System.out.println("Nie, nie jest palindromem");
        }
    }

    // Metoda do wczytywania słowa z klawiatury
    private static String wpiszLiczbyZKlawiatury() {
        System.out.println("Podaj słowo: ");
        Scanner klawiatura = new Scanner(System.in);
        return klawiatura.nextLine();
    }

    // Metoda sprawdzająca, czy słowo jest palindromem
    private static boolean palindrom(String slowo) {
        for (int i = 0, j = slowo.length() - 1; i < j; i++, j--) {
            if (slowo.charAt(i) != slowo.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
         */
        /*
        zadanie 3, liczba palindromiczna

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Znalezienie najbliższej liczby palindromicznej
        int najblizszyPalindrom = znajdzNajblizszyPalindrom(liczba);
        System.out.println("Najbliższa liczba palindromiczna dla " + liczba + " to: " + najblizszyPalindrom);
    }

    // Funkcja sprawdzająca, czy dana liczba jest palindromem
    private static boolean czyPalindrom(int liczba) {
        String liczbaStr = Integer.toString(liczba);
        int dlugosc = liczbaStr.length();

        for (int i = 0; i < dlugosc / 2; i++) {
            if (liczbaStr.charAt(i) != liczbaStr.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Funkcja znajdująca najbliższą liczbę palindromiczną
    private static int znajdzNajblizszyPalindrom(int liczba) {
        int mniejsza = liczba - 1;
        int wieksza = liczba + 1;

        // Sprawdzenie, czy sama liczba jest palindromem
        if (czyPalindrom(liczba)) {
            return liczba;
        }

        // Szukanie w dół i w górę najbliższego palindromu
        while (true) {
            if (czyPalindrom(mniejsza)) {
                return mniejsza;
            }
            if (czyPalindrom(wieksza)) {
                return wieksza;
            }
            mniejsza--;
            wieksza++;
        }
    }
}

         */
        /*
        zadanie 4 szyfr cezara

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie słowa z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo do zaszyfrowania: ");
        String slowo = scanner.nextLine();

        // Klucz szyfru Cezara
        int klucz = 3;

        // Szyfrowanie słowa
        String zaszyfrowaneSlowo = szyfrCezara(slowo, klucz);
        System.out.println("Zaszyfrowane słowo: " + zaszyfrowaneSlowo);
    }

    // Funkcja szyfrująca słowo szyfrem Cezara
    private static String szyfrCezara(String slowo, int klucz) {
        StringBuilder zaszyfrowane = new StringBuilder();

        for (int i = 0; i < slowo.length(); i++) {
            char znak = slowo.charAt(i);

            // Sprawdzamy, czy znak jest literą
            if (Character.isLetter(znak)) {
                char base = Character.isUpperCase(znak) ? 'A' : 'a'; // 'A' dla wielkich liter, 'a' dla małych
                char przesunietyZnak = (char) ((znak - base + klucz) % 26 + base); // Przesuwanie znaku w ramach alfabetu
                zaszyfrowane.append(przesunietyZnak);
            } else {
                // Jeśli znak nie jest literą, pozostaje bez zmian
                zaszyfrowane.append(znak);
            }
        }

        return zaszyfrowane.toString();
    }
}

         */
        /*
        zadanie 5 anagram
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz pierwsze słowo: ");
        ArrayList<Character> listaSlowo1 = wpiszDoTablicy();

        System.out.println("Wpisz drugie słowo: ");
        ArrayList<Character> listaSlowo2 = wpiszDoTablicy();

        // Sprawdzamy, czy dwa słowa są anagramami
        if (czyAnagram(listaSlowo1, listaSlowo2)) {
            System.out.println("Słowa są anagramami.");
        } else {
            System.out.println("Słowa nie są anagramami.");
        }
    }

    // Funkcja do wczytywania słowa i zapisywania go do listy znaków
    private static ArrayList<Character> wpiszDoTablicy() {
        System.out.println("Podaj słowo: ");
        Scanner klawiatura = new Scanner(System.in);
        String slowo = klawiatura.nextLine();
        ArrayList<Character> slowoLista = new ArrayList<>();

        // Dodajemy znaki słowa do listy
        for (int i = 0; i < slowo.length(); i++) {
            slowoLista.add(slowo.charAt(i));
        }
        return slowoLista;
    }

    // Funkcja sprawdzająca, czy dwie listy znaków są anagramami
    private static boolean czyAnagram(ArrayList<Character> listaSlowo1, ArrayList<Character> listaSlowo2) {
        // Jeśli długości są różne, nie mogą być anagramami
        if (listaSlowo1.size() != listaSlowo2.size()) {
            return false;
        }

        // Sortujemy obie listy
        Collections.sort(listaSlowo1);
        Collections.sort(listaSlowo2);

        // Sprawdzamy, czy posortowane listy są takie same
        return listaSlowo1.equals(listaSlowo2);
    }
}


         */
        /*
        zadanie 6 silnia

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Obliczenie sumy silni cyfr
        int sumaSilni = sumaSilniCyfr(liczba);
        System.out.println("Suma silni cyfr liczby " + liczba + " to: " + sumaSilni);
    }

    // Funkcja obliczająca sumę silni cyfr liczby
    private static int sumaSilniCyfr(int liczba) {
        int suma = 0;

        // Dla każdej cyfry liczby obliczamy jej silnię
        while (liczba > 0) {
            int cyfra = liczba % 10;  // Pobranie ostatniej cyfry
            suma += silnia(cyfra);    // Dodanie silni cyfry do sumy
            liczba /= 10;             // Usunięcie ostatniej cyfry
        }

        return suma;
    }

    // Funkcja obliczająca silnię danej liczby
    private static int silnia(int n) {
        if (n == 0 || n == 1) {
            return 1; // Silnia 0! i 1! to 1
        }

        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}

         */
        /*
        zadanie 7 liczba pierwsza
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Wczytanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Sprawdzenie, czy liczba jest liczbą pierwszą
        if (czyLiczbaPierwsza(liczba)) {
            System.out.println("Liczba " + liczba + " jest liczbą pierwszą.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest liczbą pierwszą.");
        }
    }

    // Funkcja sprawdzająca, czy liczba jest liczbą pierwszą
    private static boolean czyLiczbaPierwsza(int liczba) {
        // Liczby mniejsze niż 2 nie są pierwsze
        if (liczba < 2) {
            return false;
        }

        // Sprawdzanie dzielników od 2 do pierwiastka z liczby
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false; // Znaleziono dzielnik, więc liczba nie jest pierwsza
            }
        }

        // Jeśli nie znaleziono żadnego dzielnika, liczba jest pierwsza
        return true;
    }
}

         */
        /*
        zadanie 8 haslo

        import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        // Długość hasła
        int dlugoscHasla = 20;

        // Znaki, które mogą wystąpić w haśle
        String wielkieLitery = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String maleLitery = "abcdefghijklmnopqrstuvwxyz";
        String cyfry = "0123456789";
        String znakiSpecjalne = "!@#$%^&*()-_=+<>?";

        // Wszystkie możliwe znaki
        String wszystkieZnaki = wielkieLitery + maleLitery + cyfry + znakiSpecjalne;

        // Generowanie losowego hasła
        String haslo = generujHaslo(wszystkieZnaki, dlugoscHasla);
        System.out.println("Wygenerowane hasło: " + haslo);
    }

    private static String generujHaslo(String znaki, int dlugosc) {
        SecureRandom random = new SecureRandom();
        StringBuilder haslo = new StringBuilder(dlugosc);

        // Dodawanie losowych znaków do hasła
        for (int i = 0; i < dlugosc; i++) {
            int index = random.nextInt(znaki.length());
            haslo.append(znaki.charAt(index));
        }

        return haslo.toString();
    }
}
         */

        //zadania 1-5
        /*
        zadanie 1 pierwiastki z idneksów
        public class Main {
    public static void main(String[] args) {
        // Deklaracja tablicy 10 liczb rzeczywistych
        double[] tablicaPierwiastkow = new double[10];

        // Wypełnianie tablicy pierwiastkami z indeksów
        for (int i = 0; i < tablicaPierwiastkow.length; i++) {
            tablicaPierwiastkow[i] = Math.sqrt(i); // Obliczanie pierwiastka z indeksu
        }

        // Wyświetlanie zawartości tablicy
        for (int i = 0; i < tablicaPierwiastkow.length; i++) {
            System.out.println("Pierwiastek z " + i + " to " + tablicaPierwiastkow[i]);
        }
    }
}

         */
        /*
        zadanie 2 ciąg fibonaciego

        public class Main {
    public static void main(String[] args) {
        // Deklaracja tablicy 40 liczb całkowitych
        int[] ciagFibonacciego = new int[40];

        // Inicjalizacja pierwszych dwóch liczb ciągu Fibonacciego
        ciagFibonacciego[0] = 0; // Pierwszy element to 0
        ciagFibonacciego[1] = 1; // Drugi element to 1

        // Wypełnianie tablicy kolejnymi liczbami ciągu Fibonacciego
        for (int i = 2; i < ciagFibonacciego.length; i++) {
            ciagFibonacciego[i] = ciagFibonacciego[i - 1] + ciagFibonacciego[i - 2]; // Każda liczba to suma dwóch poprzednich
        }

        // Wyświetlanie zawartości tablicy
        for (int i = 0; i < ciagFibonacciego.length; i++) {
            System.out.println("Fibonacci[" + i + "] = " + ciagFibonacciego[i]);
        }
    }
}
LUB

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Deklaracja tablicy 40 liczb całkowitych
        int[] ciagFibonacciego = new int[40];

        // Inicjalizacja pierwszych dwóch liczb ciągu Fibonacciego
        ciagFibonacciego[0] = 0;
        ciagFibonacciego[1] = 1;

        // Wypełnianie tablicy kolejnymi liczbami ciągu Fibonacciego
        for (int i = 2; i < ciagFibonacciego.length; i++) {
            ciagFibonacciego[i] = ciagFibonacciego[i - 1] + ciagFibonacciego[i - 2];
        }

        // Wczytywanie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        // Znalezienie najbliższej liczby Fibonacciego przy pomocy wyszukiwania binarnego
        int najblizszaLiczbaFibonacciego = znajdzNajblizszaFibonacci(ciagFibonacciego, liczba);
        System.out.println("Najbliższa liczba Fibonacciego dla liczby " + liczba + " to: " + najblizszaLiczbaFibonacciego);
    }

    // Funkcja wykonująca wyszukiwanie binarne w celu znalezienia najbliższej liczby Fibonacciego
    private static int znajdzNajblizszaFibonacci(int[] ciagFibonacciego, int liczba) {
        int lewy = 0;
        int prawy = ciagFibonacciego.length - 1;

        // Wyszukiwanie binarne
        while (lewy <= prawy) {
            int srodek = lewy + (prawy - lewy) / 2;

            // Jeżeli znajdziemy dokładną liczbę Fibonacciego, zwracamy ją
            if (ciagFibonacciego[srodek] == liczba) {
                return ciagFibonacciego[srodek];
            }

            // Jeśli liczba w środku jest większa niż szukana, przesuwamy prawą granicę
            if (ciagFibonacciego[srodek] > liczba) {
                prawy = srodek - 1;
            } else { // W przeciwnym razie przesuwamy lewą granicę
                lewy = srodek + 1;
            }
        }

        // Po zakończeniu wyszukiwania, lewy i prawy wskazują na najbliższe liczby
        // Sprawdzamy, która z liczb jest bliższa
        if (prawy < 0) {
            return ciagFibonacciego[lewy]; // Jeśli prawy jest poza zakresem, zwróć lewy
        }
        if (lewy >= ciagFibonacciego.length) {
            return ciagFibonacciego[prawy]; // Jeśli lewy jest poza zakresem, zwróć prawy
        }

        // Zwracamy bliższą z dwóch liczb: ciagFibonacciego[lewy] lub ciagFibonacciego[prawy]
        if (Math.abs(ciagFibonacciego[lewy] - liczba) < Math.abs(ciagFibonacciego[prawy] - liczba)) {
            return ciagFibonacciego[lewy];
        } else {
            return ciagFibonacciego[prawy];
        }
    }
}

         */
        /*
        zadanie 3 losowanie różnych liczb

        import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Deklaracja tablicy na 100 liczb losowych
        int[] tablicaLiczb = new int[100];
        Random random = new Random();

        // Wypełnianie tablicy liczbami losowymi z zakresu 1-100
        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = random.nextInt(100) + 1; // Losowanie liczby od 1 do 100
        }

        // Deklaracja dwóch kolekcji: parzystych i nieparzystych
        ArrayList<Integer> liczbyParzyste = new ArrayList<>();
        ArrayList<Integer> liczbyNieparzyste = new ArrayList<>();

        // Dodawanie liczb z tablicy do odpowiednich kolekcji
        for (int liczba : tablicaLiczb) {
            if (liczba % 2 == 0) {
                liczbyParzyste.add(liczba); // Liczba parzysta
            } else {
                liczbyNieparzyste.add(liczba); // Liczba nieparzysta
            }
        }

        // Zliczanie unikalnych liczb
        Set<Integer> unikalneLiczby = new HashSet<>();
        for (int liczba : tablicaLiczb) {
            unikalneLiczby.add(liczba); // HashSet automatycznie przechowuje unikalne liczby
        }

        // Wyniki
        System.out.println("Liczby parzyste: " + liczbyParzyste);
        System.out.println("Liczby nieparzyste: " + liczbyNieparzyste);
        System.out.println("Liczba różnych (unikalnych) liczb wylosowanych: " + unikalneLiczby.size());
    }
}

         */
        /*
        zadanie 4 mediana
        import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StatystykiTablicy {
    public static void main(String[] args) {
        // Przykładowa tablica z wylosowanymi wartościami
        int[] tablica = {5, 3, 9, 1, 3, 7, 3, 8, 2, 6};

        // Sortowanie tablicy
        Arrays.sort(tablica);
        System.out.println("Posortowana tablica: " + Arrays.toString(tablica));

        // Znalezienie mediany
        double mediana;
        int srodek = tablica.length / 2;
        if (tablica.length % 2 == 0) {
            mediana = (tablica[srodek - 1] + tablica[srodek]) / 2.0;
        } else {
            mediana = tablica[srodek];
        }
        System.out.println("Mediana: " + mediana);

        // Znalezienie dominanty
        Map<Integer, Integer> licznik = new HashMap<>();
        for (int liczba : tablica) {
            licznik.put(liczba, licznik.getOrDefault(liczba, 0) + 1);
        }
        int dominanta = tablica[0];
        int maxLiczbaWystapien = 0;
        for (Map.Entry<Integer, Integer> entry : licznik.entrySet()) {
            if (entry.getValue() > maxLiczbaWystapien) {
                maxLiczbaWystapien = entry.getValue();
                dominanta = entry.getKey();
            }
        }
        System.out.println("Dominanta: " + dominanta);

        // Znalezienie wartości średniej
        double suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        double srednia = suma / tablica.length;
        System.out.println("Średnia: " + srednia);
    }
}

         */
        /*
        zadanie 5 sito eratostenesa
        import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Wygenerowanie liczb pierwszych mniejszych od 1000
        List<Integer> liczbyPierwsze = generujLiczbyPierwsze(1000);

        // Wczytanie zakresu od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość x (0 <= x < 1000): ");
        int x = scanner.nextInt();
        System.out.print("Podaj wartość y (x < y < 1000): ");
        int y = scanner.nextInt();

        if (x < 0 || y >= 1000 || x >= y) {
            System.out.println("Zakres wartości jest niepoprawny.");
            return;
        }

        // Wypisanie liczb pierwszych w zakresie od x do y
        System.out.println("Liczby pierwsze w zakresie od " + x + " do " + y + ":");
        for (int liczba : liczbyPierwsze) {
            if (liczba >= x && liczba <= y) {
                System.out.println(liczba);
            }
        }
    }

    // Funkcja generująca liczby pierwsze mniejsze od n za pomocą sita Eratostenesa
    private static List<Integer> generujLiczbyPierwsze(int n) {
        boolean[] czyPierwsza = new boolean[n];
        for (int i = 2; i < n; i++) {
            czyPierwsza[i] = true; // Zakładamy, że wszystkie liczby są pierwsze
        }

        // Sito Eratostenesa
        for (int i = 2; i * i < n; i++) {
            if (czyPierwsza[i]) {
                for (int j = i * i; j < n; j += i) {
                    czyPierwsza[j] = false; // Oznaczanie liczb niepierwszych
                }
            }
        }

        // Zbieranie liczb pierwszych
        List<Integer> liczbyPierwsze = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (czyPierwsza[i]) {
                liczbyPierwsze.add(i);
            }
        }

        return liczbyPierwsze;
    }
}

         */
        }
    }
