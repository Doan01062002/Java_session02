import java.math.BigInteger;
import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên lớn thứ nhất: ");
            BigInteger num1 = new BigInteger(scanner.nextLine());

            System.out.print("Nhập số nguyên lớn thứ hai: ");
            BigInteger num2 = new BigInteger(scanner.nextLine());

            System.out.println("\nKết quả:");
            System.out.println("Cộng: " + num1.add(num2));
            System.out.println("Trừ: " + num1.subtract(num2));
            System.out.println("Nhân: " + num1.multiply(num2));

            if (!num2.equals(BigInteger.ZERO)) { // Kiểm tra chia cho 0
                System.out.println("Chia: " + num1.divide(num2));
                System.out.println("Modulo: " + num1.mod(num2));
            } else {
                System.out.println("Không thể chia hoặc modulo cho 0.");
            }

            System.out.print("\nNhập số mũ: ");
            int exponent = scanner.nextInt();
            if (exponent >= 0) {
                System.out.println("Lũy thừa: " + num1.pow(exponent));
            } else {
                System.out.println("Số mũ phải là số nguyên không âm.");
            }

        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
