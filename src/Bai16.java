public class Bai16 {
    public static void main(String[] args) {
        int totalSeconds = 7384;

        int h;
        int m;
        int s;

        h = totalSeconds/3600;
        m = (totalSeconds%3600)/60;
        s = totalSeconds%60;

        System.out.println(h);
        System.out.println(m);
        System.out.println(s);

        int _age = 18;
    }
}
