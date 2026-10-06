package dimah_d_ivt_25;

import java.util.Random;    // Подключение тип для генерации псев-случайных чисел
import java.util.Scanner;   // Подключение типа для считывания данных их консоли

public class array_functions {

    /// Функция для заполнения массива случайными значениями
    /// @param length_array - длина пассива для заполнения
    /// @return - возвращает заполненный массив
    static double[] fill_random(int length_array){

        Random rand = new Random(); // Переменная для генерации случайных чисел

        double[] array = new double [length_array];     // Переменная типа массива с вещественными числами
        for (int i = 0; i < length_array; i++) {    // Цикл для заполнения массива числами рандомно
            double el = (double) rand.nextDouble(-100.0, 100.0);
            array[i] = el;
        }
        return array;
    }

    /// Функция ждя заполнения массива в ручную (пользователем с клавиатуры)
    /// @param length  - длина массива
    /// @return - заполненный массив
    static double[] user_fill(int length){

        Scanner sc = new Scanner(System.in);    // Переменная для считывания данных

        double[] array = new double[length];    // Переменная типа массива с double типом переменных
        for (int i = 0; i < length; i++) {      // Цикл для заполнения массива с клавиатуры (пользователем)
            System.out.printf("x_%d = ", i + 1);
            double el = sc.nextDouble();
            array[i] = el;
        }
        return array;
    }



    /// Функция для заполнения массива
    /// length_array - переданная длина массива (количество элементов массива)
    /// return заполненный массив
    static double[] fill_array(int length_array, int var) {

        double[] array;  // Массив длинной length_array

        if (var == 1) { // Если пользователь выбрал 1 - то заполняет массив сам
            array = user_fill(length_array);
        } else {    // если же пользователь выбрал 0 - массив заполняется случайными числами
            array = fill_random(length_array);
        }
        return array;   // возврат массива
    }

    /// Функция вывода элементов массива
    /// array - переданный массив
    static void print_array(double[] array) {
        int ten = 0;    // Переменная счетчик для перехода на новую строку
        for (double el : array) {   // el = a[i] каждый круг цикла
            System.out.printf("%7.3f  ", el);   // Вывод
            ten++;  // Добавление в счетчик 1 каждый круг
            if (ten % 10 == 0) System.out.println();    // Переход на новую строку каждый 10-й эл
        }
    }

    /// Функция для проверки вычислений мат функции Sum_sqrt (написанное по заданию)
    static void assert_tests(){
        // assert - проверяет логику заданных условий
        // Если True то алгоритм работы программы идет дольше
        // Иначе выводит сообщение о ошибке работы функции вычисления
        assert Math.abs(Calc.Sum_sqrt(new double[] {1, 1, 1}) - 9.949) < 0.001 : "Ошибка вычисления функции";
        assert Math.abs(Calc.Sum_sqrt(new double[] {0, 0, 0}) - 9.486) < 0.001 : "Ошибка вычисления функции";
        assert Math.abs(Calc.Sum_sqrt(new double[] {1, 2, 3}) - 11.417) < 0.001 : "Ошибка вычисления функции";
    }
}
