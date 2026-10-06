package dimah_d_ivt_25;

import org.junit.jupiter.api.Test;  // Импорт метки для тестирования (чтобы
// компилятор понимал что эта функция является тестом)
import static org.junit.jupiter.api.Assertions.assertEquals;    // Импорт метода который сравнивает что ожидалось
// и что мы получили в процессе проверки

// Класс для функций-проверок
class MyTest {

    @Test   // Метка Test указывает что эта функция является тестом
    void calculate_a_test_zero() {
        double a = calculations_functions.calculate_a(0.0, 0.0);    // Присвоение результата вычислений в переменную a

        assertEquals(0, a); // Первый переданный параметр (в нашем случае 0)
        // сравнивается со вторым переданным параметром (а)
    }

    @Test
    void calculate_a_test_one() {
        double E = 0.0001;  // Переменная - допустимая погрешность

        double a = calculations_functions.calculate_a(1.0, 1.0);
        assertEquals(9.6081, a, E); // Первый параметр - то что мы ожидали получить в переменную a,
        // Второй параметр - то что мы получили в переменной a
        // Третий параметр - Допустимая погрешность для их сравнения
    }

    @Test
    void calculate_a_test_two() {
        double E = 0.00001;

        double a = calculations_functions.calculate_a(2.0, 2.0);
        assertEquals(47.09884, a, E);
    }

    @Test
    void calculate_b_test_one() {
        double E = 0.00001;

        double b = calculations_functions.calculate_b(1.0, 1.0, 1.0);
        assertEquals(1.27501, b, E);
    }

    @Test
    void calculate_b_test_two() {
        double E = 0.00001;

        double b = calculations_functions.calculate_b(2.0, 2.0, 2.0);
        assertEquals(0.22658, b, E);
    }

    @Test
    void calculate_b_test_three() {
        double E = 0.00001;

        double b = calculations_functions.calculate_b(3.0, 3.0, 3.0);
        assertEquals(0.03801, b, E);
    }
}

