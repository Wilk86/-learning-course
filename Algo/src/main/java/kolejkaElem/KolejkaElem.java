package kolejkaElem;

public class KolejkaElem {

    private int value;


    private KolejkaElem next;

    public KolejkaElem(int value, KolejkaElem next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }
}
