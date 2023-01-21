import java.util.Random;

public class FieldGenerator {
    private int length;
    private int width;

    public FieldGenerator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

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




