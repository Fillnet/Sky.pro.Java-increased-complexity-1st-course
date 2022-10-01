public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи повышенной сложности: Переменные.");
        System.out.println("Задание 6.");
        task6(12, 27, 44, 15, 9);
        System.out.println("Задание 7.");
        task7(11,77);
        System.out.println("Задание 8.");
        task8(247);
    }

    public static void task6(int a, int b, int c, int d, int e) {
        int result = a * (b + (c - d * e));
        System.out.println(-result);
    }

    public static void task7(int a, int b) {
        a = a + b ;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void task8(int a) {
        a = a / 10;
        int b = a % 10;

        System.out.println(b);
    }
}