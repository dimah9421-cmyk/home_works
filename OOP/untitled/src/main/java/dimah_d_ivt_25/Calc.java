package dimah_d_ivt_25;

public class Calc {
    /// Функция для подсчета суммы коней (10 + a[i]**2)
    /// array - переданный массив
    /// return сумму корней
    static double Sum_sqrt(double[] array){
        double sum = 0; // Переменная для хранения суммы корней (задание)
        for (double el : array) {
            sum += Math.sqrt(10 + Math.pow(el, 2)); // Сбор суммы корней
        }
        return  sum;    // Возвращаем сумму
    }
}
