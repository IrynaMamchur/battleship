package battershipOk;

import java.util.Random;
import java.util.Scanner;

public class FieldGenerator {
    private int length;
    private int width;

    public FieldGenerator() {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length >= 3) {
            this.length = length;
        }
        System.out.println("Вы ввели некорректные данные длины поля. Длина должна быть больше или равна 3");
    }

    public void setWidth(int width) {
        if (width >= 3) {
            this.width = width;
        }
        System.out.println("Вы ввели некорректные данные ширины поля. Длина должна быть больше или равна 3");
    }

    public int[][] generate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину поля");
        int length = scanner.nextInt();
        System.out.println("Введите ширину поля");
        int width = scanner.nextInt();
        int[][] field = new int[length][width];
        Random random = new Random();
        int countForShips1 = 0;
        int countForShips2length = 0;
        int countForShips2width = 0;
        while (countForShips1 < length) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);
            if (field[a][b] == 0) {
                field[a][b] = 1;
                countForShips1++;
            }
        }
        while (countForShips2length < length / 2) {
            int a = random.nextInt(0, length - 1);
            int b = random.nextInt(0, width);
            if (field[a][b] == 0 && field[a + 1][b] == 0) {
                field[a][b] = 2;
                field[a + 1][b] = 2;
                countForShips2length++;
            }
        }
        while (countForShips2width < length / 2) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width - 1);
            if (field[a][b] == 0 && field[a][b + 1] == 0) {
                field[a][b] = 2;
                field[a][b + 1] = 2;
                countForShips2width++;
            }
        }
        return field;
    }


}






