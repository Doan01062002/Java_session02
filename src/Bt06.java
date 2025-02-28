import java.util.Scanner;

public class Bt06 {
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

        if (medium >=8 ) {
            System.out.println("Xếp loại giỏi");
        } else if (6.5 <= medium ) {
            System.out.println("Xếp loại khá");
        } else if (medium >= 5) {
            System.out.println("Xếp loại trung bình");
        }else {
            System.out.println("Xếp loại yếu");
        }
    }
}
