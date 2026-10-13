package dimah_d_ivt_25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class works_file {
    /// Фукнция для записи данных с арифм знаками из массива и суммы корней элементов массива в конец файла
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
            System.err.println("Ошибка записи в файл ");
        }
    }

    /// Функция для хранения данных для будущего использования
    /// @param array - массив типа double для взятия данных
    static void print_el_array_in_file(double[] array){
        // Если массив пуст или не выделен, то завершаем функцию
        if (array == null || array.length == 0) return;
        // Проверка исключения (попытка открыть файл для записи)
        try (PrintWriter out = new PrintWriter(new java.io.FileWriter("open_array.txt", true))) {
            for (int i = 0; i < array.length - 1; i++){ // Перебор значений массива
                out.printf("%f ",array[i]); // Запись значений массива в файл через пробел
            }
            out.printf("%f",array[array.length - 1]); // Запись последнего элемента массива (чтобы в конце строки не было пробела
        } catch (IOException e){  // Обработка исключения
            System.out.println("Ошибка записи файла");
        }
    }

    /// Функция для очистки файла (удаления данных из файла)
    static void clear_file_open_array(){
        // Проверка исключения (пытаемся открыть файл для его очистки
        try (java.io.FileWriter writer = new java.io.FileWriter("open_array.txt",false)){
        } catch (IOException e){    // Обработка исключений
        System.out.println("Ошибка удаления файла");
        }
    }
}
