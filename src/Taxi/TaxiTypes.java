package Taxi;

import java.lang.Math;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Vlad on 05.02.2016.
 */
public class TaxiTypes {
public static double rounder(double b)

    {
        double a = Math.rint(100.0 * b) / 100.0;
        return a;
    }
    public static class pos {
        public int x;
        public int y;

        public pos(int a, int b) {
            x = a;
            y = b;
        }
    }

  public static double distance(int x1, int y1, int x2, int y2) {
            int a = x2 - x1;
            int b = y2 - y1;
            double d = Math.sqrt(a * a + b * b);
       return d;
        }




}

