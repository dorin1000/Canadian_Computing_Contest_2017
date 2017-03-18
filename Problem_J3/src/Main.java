/**
 * Created by dorin on 2/22/2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static char getPossibility(String departure, String arrival, int t) {
        char response;
        String[] departureCord = departure.split(" ");
        String[] arrivalCord = arrival.split(" ");
        int dX = Integer.parseInt(departureCord[0]);
        int dY = Integer.parseInt(departureCord[1]);
        int aX = Integer.parseInt(arrivalCord[0]);
        int aY = Integer.parseInt(arrivalCord[1]);

        int distance = Math.abs(aX - dX) + Math.abs(aY - dY);

        if(((distance%2) == 0) && ((t%2) == 0) && (distance <= t))
            response = 'Y';
        else if(((distance%2) !=0) && ((t%2) != 0) && (distance <= t))
            response = 'Y';
        else
            response = 'N';

        return response;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("j3/j3.01.in");
        Scanner input = new Scanner(fileIn);
        File fileOut = new File("j3/j3.01.out");
        Scanner output = new Scanner(fileOut);
        char answer = output.nextLine().charAt(0);
        boolean check = false;

        String departure;
        String arrival;
        int t;
        departure = input.nextLine();
        arrival = input.nextLine();
        t = input.nextInt();

        if(answer == getPossibility(departure, arrival, t))
            check = true;
        System.out.print(getPossibility(departure, arrival, t) + ": " + check);
    }
}
