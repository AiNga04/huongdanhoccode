import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
//        Cấu trúc điều khiển
//        - if/else
//        - switch case
//        - for / while /do while

//        1. if
//        if(condition){
//            code
//        }

        int age = 20;
        if (age > 18) {
            System.out.println("Chưa đủ tuổi!");
        }

        if (age > 18) System.out.println("Chưa đủ tuổi!");

//        2. if - else
//        if(conditon){
//            code
//            chạy condition true
//        }
//        else{
//            code
//            chạy khi condition false
//        }

        age = 12;
        if (age < 18) {
            System.out.println("Chưa đủ tuổi!");
        } else {
            System.out.println("Đã đủ tuổi!");
        }

//        3. if - else if - else
//        if(conditon1){
//            code
//            chạy condition1 true
//        }
//        else if(conditon2){
//            code
//            chạy condition2 true
//        }
//        else{
//            code
//            chạy khi false
//        }

        double gpa = 7.5;
        if (gpa >= 8.5) {
            System.out.println("Học lực giỏi");
        } else if (gpa >= 6.5) {
            System.out.println("Học lực Khá");
        } else if (gpa >= 5) {
            System.out.println("Học lực TB");
        } else {
            System.out.println("Học lực Yếu");
        }

//        4. switch case
        int day = 1;
        switch (day) {
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            case 8:
                System.out.println("Chủ Nhật");
                break;
            default:
                System.out.println("Thứ không hợp lệ!");
                break;
        }

//        5. for
//        for(khởi tạo; điều kiện; cập nhật){
//
//        }

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

//        6. while
        int idx = 5;
        while (idx < 5) {
            System.out.println(idx);
            idx--;
        }

//        7. do - while
        idx = 5;
        do {
            System.out.println(idx);
            idx--;
        } while (idx < 5 && idx > 0);

//        if: rẽ nhánh
//        switch - case: nhiều trường hợp
//        for: biết biết số lần lặp
//        while: lặp khi đk còn đùng đúng
//        do-while: chạy 1 lần trước rùi mới kiểm tra
//        break: thoát khỏi vòng lặp
//        continue: bỏ qua lần lặp hiện tại

        for (int i = 1; i <= 3; i++) {
            System.out.println("Vòng lặp có break!");
            System.out.println(i);
            break;
        }

        System.out.println("Vòng lặp có Continue!");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

//        8. Nhập dữ kiệu từ bàn phím
        Scanner sc = new Scanner(System.in);
//        Nhập số
//        System.out.println("Nhập số vào");
//        int inputNum = sc.nextInt();
//        System.out.println("Sô vừa nhập " + inputNum);
//        Nhập chuỗi String
//        System.out.println("Nhập chuỗi");
//        String str = sc.next();
//        System.out.println("Chuỗi vừa nhập " + str);

        System.out.println("Nhập chuỗi");
        String str = sc.nextLine();
        System.out.println("Chuỗi vừa nhập " + str);
    }
}
