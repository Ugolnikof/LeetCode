import java.util.Arrays;

public class RadixSort {
    // Поиск максимального значения элемента в массиве
    static int getMax(int[] arr, int n)
    {
        int mx = 0;
        try {
            mx = arr[0];
            for (int i = 1; i < n; i++)
                if (arr[i] > mx)
                    mx = arr[i];
        } catch (Exception e) {
            System.out.println("Массив пуст");
        }
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int[] arr, int length, int exp)
    {
        int[] output = new int[length]; // выходной массив
        int i;
        int[] count = new int[10];
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (i = 0; i < length; i++)
            count[ (arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Построение выходного массива
        for (i = length - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        // Копирование выходного массива в arr[]
        for (i = 0; i < length; i++)
            arr[i] = output[i];
    }

    // Главный метод для поразрядной сортировки
    static int[] radixSort(int[] arr, int length)
    {
        int m = getMax(arr, length);

        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, length, exp);
        return arr;
    }

    public static void print(int[] arr, int length) {
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }

    public static String toString(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + " ";
            }
        }
        return result;
    }
}