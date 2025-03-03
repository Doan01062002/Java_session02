import java.util.Scanner;
public class Bt08 {
    public static void main(String[] args) {
        String studentId;
        String fullName;
        int gender;
        String birthDate;
        float mathScore;
        float physicsScore;
        float chemistryScore;
        float biologyScore;
        float englishScore;
        float averageScore;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Mã sinh viên: ");
        studentId = scanner.nextLine();
        System.out.print("Họ tên sinh viên: ");
        fullName = scanner.nextLine();
        System.out.print("Giới tính (1: Nam, 2: Nữ): ");
        gender = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Năm sinh (dd/mm/yy): ");
        birthDate = scanner.nextLine();
        System.out.print("Điểm môn Toán: ");
        mathScore = scanner.nextFloat();
        System.out.print("Điểm môn Lý: ");
        physicsScore = scanner.nextFloat();
        System.out.print("Điểm môn Hóa: ");
        chemistryScore = scanner.nextFloat();
        System.out.print("Điểm môn Sinh: ");
        biologyScore = scanner.nextFloat();
        System.out.print("Điểm môn Ngoại ngữ: ");
        englishScore = scanner.nextFloat();

        averageScore = (mathScore + physicsScore + chemistryScore + biologyScore + englishScore) / 5;

        System.out.println("\n--- Thông tin sinh viên ---");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Giới tính: " + (gender == 1 ? "Nam" : "Nữ"));
        System.out.println("Năm sinh: " + birthDate);
        System.out.println("Điểm môn Toán: " + mathScore);
        System.out.println("Điểm môn Lý: " + physicsScore);
        System.out.println("Điểm môn Hóa: " + chemistryScore);
        System.out.println("Điểm môn Sinh: " + biologyScore);
        System.out.println("Điểm môn Ngoại ngữ: " + englishScore);
        System.out.printf("Điểm trung bình: %.2f\n", averageScore);
    }
}
