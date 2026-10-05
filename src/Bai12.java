import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNguyen = 0;
        boolean check = false;

        while (!check) {
            try {
                System.out.print("Vui lòng nhập một số nguyên: ");
                soNguyen = scanner.nextInt(); // Dòng lệnh dễ gây lỗi nếu nhập chữ
                check = true; // Nếu không có lỗi, chuyển check thành true để thoát vòng lặp
            } catch (InputMismatchException e) {
                System.out.println("❌ Lỗi: Bạn phải nhập vào một số nguyên! Vui lòng thử lại.");

                // ĐIỀU QUAN TRỌNG NHẤT: Xóa bỏ dữ liệu lỗi trong bộ đệm
                scanner.next();
            }
        }

        System.out.println("🎉 Bạn đã nhập số thành công: " + soNguyen);
        scanner.close();
    }
}
