public class Bt03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreater = (x > y);
        boolean isLess = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("x == y: " + isEqual);
        System.out.println("x != y: " + isNotEqual);
        System.out.println("x > y: " + isGreater);
        System.out.println("x < y: " + isLess);
        System.out.println("x >= y: " + isGreaterOrEqual);
        System.out.println("x <= y: " + isLessOrEqual);

        if (x > y) {
            System.out.println("x lớn hơn y");
        } else if (x < y) {
            System.out.println("x nhỏ hơn y");
        } else {
            System.out.println("x bằng y");
        }

        double a = 5.5, b = 2.2;
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("str1 == str2: " + str1.equals(str2));

    }
}
