package testinstrumentation;

public class Test {
    public void methodOne() {
        System.out.println("Method One");
    }
}
class Dog extends Test{
    public void methodOne() {
        System.out.println("Dog Method One");
    }
}
