package solved;

public class FloodFill {

    public int [][] floodFill(int [][] image, int sr, int sc, int color){
        // Запоминаем оригинальный цвет стартового пикселя
        int originalColor = image[sr][sc];

        // Если оригинальный цвет уже совпадает с целевым, возвращаем изображение без изменений
        if(originalColor == color){
            return image;
        }

        // Начинаем рекурсивное заполнение с позиции (sr, sc)
        fill(image, sr, sc, originalColor, color);

        // Возвращаем измененное изображение
        return image;
    }

    // Рекурсивный метод для выполнения flood fill
    private void fill(int [][] image, int sr, int sc, int originalColor, int color){
        // Проверяем, что текущая позиция (sr, sc) находится в пределах изображения
        // И что цвет пикселя на этой позиции совпадает с оригинальным цветом
        // Если одно из этих условий не выполнено, прерываем рекурсию
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor){
            return; // Выход из рекурсии, если выход за границы или цвет не совпадает
        }

        // Меняем цвет текущего пикселя на новый
        image[sr][sc] = color;

        // Рекурсивно вызываем функцию для соседних пикселей (вверх, вниз, влево, вправо)
        fill(image, sr + 1, sc, originalColor, color);
        fill(image, sr - 1, sc, originalColor, color);
        fill(image, sr, sc + 1, originalColor, color);
        fill(image, sr, sc - 1, originalColor, color);
    }
}
