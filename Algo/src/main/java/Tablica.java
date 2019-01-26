public class Tablica {

    public void parzysteMiejsca(int[] tab) {

        for (int i = tab.length - 1; i >= 1; i--) {
            if ((i % 2) == 0) System.out.println(tab[i]+" Even");
        }
    }

    public void podzielnePrzezTrzy(int[] tab) {
        int suma = 0;

        for (int e : tab)
            if ((e % 3) == 0) {
                suma += e; // suma = suma + e


            }
        System.out.println(suma+"PrzezTrzy");

    }

    public void sumaPiecuMinusOstatnia(int[] tab) {
        if (tab.length < 6) {
            System.out.println("Za malo elementow");

        }
        int wynik = 0;

        for (int i = 0; i < 5; i++) {
            wynik += tab[1];
            System.out.println(wynik +" Wynik");
        }
    }
}
