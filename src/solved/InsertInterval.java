package solved;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    // Метод для вставки нового интервала
    public int[][] insert(int[][] intervals, int [] newInterval){
        // Список для хранения объединенных интервалов
        List<int []> mergedIntervals = new ArrayList<>();

        // Индекс для обхода массива intervals
        int i = 0;

        // Добавляем все интервалы, которые находятся до нового интервала
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
            mergedIntervals.add(intervals[i]);
            i++;
        }

        // Объединяем все пересекающиеся интервалы с новым интервалом
        while (i < intervals.length && intervals[i][0] <= newInterval[1]){
            // Обновляем начало нового интервала, если текущий интервал начинается раньше
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            // Обновляем конец нового интервала, если текущий интервал заканчивается позже
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++; // Переходим к следующему интервалу
        }

        // Добавляем объединенный интервал в результат
        mergedIntervals.add(newInterval);

        // Добавляем все оставшиеся интервалы, которые находятся после нового интервала
        while (i < intervals.length){
            mergedIntervals.add(intervals[i]);
            i++;
        }

        // Преобразуем список в массив и возвращаем его
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);


    }
}