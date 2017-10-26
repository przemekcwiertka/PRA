public class zadanie {

    private static   String[] tab = new String[100];
    public static void dodaj(String a, int lab, int zad){
            int pom = lab * zad;
            tab[pom] = a;
    }
    public static void wys(){
        for(int i = 1; i < 100; i++){
            if (tab[i] != null){
                System.out.println(tab[i]);
            }
        }
    }
}
