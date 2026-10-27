package dimah_ivt_25;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class filework {
    /// Функция для сохранения данных для будущего использования
    /// Функция может вызвать исключение если нет доступа к файлу
    /// @param Card - динамический массив типа Playing_card для взятия данных
    /// Возможно исключение throws IOException
    static void print_el_array_in_file(String filename1, Playing_card Card){
        // Если массив пуст или не выделен, то завершаем функцию
        if (Card == null) return;
        // Проверка исключения (попытка открыть файл для записи)
        try (PrintWriter out = new PrintWriter(new java.io.FileWriter(filename1, true))) {
                out.printf("%s\n ",Card.toString()); // Запись значений массива в файл через пробел
            }
        } catch (IOException e){  // Обработка исключения
            System.out.println("Ошибка записи файла");
        }
    }
}
