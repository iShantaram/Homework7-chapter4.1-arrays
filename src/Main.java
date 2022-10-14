public class Main {
    public static void main(String[] args) {
        // HW7 Arrays1

        // HW1
        // Task1
        System.out.println("\nTask 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task2
        System.out.println("\nTask 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task3
        System.out.println("\nTask 3:");
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task4
        System.out.println("\nTask 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // HW2
        // Task1
        System.out.println("\nTask 1:");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }

        // Task2
        System.out.println("\nTask 2:");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task3
        System.out.println("\nTask 3:");
        for (int i = 1; i <= 512; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // HW3
        // Task1
        System.out.println("\nTask 1:");
        double vklad = 29000;
        double vkladSummary = 0;
        for (int i = 1; i <= 12; i++) {
            vkladSummary += vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + vkladSummary + " рублей");
        }

        // Task2
        System.out.println("\nTask 2:");
        vkladSummary = 0;
        for (int i = 1; i <= 12; i++) {
            vkladSummary = vkladSummary * 1.01 + vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + vkladSummary + " рублей");
        }

    }
}