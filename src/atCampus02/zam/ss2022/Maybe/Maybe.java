package atCampus02.zam.ss2022.Maybe;
//generische version der Klasse - der Typ T wird dann ersetzt durch konkreten Typ
// nach erzeugung einer Instanz
public class Maybe<T> {
    private T data;
    private int status;

    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }

    public void print () {
        switch (status) {
            case 1 :
                System.out.println("Zugriff gewährt: " + data);
                break;
            case 2 :
                System.out.println("Geht dich nichts an");
                break;
            case 3 :
                System.out.println("Daten nicht erfasst!");
                break;
            default:
                System.out.println("Bitte status zwischen 1 und 3 wählen!");
                break;
        }
    }
}
