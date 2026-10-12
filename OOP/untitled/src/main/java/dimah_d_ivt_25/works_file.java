package dimah_d_ivt_25;

import java.io.IOException;
import java.io.PrintWriter;

public class works_file {
    /// Фукнция для записи данных из массива и суммы корней элементов массива в конец файла
    /// @param array - переменная массив типа double - сам массив для записи
    static void print_in_readFile(double[] array) {
        // Если массив пуст или вообще не выделен - завершаем функцию
        if (array == null || (array.length == 0)) return;

        // Проверка на исключения (если файл не открылся по причине отсутствия самого файла
        // или если отсутствия доступа к файлу)
        try (PrintWriter out = new PrintWriter(new java.io.FileWriter("arrays.txt", true))) {
            for (int i = 0; i < array.length - 1; i++) {    // Перебор массива
                out.printf("sqrt(10 + %.3f ** 2) + ", array[i]);    // Вывод элементов массива(с арифметическими знаками)
                if ((i + 1) % 4 == 0)   // Перенос на новую строку для удобного чтания
                    out.println("");
            }
            // Вывод последнего элемента массива(с арифметическими знаками) и суммы корней
            out.printf("sqrt(10 + %.2f ** 2) = %.2f\n", array[array.length - 1], Calc.Sum_sqrt(array));
        } catch (IOException e) {   // Обработка исключения
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    static void print_el_array_in_file(double[] array){

    }
}
