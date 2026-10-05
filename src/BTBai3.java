import java.util.Scanner;

public class BTBai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1: Tìm số lớn hơn[cite: 1]
        System.out.println("=== Bài 1 ===");
        System.out.print("Nhập a: ");
        int a1 = sc.nextInt();
        System.out.print("Nhập b: ");
        int b1 = sc.nextInt();
        System.out.println("Số lớn hơn: " + ((a1 > b1) ? a1 : b1));

        // Toán tử 3 ngôi
        if(a1 > b1)
            System.out.println("Số lớn hơn: " + a1);
        else
            System.out.println("Số lớn hơn: " + b1);

        int a = ((a1 > b1) ? a1 : b1);
        System.out.println("Số lớn hơn: " + a);

        // Bài 2: Tìm số lớn nhất trong 3 số[cite: 2]
        System.out.println("\n=== Bài 2 ===");
        System.out.print("a = ");
        int a2 = sc.nextInt();
        System.out.print("b = ");
        int b2 = sc.nextInt();
        System.out.print("c = ");
        int c2 = sc.nextInt();
        int max2 = a2;

        if (b2 > max2) max2 = b2;
        if (c2 > max2) max2 = c2;

        System.out.println("Số lớn nhất: " + max2);


        // Bài 3: Kiểm tra năm nhuận[cite: 3]
        System.out.println("\n=== Bài 3 ===");
        System.out.print("Nhập một năm: ");
        int year3 = sc.nextInt();
        if ((year3 % 400 == 0) || (year3 % 4 == 0 && year3 % 100 != 0)) {
            System.out.println(year3 + " -> Năm nhuận");
        } else {
            System.out.println(year3 + " -> Không phải năm nhuận");
        }

        // Bài 4: Số ngày trong tháng[cite: 4]
        System.out.println("\n=== Bài 4 ===");
        System.out.print("Nhập tháng: ");
        int month4 = sc.nextInt();
        System.out.print("Nhập năm: ");
        int year4 = sc.nextInt();
        switch (month4) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Số ngày: 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("Số ngày: 30");
                break;
            case 2:
                boolean isLeap = (year4 % 400 == 0) || (year4 % 4 == 0 && year4 % 100 != 0);
                System.out.println("Số ngày: " + (isLeap ? 29 : 28));
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
        }

        // Bài 5: Máy tính đơn giản[cite: 5]
        System.out.println("\n=== Bài 5 ===");
        System.out.print("Số a: ");
        double a5 = sc.nextDouble();
        System.out.print("Số b: ");
        double b5 = sc.nextDouble();
        System.out.print("Phép toán (+, -, *, /, %): ");
        char op5 = sc.next().charAt(0);
        switch (op5) {
            case '+': System.out.println("Kết quả: " + (a5 + b5)); break;
            case '-': System.out.println("Kết quả: " + (a5 - b5)); break;
            case '*': System.out.println("Kết quả: " + (a5 * b5)); break;
            case '/':
                if (b5 == 0) System.out.println("Không thể chia cho 0");
                else System.out.println("Kết quả: " + (a5 / b5));
                break;
            case '%':
                if (b5 == 0) System.out.println("Không thể chia cho 0");
                else System.out.println("Kết quả: " + (a5 % b5));
                break;
            default: System.out.println("Phép toán không hợp lệ");
        }

        // Bài 6: Menu chương trình[cite: 6]
        System.out.println("\n=== Bài 6 ===");
        System.out.println(" MENU \n1. Tính tổng\n2. Tính hiệu\n3. Tính tích\n4. Tính thương\n5. Thoát");
        System.out.print("Nhập lựa chọn: ");
        int ch6 = sc.nextInt();
        switch (ch6) {
            case 1:
                System.out.print("Nhập 2 số: ");
                System.out.println("Tổng = " + (sc.nextDouble() + sc.nextDouble()));
                break;
            case 2:
                System.out.print("Nhập 2 số: ");
                System.out.println("Hiệu = " + (sc.nextDouble() - sc.nextDouble()));
                break;
            case 3:
                System.out.print("Nhập 2 số: ");
                System.out.println("Tích = " + (sc.nextDouble() * sc.nextDouble()));
                break;
            case 4:
                System.out.print("Nhập 2 số: ");
                double num1 = sc.nextDouble(), num2 = sc.nextDouble();
                if (num2 == 0) System.out.println("Không thể chia cho 0");
                else System.out.println("Thương = " + (num1 / num2));
                break;
            case 5:
                System.out.println("Thoát");
                break;
            default:
                System.out.println("Không hợp lệ");
        }

        // Bài 7: In từ 1 đến n[cite: 7]
        System.out.println("\n=== Bài 7 ===");
        System.out.print("n = ");
        int n7 = sc.nextInt();
        for (int i = 1; i <= n7; i++) {
            System.out.println(i);
        }

        // Bài 8: In số chẵn từ 1 đến n[cite: 8]
        System.out.println("\n=== Bài 8 ===");
        System.out.print("n = ");
        int n8 = sc.nextInt();
        for (int i = 2; i <= n8; i += 2) {
            System.out.println(i);
        }

        // Bài 9: Tính tổng từ 1 đến n[cite: 9]
        System.out.println("\n=== Bài 9 ===");
        System.out.print("n = ");
        int n9 = sc.nextInt();
        long sum9 = 0;
        for (int i = 1; i <= n9; i++) sum9 += i;
        System.out.println("Tong = " + sum9);

        // Bài 10: Tính tổng số chẵn từ 1 đến n[cite: 10]
        System.out.println("\n=== Bài 10 ===");
        System.out.print("n = ");
        int n10 = sc.nextInt();
        long sum10 = 0;
        for (int i = 2; i <= n10; i += 2) sum10 += i;
        System.out.println("Tong = " + sum10);

        // Bài 11: Bảng cửu chương[cite: 11]
        System.out.println("\n=== Bài 11 ===");
        System.out.print("Nhập n: ");
        int n11 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n11 + " x " + i + " = " + (n11 * i));
        }

        // Bài 12: Tính giai thừa[cite: 12]
        System.out.println("\n=== Bài 12 ===");
        System.out.print("Nhập n: ");
        int n12 = sc.nextInt();
        long fact12 = 1;
        for (int i = 1; i <= n12; i++) fact12 *= i;
        System.out.println(n12 + "! = " + fact12);

        // Bài 13: Nhập số dương[cite: 13]
        System.out.println("\n=== Bài 13 ===");
        while (true) {
            System.out.print("Nhập số: ");
            int val13 = sc.nextInt();
            if (val13 > 0) {
                System.out.println("Số hợp lệ!");
                break;
            }
            System.out.println("Số phải lớn hơn 0!");
        }

        // Bài 14: Nhập mật khẩu[cite: 14]
        System.out.println("\n=== Bài 14 ===");
        sc.nextLine(); // Bỏ qua dòng trống
        while (true) {
            System.out.print("Nhập mật khẩu: ");
            String pass14 = sc.nextLine();
            if ("123456".equals(pass14)) {
                System.out.println("Đúng!");
                break;
            }
            System.out.println("Sai mật khẩu!");
        }

        // Bài 15: Menu lặp[cite: 15]
        System.out.println("\n=== Bài 15 ===");
        int ch15;
        do {
            System.out.println("===== MENU =====\n1. Xin chào\n2. Học Java\n3. Thoát");
            System.out.print("Nhập lựa chọn: ");
            ch15 = sc.nextInt();
        } while (ch15 != 3);

        // Bài 16: Break[cite: 16]
        System.out.println("\n=== Bài 16 ===");
        for (int i = 1; i <= 100; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        // Bài 17: Continue[cite: 17]
        System.out.println("\n=== Bài 17 ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }

        // Bài 18: Hệ thống xếp loại sinh viên[cite: 18]
        System.out.println("\n=== Bài 18 ===");
        sc.nextLine(); // Bỏ qua dòng trống
        System.out.print("Tên sinh viên: ");
        String name18 = sc.nextLine();
        double score18;
        while (true) {
            System.out.print("Điểm Java: ");
            score18 = sc.nextDouble();
            if (score18 >= 0 && score18 <= 10)
            {
                break;
            }
            System.out.println("Điểm phải từ 0 đến 10, vui lòng nhập lại!");
        }
        String rank18 = (score18 >= 9.0) ? "Xuất sắc" : (score18 >= 8.0) ? "Giỏi" : (score18 >= 6.5) ? "Khá" : (score18 >= 5.0) ? "Trung bình" : "Yếu";
        System.out.println("Sinh viên " + name18 + " - Điểm: " + score18 + " - Xếp loại: " + rank18);
    }
}