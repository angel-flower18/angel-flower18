import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите верхнюю границу (например, 100): ");
        int upperLimit = scanner.nextInt();
        
        System.out.println("Четные числа:");
        printEvenNumbers(upperLimit);
        
        System.out.println("nНечетные числа:");  // Исправлено "nНе" на "Нечетные"
        printOddNumbers(upperLimit);
    }

    public static void printEvenNumbers(int upperLimit) {
        for (int i = 0; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Добавляем перенос строки после вывода четных чисел
    }

    public static void printOddNumbers(int upperLimit) {
        for (int i = 0; i <= upperLimit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Добавляем перенос строки после вывода нечетных чисел
    }
}

