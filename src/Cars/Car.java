package Cars;

import Taxi.TaxiTypes;



/**
 * Created by Vlad on 04.02.2016.
 */
 public class Car {
   public String title;
   public String model;
   public String color;
   public String driver;
    public  TaxiTypes.pos location;
    public double income;

    public Car(String a,String b, String c, String d, TaxiTypes.pos e){
        title = a;
        model = b;
        color = c;
        driver = d;
        location = e;
        income = 0;
    }
}


