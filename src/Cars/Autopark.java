package Cars;

import Taxi.TaxiTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Autopark {
  public   Car AP[] = new Car[2];

    public  Autopark(){

     Scanner in = new Scanner(System.in);
     System.out.println("Enter first car title:");
     String e_car1_title = in.nextLine();
     System.out.println("Enter first car model:");
     String e_car1_model = in.nextLine();
     System.out.println("Enter first car color:");
     String e_car1_color = in.nextLine();
     System.out.println("Enter first car drivers name:");
     String e_car1_driver = in.nextLine();
     String tryx;
     String tryy;
     int e_car1_posx;
     int e_car1_posy;
        while(true) {

            try {


                System.out.println("Enter first car position x:");

                tryx = in.nextLine();

                e_car1_posx = Integer.valueOf(tryx);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
            continue;


            }
            break;

        }




     while(true) {

         try {


             System.out.println("Enter first car position y:");

             tryy = in.nextLine();

             e_car1_posy = Integer.valueOf(tryy);
         }
         catch (NumberFormatException e) {

             System.out.println("Enter int number, please");
             continue;


         }
         break;

     }

     TaxiTypes.pos e_car1_pos = new TaxiTypes.pos(e_car1_posx, e_car1_posy);

     Car car1 = new Car(e_car1_title, e_car1_model, e_car1_color, e_car1_driver, e_car1_pos);


     in = new Scanner(System.in);
     System.out.println("Enter second car title:");
     String e_car2_title = in.nextLine();
     System.out.println("Enter second car model:");
     String e_car2_model = in.nextLine();
     System.out.println("Enter second car color:");
     String e_car2_color = in.nextLine();
     System.out.println("Enter second car drivers name:");
     String e_car2_driver = in.nextLine();
     int e_car2_posx;
     int e_car2_posy;
     while(true) {

         try {


             System.out.println("Enter second car position x:");

             tryx = in.nextLine();

             e_car2_posx = Integer.valueOf(tryx);
         }
         catch (NumberFormatException e) {

             System.out.println("Enter int number, please");
             continue;


         }
         break;

     }




     while(true) {

         try {


             System.out.println("Enter second car position y:");

             tryy = in.nextLine();

             e_car2_posy = Integer.valueOf(tryy);
         }
         catch (NumberFormatException e) {

             System.out.println("Enter int number, please");
             continue;


         }
         break;

     }

     TaxiTypes.pos e_car2_pos = new TaxiTypes.pos(e_car2_posx, e_car2_posy);

     Car car2 = new Car(e_car2_title, e_car2_model, e_car2_color, e_car2_driver, e_car2_pos);


          AP[0] = car1;
          AP[1] = car2;

 }

}
