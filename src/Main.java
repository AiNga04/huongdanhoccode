public class Main {
    public static void main(String[] args) {
        // Lệnh in ra màn hình Hello
//        System.out.println("Hello");

        //Biến
        // - trong java thì biến là một cái vùng nhớ để lưu trữ dữ liệu

        // Cú pháp
        // kiểu_dữ_liệu tên_biến = giá_trị;

        int age = 20;
        System.out.println("age =" + " " + age);

        // Kiểu dữ liệu
        // Số nguyên
        byte month = 12;
        System.out.println("month =" + month);

        short year = 1970;
        System.out.println("year =" + year);

        int ngayHaiChin = 29;
        System.out.println("day =" + ngayHaiChin);

        long salary = 10000L;
        System.out.println("salary =" + salary);

//        Số thực
        float gpa = 9.5f;
        System.out.println("gpa =" + gpa);

        double salary2 = 10000.50;
        System.out.println("salary2 =" + salary2);

//        Ký tự
        char gender = 'M';
        System.out.println("gender =" + gender);

//        Boolean
        boolean flag = true;
        System.out.println("flag = " + flag);

//        Chuỗi
        String name = "Trương Ái Nga";
        System.out.println("name = " + name);

//        Hằng số
        final double HANG_SO = 3.14;
        System.out.println("PI = " + HANG_SO);

//        Không đặt tên biến trùng với từ khóa của java
//        int static = 20;
//        tên không bắt đầu bằng số
//        int 0abb = 20;

//        Toán tử số học
//        +, - , *, /, %

        int a = 2;
        int b = 3;

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Nhân: " + (a * b));
        System.out.println("Chia: " + ((float)a / b));
        System.out.println("Chia: " + (1.0*a / b));
        System.out.println("Chia lấy dư: " + (a % b));

//        Toán tử quan hệ
//        >, <, >=, <=, ==, !=
        System.out.println(">: " + (a > b));
        System.out.println("<: " + (a < b));
        System.out.println(">=: " + (a >= b));
        System.out.println("<=: " + (a <= b));
        System.out.println("==: " + (a == b));
        System.out.println("!=: " + (a != b));

//        = phép gán
//        == phép so sánh

//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/AiNga04/hoccode.git
//        git push -u origin main
    }
}