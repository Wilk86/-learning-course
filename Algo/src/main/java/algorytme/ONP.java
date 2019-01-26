package algorytme;

import Stos.StosLista;
import Stos.StosListaOutOfIndex;
import org.omg.PortableInterceptor.INACTIVE;

public class ONP {

    public ONP() {

    }

    public void run(String[] tab) {

        StosLista stosLista = new StosLista();

        for (String e : tab) {
            try {
                int value = Integer.parseInt(e);
                stosLista.push(value);
                //stosLista.print();

            } catch (NumberFormatException ex) {
                int valueFirstElement = 0;
                int valueSecondElement = 0;

                try {
                    valueSecondElement = stosLista.pop();
                    valueFirstElement = stosLista.pop();
                } catch (StosListaOutOfIndex stosListaOutOfIndex) {
                    stosListaOutOfIndex.printStackTrace();
                }

                int count = 0;

                switch (e) {
                    case "+":
                        count = valueFirstElement + valueSecondElement;
                        break;
                    case "-":
                        count = valueFirstElement - valueSecondElement;
                        break;
                    case "*":
                        count = valueFirstElement * valueSecondElement;
                        break;
                    case "/":
                        count = valueFirstElement / valueSecondElement;
                        break;

                }

                stosLista.push(count);
            }
        }
        try {
            int result = stosLista.pop();
            System.out.println("Wynik: " + result);
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace();
        }

    }


}
