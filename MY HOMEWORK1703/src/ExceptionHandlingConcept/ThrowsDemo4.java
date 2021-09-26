package ExceptionHandlingConcept;

public class ThrowsDemo4 {
    public static void main(String[] args) {
        ThrowsDemo4 obj = new ThrowsDemo4();
        obj.name();
        System.out.println("hi");
    }

    public void name() {
        div();

    }

    public void div() {
        try {
            int a = 2 / 0;

        }
        catch (ArithmeticException a) {
            a.printStackTrace();
        }

    }
}