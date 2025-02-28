import java.util.Scanner;

public class Bt05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập chiều dài");
        int a = scanner.nextInt();
        System.out.println("Vui lòng nhập chiều rộng");
        int b = scanner.nextInt();

        System.out.println("Diện tích hình chữ nhật: " + a*b);
        System.out.println("Chu vi hình chữ nhật" + 2*(a+b));
    }
}
