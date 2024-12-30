import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MinMaxAvgNumbersTest {
    /**Задача:
     * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].*/
    MinMaxAvgNumbers minMaxAvgNumbers = new MinMaxAvgNumbers();

    @Test
    public void searchMinMaxAvgNumbers() {
        int n = 5; // размерность массива
        double[] nums = new double[n];
        minMaxAvgNumbers.setArray(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        double max = minMaxAvgNumbers.findMax(nums);
        System.out.println(max);

        double min = minMaxAvgNumbers.findMin(nums);
        System.out.println(min);

        OptionalDouble avg = minMaxAvgNumbers.findAvg(nums);
        System.out.println(avg);
    }


}