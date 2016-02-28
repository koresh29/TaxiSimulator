import Cars.Autopark;

import Clients.Client;
import Taxi.TaxiTypes;

/**
 * Created by Vlad on 04.02.2016.
 */
public class Main {

  public static final double baserate = 5;



    public static  void main(String[] args) throws InterruptedException {

        Autopark autopark1 = new Autopark();
        while (true) {
            Client cl1 = new Client();
            double cd = TaxiTypes.distance(cl1.location.x, cl1.location.y, cl1.destination.x, cl1.destination.y);
            double t0tcd = TaxiTypes.distance(autopark1.AP[0].location.x, autopark1.AP[0].location.y, cl1.location.x, cl1.location.y);
            double t1tcd = TaxiTypes.distance(autopark1.AP[1].location.x, autopark1.AP[1].location.y, cl1.location.x, cl1.location.y);
            int auto_in_use;
            double ttcd;
            double rate;
            double extrarate;
            if (t0tcd < t1tcd) {
                auto_in_use = 0;
                ttcd = t0tcd;
            } else {
                auto_in_use = 1;
                ttcd = t1tcd;
            }
            double extra_fare;
            if (ttcd <= 10) {
                extra_fare = 0;
            } else {
                extra_fare = ((ttcd - 10) * 2);
            }
            if (cl1.number_of_people > 4) {
                extrarate = (cl1.number_of_people - 4) * 0.5;
            } else {
                extrarate = 0;
            }
            rate = baserate + extrarate;
            double fare = TaxiTypes.rounder(cd * rate + extra_fare);
            autopark1.AP[auto_in_use].location = cl1.destination;
            autopark1.AP[auto_in_use].income += fare;
            autopark1.AP[auto_in_use].income = TaxiTypes.rounder(autopark1.AP[auto_in_use].income);
            System.out.println("Wait for your car, please. It`s gonna be " + autopark1.AP[auto_in_use].color + " " + autopark1.AP[auto_in_use].model + " with title " + autopark1.AP[auto_in_use].title + ". Your price is " + fare + " dollars. Have a nice trip.");
            System.out.println();
            System.out.println("Income: ");
            System.out.println(autopark1.AP[0].driver + " " + autopark1.AP[0].income + " $      " + autopark1.AP[1].driver + " " + autopark1.AP[1].income + " $");
            System.out.println();
            Thread.sleep(1000);
        }


    }
}










































