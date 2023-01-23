package battershipOk;

//создать поле игры
//создать базовую генерацию кораблей
//дать возможность игроку стрелять

// полноценная игра

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();
        info.info();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину поля");
        int length = scanner.nextInt();
        System.out.println("Введите ширину поля");
        int width = scanner.nextInt();

        FieldGenerator fieldGenerator = new FieldGenerator();
        int[][] field = fieldGenerator.generate(length, width);

        Game game = new Game(field);
        game.start(length, width);

        FieldViewer fieldViewer = new FieldViewer();
        fieldViewer.printField(field, length);
    }
}


        //int a = 5;
        //int[] b = new int[10];
        //int[][] c = new int[5][8];
        //b[0] = 5;
        //b[5] = 3;
        //b[9] = 2;
        //b[4] = 90;

        //c[1][2] = 6;


        //System.out.println(Arrays.toString(b));
        //System.out.println(Arrays.deepToString(c));

        //System.out.println("Hello world!");

        //int sum =0;
        //for (int i =0; i<10; i++){
        //  sum = sum + b[i];
        //}
        // System.out.println(sum);
        //}


