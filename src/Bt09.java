import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        LocalDate nextDay = date.plusDays(1);
        System.out.println("\nNgày tiếp theo là: " + nextDay);

        System.out.print("\nNhập ngày thứ hai:\n");
        System.out.print("Nhập ngày: ");
        int day2 = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month2 = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year2 = scanner.nextInt();

        LocalDate date2 = LocalDate.of(year2, month2, day2);

        long daysBetween = ChronoUnit.DAYS.between(date, date2);
        System.out.println("\nSố ngày giữa hai ngày là: " + Math.abs(daysBetween) + " ngày.");

        scanner.close();
    }
}
