/**
 * Created by dorin on 2/22/2017.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static int getShiftingSum(int n, int k) {
        int shiftingSum = 0;

        for(int i = 0; i <= k; i++, n = n * 10) {
            shiftingSum += n;
        }

        return shiftingSum;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("j2/j2.01.in");
        Scanner input = new Scanner(fileIn);
        File fileOut = new File("j2/j2.01.out");
        Scanner output = new Scanner(fileOut);
        int answer = output.nextInt();
        boolean check = false;

        int n;
        int k;
        n = input.nextInt();
        k = input.nextInt();

        if(answer == getShiftingSum(n, k))
            check=true;

        System.out.print(getShiftingSum(n, k) + ": " + check);
    }
}
