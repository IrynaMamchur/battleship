package battershipOk;

import java.util.Arrays;
import java.util.Scanner;

public class FieldViewer {

    private int length;

    public FieldViewer() {
        this.length = length;
    }

    public void printField(int[][] field, int length) {

        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(field[i]));
        } //так можно напечатать квадратный массив

    }
}
