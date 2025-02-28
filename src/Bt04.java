public class Bt04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a && b) {
            System.out.println("Cả hai đều đúng");
        } else {
            System.out.println("Không phải cả hai đều đúng");
        }

        if (a || b) {
            System.out.println("Ít nhất một đúng");
        } else {
            System.out.println("Cả hai đều sai");
        }

        if (!a && b) {
            System.out.println("Không đúng");
        } else {
            System.out.println("Điều kiện (!a && b) không thỏa mãn");
        }

        // Đảo ngược giá trị của c
        System.out.println("Giá trị ban đầu của c: " + c);
        c = !c;
        System.out.println("Giá trị sau khi đảo ngược của c: " + c);

        // Kiểm tra điều kiện logic phức tạp hơn
        if ((a || b) && !c) {
            System.out.println("Điều kiện ((a || b) && !c) thỏa mãn");
        } else {
            System.out.println("Điều kiện ((a || b) && !c) không thỏa mãn");
        }
    }
}
