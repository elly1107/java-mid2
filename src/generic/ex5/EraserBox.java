package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        //return parma instanceof T; 오류
        return false;
    }

    public void create() {
        // return new T(); 오류
    }
}
