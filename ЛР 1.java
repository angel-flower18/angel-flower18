import java.util.Scanner; // Импортируем библиотеку сканер

public class Main // Создание главного класса
{
    public static void main (String args[]) // Создание основного метода программы
    {
        System.out.println("Четные числа:"); // Обьявляем вывод четных чисел

        for (int i = 0 ; i <= 101; ++i)
        {
            if (i % 2 == 0)
            {
                System.out.print( i + " ");
            }
        }
        
         System.out.println();
        
        System.out.println("Не четные числа:"); // Обьявляем вывод Не четных чисел

        for (int i = 0 ; i <= 100; ++i)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
