package dimah_d_ivt_25;

public class calculations_functions {
    /// Функция для подсчета a (по условию задания 11б из https://ivtipm.github.io/Programming/Files/spisocall.htm)
    /// param_1 - первый переданный в функцию параметр для вычислений
    /// param_2 - второй переданный в функцию параметр для вычислений
    /// Функция возвращает результат вычислений (по формуле из условия задачи)
    public static double calculate_a(double param_1, double param_2) {
        // Возврат результата вычислений
        return (1.0 + param_2) * (param_1 + param_2 / (Math.pow(param_1, 2.0) + 4.0)) /
                (Math.exp(-param_1 - 2.0) + 1.0 / (Math.pow(param_1, 2.0) + 4.0));
    }

    /// Функция для подсчета b (по условию задания 11б из https://ivtipm.github.io/Programming/Files/spisocall.htm)
    /// param_1 - первый переданный в функцию параметр для вычислений
    /// param_2 - второй переданный в функцию параметр для вычислений
    /// param_3 - третий переданный в функцию параметр для вычислений
    /// Функция возвращает результат вычислений (по формуле из условия задачи)
    public static double calculate_b(double param_1, double param_2, double param_3){
        // Возврат результата вычислений
        return (1 + Math.cos(param_2 - 2.0)) /
                ((Math.pow(param_1, 4) / 2) + Math.pow(Math.sin(param_3), 2));
    }


    /// Функция для проверок функций calculate_a, calculate_b
    static void assert_tests(){
        // Проверка методом assert функцию find_a
        assert calculations_functions.calculate_a(0.0, 0.0) == 0.0 : "Ошибка вычислений";
        assert Math.abs(calculations_functions.calculate_a(1.0, 1.0) - 9.608) < 0.001 : "Ошибка вычислений";
        assert Math.abs(calculations_functions.calculate_a(2.0, 2.0) - 47.098) < 0.001 : "Ошибка вычислений";

        // Проверка методом assert функцию find_b
        assert Math.abs(calculations_functions.calculate_b(3.0, 3.0, 3.0) - 0.038) < 0.001 : "Ошибка вычислений";
        assert Math.abs(calculations_functions.calculate_b(1.0, 1.0, 1.0) - 1.275) < 0.001 : "Ошибка вычислений";
        assert Math.abs(calculations_functions.calculate_b(2.0, 2.0, 2.0) - 0.226) < 0.001 : "Ошибка вычислений";
    }
}
