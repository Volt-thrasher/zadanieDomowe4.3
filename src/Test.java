public class Test {
    public static void main(String[] args) {
        RightTest rightTest = new RightTest();
        Triangle triangle1 = new Triangle(4,3,5);
        Triangle triangle2 = new Triangle(12, 14,6);

       boolean right1 = rightTest.isRightTriangle(triangle1);
       boolean right2 = rightTest.isRightTriangle(triangle2);

        System.out.println("Trojjkat 1 jest prostokatny? "+right1);
        System.out.println("Trojjkat 2 jest prostokatny? "+right2);
    }
}
