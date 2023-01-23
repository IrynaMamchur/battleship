package battershipOk;

import java.util.Scanner;

public class Game {

    private int[][] field;

    private int length;
    private int width;


    public Game(int[][] field) {
        this.field = field;
        this.length = length;
        this.width = width;
    }

    public void start(int length, int width) {
        Scanner scanner = new Scanner(System.in);
        int couter = 0;
        int couterFor2 = 0;
        System.out.println("Вы можете сделать " + length * 2 + " выстрелов");
        for (int i = 0; i < length * 2; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();


            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];
                switch (shot) {
                    case 0:
                        System.out.println("Вы не попали");
                        break;
                    case 1:
                        System.out.println("Вы попали в однопалубный корабль");
                        couter++;
                        field[first][second] = -1;
                        break;
                    case 2:
                        System.out.println("Вы попали в двухпалубный корабль");
                        couterFor2++;
                        field[first][second] = -1;
                        break;
                    case -1:
                        System.out.println("Вы сюда уже стреляли");

                }

            } else {
                System.out.println("Вы ввели некорректные координаты");
            }
        }
        if (couter == 0 && couterFor2 > 0) {
            System.out.println("Количество Ваших попаданий по кораблям составляет: " + couterFor2 + " по двухпалубным");
        }
        if (couter > 0 && couterFor2 == 0) {
            System.out.println("Количество Ваших попаданий по кораблям составляет: " + couter + " по однопалубным");
        }
        if (couter == 0 && couterFor2 == 0) {
            System.out.println("Вы ни разу не попали ни в один корабль");
        }
        if (couter > 0 && couterFor2 > 0) {
            System.out.println("Количество Ваших попаданий по кораблям составляет: " + couter + " по однопалубным и " + couterFor2 + " по двухпалубным");
        }
    }
}



