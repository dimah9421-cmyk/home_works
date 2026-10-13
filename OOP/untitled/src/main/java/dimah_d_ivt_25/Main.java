package dimah_d_ivt_25;
/* Хоменко Дмитрий ИВТ 25
 * задание №136 о
 */

import java.util.Scanner;   // Подключение типа Scanner для считывания данных из консоли

import static dimah_d_ivt_25.Calc.Sum_sqrt; // Подключение метода \ функции из написанной библиотеки

public class Main {

    static void main(String[] args) {

        array_functions.assert_tests();     // Функция для проверки математической функции

        Scanner sc = new Scanner(System.in);    // Переменная для считывания данных

        if (args.length == 1 &&
                (args[0].equals("help") || args[0].equals("--help"))) {
            System.out.println("Программа для нахождения суммы корней sqrt(10 + a[i]**2)");
        }
        // Вывод результатов предыдущей работы с программой при переданном параметре
        else if (args.length == 1 && args[0].equals("last")) {
            double[] lats_arrayy = works_file.read_file();  // Переменная для считывания и проверки

            if (lats_arrayy.length != 0) {      // Если массив не пуст (то есть считываемый файл не пуст)
                System.out.println("Предыдущий расчет:");
                for (double i : lats_arrayy)    // Вывод массива при прошлом запуске
                    System.out.printf("%.3f ", i);
                // Вывод предыдущего результата вычислений
                System.out.printf("\nСумма равная %.3f\n", Calc.Sum_sqrt(lats_arrayy));
            }
        }
        // Если не передано ни одного аргумента при запуске программы
        else if (args.length == 0) {

            double[] lats_array = works_file.read_file();

            if (lats_array.length != 0){
                System.out.println("Предыдущий расчет:");
                for (double i: lats_array)
                    System.out.printf("%.3f ",i);
                System.out.printf("\nСумма равная %.3f\n",Calc.Sum_sqrt(lats_array));
                works_file.clear_file_open_array(); // Функция для очистки файла (в файле только последние программы)
            }
            int n = 0;
            System.out.print("Введите n = ");
            try {                   // Часть кода которая проверяется
                n = sc.nextInt();   // Присвоение данных из консоли в переменную n
            }catch (java.util.InputMismatchException e) {   // Часть кода которая выполняется при ошибке
                System.out.println("Ошибка: n должно быть целым числом числом");
                System.exit(1); // Полное завершение программы
            }
            int var = array_functions.input_selection();
            double[] array = array_functions.fill_array(n, var); // Создание переменной массива размером n с данными

            System.out.println("Заполненный массив:");
            array_functions.print_array(array); // Вывод массива

            double S = Sum_sqrt(array);
            works_file.print_el_array_in_file(array);   // Функция сохраняется для сохранения обычного массива
            works_file.print_in_readFile(array);    // Функция для сохранения в виде мат выражения + результат
            System.out.println();
            System.out.printf("Сумма корней равна S = %.2f", S); // Вывод суммы
        }

        else{
            try {
                works_file.clear_file_open_array(); // Очистка файла с данными для работы

                double[] array = new double[args.length];   // Создание переменной массива размером переданной длинны

                for (int i = 0; i < args.length; i++)       // Цикл для копирования данных из консоли в созданный массив
                    array[i] = Double.parseDouble(args[i]); // Преобразование строки (args - строка) в вещественные числа

                double S = Calc.Sum_sqrt(array);    // Вычисления по заданию

                works_file.print_el_array_in_file(array);   // Сохранения данных их данного запуска
                works_file.print_in_readFile(array);    // Сохранение данных в виде выражения + сумма

                System.out.printf("сумма корней равна S = %.2f", S);   // Вывод суммы
            } catch (NumberFormatException e){
                // Если в переданных аргументах было не числа, а символы
                System.out.println("Ошибка: Аргументы должны быть числами!!!");
            }
        }
    }
}

