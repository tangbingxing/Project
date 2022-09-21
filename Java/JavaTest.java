/**
 * @author tangbingxing
 * @version 1.0
 */
public class JavaTest {
    public static void main(String[] args) {
        System.out.println("Hallow java!");
    }

    class A {
        B.cry();

        class B {
            public static void cry() {
                System.out.println("cry");
            }
        }
    }

}
