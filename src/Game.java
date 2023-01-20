
import java.util.Scanner;

public class Game {

    private int[][] field;

    private int length;
    private int width;


    public Game(int[][] field, int length, int width) {
        this.field = field;
        this.length = length;
        this.width = width;
    }



    public void start() {
        Scanner scanner = new Scanner(System.in);
        int couter = 0;
        int couterFor2 = 0;
        for (int i = 0; i < 10; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();


            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];
               switch (shot){
                   case 0:
                       System.out.println("Вы не попали");
                       break;
                   case 1:
                       System.out.println("Вы попали в однопалубный корабль");
                       couter = couter + 1;
                       break;
                   case 2:
                       System.out.println("Вы попали в двухпалубный корабль");
                       couterFor2 = couterFor2 + 1;
               }

                //if (shot == 0) {
               //     System.out.println("Вы не попали");
               // }
               // if (shot == 1) {
                 //   System.out.println("Вы попали в однопалубный корабль");
                  //  couter = couter + 1;
               // }
              //  if (shot == 2) {
                 //   System.out.println("Вы попали в двухпалубный корабль");
                  //  couterFor2 = couterFor2 + 1;
               // }
            } else {
                System.out.println("Вы ввели некорректные координаты");
            }
        }
        System.out.println("Количество Ваших попаданий по кораблям составляет: " + couter + " по однопалубным и " + couterFor2 + " по двухпалубным");
    }
}



//Исправить ошибку с хардкодингом - везде, где я жестко прописал цифровые значения (кроме класса Main)
// заменить эти цифры на переменные длины и ширины поля (где какие - надо подумать).
// Соответственно, в класс Game придется добавить эти два поля и конструктор.
// Проверить, запуская вашу игру на разных размерах поля
//
//Усложнение. попробовать генерировать не одиночные корабли, а двойные
//
//Second level:
