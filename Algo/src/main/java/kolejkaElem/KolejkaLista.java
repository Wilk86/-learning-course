package kolejkaElem;

public class KolejkaLista {

    private KolejkaElem first;

    private KolejkaElem last;

    public KolejkaLista() {
        first = last = null;

    }

    public void add(int value) {
        KolejkaElem elem = new KolejkaElem(value, null);

        if (first == null) {
            first = last = elem;
        } else {
            last.setNext(elem);
            last = elem;

        }
    }

    public int poll() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int value = first.getValue();

        if (first.getNext() == null) {
            first = last = null;
        } else {

            first = first.getNext();
        }
        return value;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return first.getValue();
    }

    public void print(){
        KolejkaElem tmpElem = first;
        while (tmpElem != null){
            System.out.println(tmpElem.getValue()+" ");
            tmpElem = tmpElem.getNext();
        }
        System.out.println();
    }

}
