import java.util.Arrays;
//создать поле игры
//создать базовую генерацию кораблей
//дать возможность игроку стрелять

// полноценная игра

public class Main {
    public static void main(String[] args) {

        FieldGenerator fieldGenerator = new FieldGenerator(15, 15);
        int[][] field = fieldGenerator.generate();

        FieldViewer fieldViewer = new FieldViewer(15);


        Game game = new Game(field, 15, 15);
        game.start();

        fieldViewer.printField(field);
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


