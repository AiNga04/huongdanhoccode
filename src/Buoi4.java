import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Buoi4 {
    public static void main(String[] args) {
        // Ngoại lệ và bắt ngoại lệ
        // Exception
//        Scanner sc = new Scanner(System.in);
//
//        int a = 0;
//        int b = 0;
//
//        // try - catch
//        final double pi = 3.14;
//
//        try {
//            System.out.println("Nhập a");
//            a = sc.nextInt();
//
//            System.out.println("Nhập b");
//            b = sc.nextInt();
//
//            System.out.println(a/b);
//        }catch(Exception e) {
//            System.out.println("Code xẩy ra lỗi");
//        }
//        finally {
//            System.out.println(a);
//            System.out.println(b);
//        }

//        finally sẽ luôn được chạy và chạy sau cùng
//        try thành công thì k chạy catch
//        try bị lỗi thì sẽ chạy catch để trả về lỗi
//        Exception sẽ bắt toàn bộ lỗi

//        Đọc dữ liệu từ văn bản
//        try {
////            Tạo đối tượng File trỏ đến file input.txt
//            File file = new File("D:\\Nga\\Code\\Java\\Ex1\\Ex1\\src\\input.txt");
//
////            Tạo Scanner để đọc file
//            Scanner scFile = new Scanner(file);
//
////            Vào lặp để đọc từng dòng của file
//            int cnt = 0;
//            while (scFile.hasNextLine()) {
//                String line = scFile.nextLine();
//                System.out.println(line);
//                if(Objects.equals(line, "Bảo")){
//                    cnt++;
//                }
//            }
//
//            System.out.println(cnt);
//
//            scFile.close();
//
//        }catch(Exception e) {
//            System.out.println("Không tìm thấy file");
//        }

//        Mảng dùng để lưu nhiều giá trị cũng kiểu dữ liệu
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 10;

//        Khai báo và gắng giá trị cho mảng
        int [] nums = {2, 3, 5, 10};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        String [] str = {"Bảo", "Nga"};
        for(String s : str){
            System.out.println(s);
        }

        str[1] = "Ngân";
         System.out.println(str[1]);

//        Khai báo
        int [] nums1 = new int [5];
        System.out.println(nums1.length);
    }
}
