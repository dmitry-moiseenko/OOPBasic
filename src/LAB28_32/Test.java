package LAB28_32;

/**
 * Created by Dmitriy on 5/8/2018.
 */
public class Test {
    public static void main(String[] args) {
        Liner liner = new Liner("LinerGP", 50.0f, 20.5f, 30.0f, 20);
        System.out.println(liner.toPrint());
        System.out.println(liner.calculatePayment());
    }
}
