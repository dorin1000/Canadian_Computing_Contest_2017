/**
 * Created by dorin on 2/22/2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File ("j4/j4.15.in");
        Scanner input = new Scanner(fileIn);
        File fileOut = new File ("j4/j4.15.out");
        Scanner output = new Scanner(fileOut);
        int answer = output.nextInt();
        boolean check = false;

        int D = input.nextInt();
        int d = 0;
        int count = 0;
        int fullClock;
        int h0 = 1;
        int h1 = 2;
        int m0 = 0;
        int m1 = 0;

        if(D>=720) {
            fullClock = (int) (D / 720);
            //System.out.println("Full clocks: " + fullClock);
            count = fullClock*31;
            //System.out.println("Start count: " + count);
            D = D - fullClock*720;
            //System.out.println("Start D: " + D);
        }
        while(d != D){
            // clock functioning
            m1++;
            if(m1 == 10){
                m0++;
                m1=0;
            }
            if(m0 == 6){
                h1++;
                m0=0;
            }
            if(h1 == 10){
                h0++;
                h1=0;
            }
            if(h1 == 3 && h0 == 1){
                h0=0;
                h1=1;
            }

            // calc increment
            int increment = m0 - h1;

            // verify if special
            if(h0 == 0) {
                if ((m0 == h1 + increment) && (m1 == m0 + increment))
                    count++;
            }
            else
            {
                if ((h1 == h0 + increment) && (m0 == h1 + increment) && (m1 == m0 + increment))
                    count++;
            }

            //System.out.println(""+h0+""+h1+":"+m0+""+m1);
            d++;
        }
        if(count == answer)
            check = true;
        System.out.println(count + ": " + check);
    }
}
