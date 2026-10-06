package dimah_d_ivt_25;
/* Хоменко Дмитрий ИВТ 25
 * задание №136 о
 */

import java.util.Scanner;   // Подключение типа Scanner для считывания данных из консоли

import static dimah_d_ivt_25.Calc.Sum_sqrt; // Подключение метода \ функции из написанной библиотеки

public class Main {

    /// Функция для выбора пользователя по заполнения массива
    /// @return - значение int, а точнее либо 1, либо 0
    static int input_selection(){
        Scanner sc = new Scanner(System.in);    // Переменная для считывания данных

        int var = -1;   // Переменная для выбора пользователя
        System.out.println("Выберите способ заполнения массива");
        System.out.println("0 - массив заполнится автоматически, 1 - массив заполняете вы");
        while ((var != 0) && (var != 1)) {  // Бесконечный цикл пока не будет передано 0 or 1
            System.out.println("Введите число 1 или 0");
            var = sc.nextInt();

        }
        return var;
    }

    static void main(String[] args) {

        array_functions.assert_tests();     // Функция для проверки математической функции

        Scanner sc = new Scanner(System.in);    // Переменная для считывания данных

        if (args.length == 1 &&
                (args[0].equals("help") || args[0].equals("--help"))) {
            System.out.println("Программа для нахождения суммы корней sqrt(10 + a[i]**2)");
        }
        else if (args.length == 0) {
            System.out.print("Введите n = ");
            int n = sc.nextInt();   // Присвоение данных из консоли в переменную n

            int var = input_selection();
            double[] array = array_functions.fill_array(n, var); // Создание переменной массива размером n с данными

            System.out.println("Заполненный массив:");
            array_functions.print_array(array); // Вывод массива

            double S = Sum_sqrt(array);

            System.out.println();

            System.out.printf("Сумма равна = %f", S); // Вывод суммы
        }
//        else {
//            double[] array = array_functions.user_fill();
//        }
    }
}

