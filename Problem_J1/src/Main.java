/**
 * Created by dorin on 2/22/2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static int getQuadrant(int x, int y) {
        int quadrant = -1;

        if(x > 0 && y > 0)
            quadrant = 1;
        else if (x < 0 && y > 0)
            quadrant = 2;
        else if (x < 0 && y < 0)
            quadrant = 3;
        else if (x > 0 && y < 0)
            quadrant = 4;

        return quadrant;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("j1/j1.01.in");
        Scanner input = new Scanner(fileIn);
        File fileOut = new File("j1/j1.01.out");
        Scanner output = new Scanner(fileOut);
        int answer = output.nextInt();
        boolean check = false;

        int x;
        int y;
        x = input.nextInt();
        y = input.nextInt();

        if(answer == getQuadrant(x, y))
            check = true;

        System.out.print(getQuadrant(x, y) + ": " + check);
    }
}
