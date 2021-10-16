public class TestSape {
    public static void main(String[] args) {
        Shape d1 = new Shape("Circle");
        System.out.println(d1);
        d1.setType("Square");
        System.out.println(d1);
        System.out.println(d1.getType());
    }
}
