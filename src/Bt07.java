import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giờ ban đầu: ");
        int hours = scanner.nextInt();
        System.out.print("Nhập phút ban đầu: ");
        int minutes = scanner.nextInt();
        System.out.print("Nhập giây ban đầu: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        System.out.print("Nhập số giờ cần cộng: ");
        int addHours = scanner.nextInt();
        System.out.print("Nhập số phút cần cộng: ");
        int addMinutes = scanner.nextInt();
        System.out.print("Nhập số giây cần cộng: ");
        int addSeconds = scanner.nextInt();

        int addTotalSeconds = addHours * 3600 + addMinutes * 60 + addSeconds;
        totalSeconds += addTotalSeconds;

        int finalHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int finalMinutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;

        System.out.println("\nThời gian sau khi cộng: " + finalHours + " giờ " + finalMinutes + " phút " + finalSeconds + " giây.");

        scanner.close();
    }
}
