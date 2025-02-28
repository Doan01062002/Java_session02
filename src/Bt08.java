import java.util.Scanner;

public class Bt08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập tên học sinh: ");
        String name = scanner.nextLine();

        System.out.println("Nhập điểm môn Toán: ");
        float math = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập điểm môn Toán: ");
        float physical = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập điểm môn Toán: ");
        float chemistry = Float.parseFloat(scanner.nextLine());

        float medium = (math + physical + chemistry)/3;

        System.out.println("Điểm trung bình là: " + medium);
    }
}
