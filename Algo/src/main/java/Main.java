import Stos.StosLista;
import Stos.StosListaOutOfIndex;
import algorytme.ONP;
import kolejkaElem.KolejkaLista;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //wywolajONP();
        //  wywolajKolejkaLista();
        //  wywolajStosList();
        //  wywolajStosTab();
        //  wywolajTablice();
        //  wywolajStosPetla();

    }






    public static void wywolajONP() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrazenie");
        String input = scanner.nextLine();
        String[] operation = input.split(" ");


        new ONP().run(operation);


    }

    public static void wywolajKolejkaLista() {

        KolejkaLista kolejkaLista = new KolejkaLista();

        kolejkaLista.add(1);
        kolejkaLista.add(2);
        kolejkaLista.add(3);

        kolejkaLista.print();

        System.out.println("poll: " + kolejkaLista.poll());
        System.out.println("peek: " + kolejkaLista.peek());
        System.out.println("poll: " + kolejkaLista.poll());

        kolejkaLista.add(5);
        kolejkaLista.add(7);

        kolejkaLista.print();
    }

    public static void wywolajStosList() {
        StosLista stosLista = new StosLista();
        stosLista.push(1);
        stosLista.push(2);
        stosLista.push(3);

        stosLista.print();

        try {
            System.out.println("pop: " + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("pop: " + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

        stosLista.push(4);
        stosLista.push(5);


        try {
            System.out.println("peek: " + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("pop: " + stosLista.pop());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            System.out.println("peek: " + stosLista.peek());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }
        try {
            stosLista.pop();
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }


        stosLista.print();
    }


    public static void wywolajStosTab() {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Podaj rozmiar stosu");
        int size = scanner.nextInt();
        StosTablicy stosTablicy = new StosTablicy(size);


        while (true) {
            System.out.println("Podaj operacje" + " 1. push()" + " 2. pop()" + " 3. peek()" + " 4. print()" + " 0. wyjcsie");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Podaj wartosc");
                    int value = scanner.nextInt();
                    try {
                        stosTablicy.push(value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(stosTablicy.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(stosTablicy.peek());

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        stosTablicy.print();

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    return;

            }
        }


    }

    public static void wywolajTablice() {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18}; // 17

        Tablica tablica = new Tablica();
        tablica.parzysteMiejsca(tab);
        tablica.podzielnePrzezTrzy(tab);
        tablica.sumaPiecuMinusOstatnia(tab);


    }


}
