import java.util.Scanner;
public class run {
    public static void main(String[] args){
        System.out.println("Pierwsza klasa");
        String zapytanie;
        String laby;
        String zad;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Czy chcesz wprowadzić zapytanie tak/nie");
        String odp = odczyt.nextLine();
        while ("tak".equals(odp)){
            System.out.println("Podaj numer labarotoriów");
            laby = odczyt.nextLine();
            System.out.println("Podaj numer zadania");
            zad = odczyt.nextLine();
            Integer x = Integer.valueOf(laby);
            Integer y = Integer.valueOf(zad);
            System.out.println("Podaj treść zapytania");
            zapytanie = odczyt.nextLine();
            zadanie.dodaj(zapytanie, x, y);
            System.out.println("Czy chcesz wprowadzić zapytanie tak/nie");
            odp = odczyt.nextLine();
        }
        zadanie.wys();

}}
