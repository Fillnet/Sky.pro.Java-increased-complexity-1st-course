public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи повышенной сложности: Переменные.");
        System.out.println("Задание 1.");
        task1(12, 27, 44, 15, 9);
        System.out.println("Задание 2.");
        task2(11,77);
        System.out.println("Задание 3.");
        task3(247);
    }

    public static void task1(int a, int b, int c, int d, int e) {
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);
    }

    public static void task2(int a, int b) {
        a = a + b ;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void task3(int a) {
        a = a / 10;
        int b = a % 10;

        System.out.println(b);
    }
}