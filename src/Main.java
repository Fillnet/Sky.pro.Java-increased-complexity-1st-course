public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи повышенной сложности: Переменные.");
        System.out.println("Задание 6.");
        task0(12, 27, 44, 15, 9);
        System.out.println("Задание 7.");
        task1(11, 77);
        System.out.println("Задание 8.");
        task2(247);
        System.out.println("Задачи повышенной сложности: Условные операторы.");
        System.out.println("Задание 6.");
        task3(23, 158_000);
        System.out.println("Задание 7.");
        task4(25, 60_000, 330_000, 1.0, 12, 0.5);

    }

    public static void task0(int a, int b, int c, int d, int e) {
        int result = a * (b + (c - d * e));
        System.out.println(-result);
    }

    public static void task1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void task2(int a) {
        a = a / 10;
        int b = a % 10;

        System.out.println(b);
    }

    public static void task3(int age, int salary) {
        double creditLimits;
        if (age >= 23) {
            creditLimits = salary * 3;
        } else {
            creditLimits = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            creditLimits = creditLimits * 1.2;
        }
        if (salary >= 80_000) {
            creditLimits = creditLimits * 1.5;
        }
        System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %s рублей \n", creditLimits);
    }

    public static void task4(int age, int salary, int wantedSum, double baseRate, int month, double monthlyPaymentPercent) {
        if (age < 23) {
            baseRate = baseRate + baseRate * 0.1;
        }
        if (age < 30) {
            baseRate = baseRate + baseRate * 0.05;
        }
        if (salary > 80_000) {
            baseRate = baseRate - baseRate * 0.07;
        }
        double monthlyPaymentCredit = wantedSum * baseRate;
        double monthlyPayment = monthlyPaymentCredit / month;
        double maxAllowablePayment = salary * monthlyPaymentPercent;
        if (maxAllowablePayment >= monthlyPayment) {
            System.out.printf("Максимальный платеж при ЗП %s равен %s рублей. Платеж по кредиту %s рублей. Одобрено \n", salary, maxAllowablePayment, monthlyPayment);
        } else {
            System.out.printf("Максимальный платеж при ЗП %s равен %s рублей. Платеж по кредиту %s рублей. Отказано \n", salary, maxAllowablePayment, monthlyPayment);
        }
    }
}