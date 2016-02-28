package Clients;
  import Taxi.TaxiTypes;

  import java.util.Scanner;

/**
 * Created by Vlad on 04.02.2016.
 */

 public class Client {

    public int number_of_people;
    //public String name;
   // public String phone;
    public TaxiTypes.pos location;
    public TaxiTypes.pos destination;



    public  Client()
    {
        String tryx;
        String tryy;
        String tryn;
        int l_client1_posx;
        int l_client1_posy;
        int d_client1_posx;
        int d_client1_posy;
        int number_of_people_c;


        Scanner in = new Scanner(System.in);
        while(true) {

            try {


             //   System.out.println("Enter clients number of people");

                //tryn = in.nextLine();

                number_of_people_c = (int) (Math.random()*6+1);      //Integer.valueOf(tryn);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
                continue;


            }
            break;

        }

       /*System.out.println("Enter clients name:");
        String name_c = in.nextLine();
        System.out.println("Enter clients phone:");
        String phone_c = in.nextLine();
*/
        while(true) {

            try {


               // System.out.println("Enter client location x:");

                //tryx = in.nextLine();

                l_client1_posx = (int) (Math.random()*200-100);            //Integer.valueOf(tryx);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
                continue;


            }
            break;

        }




        while(true) {

            try {


//                System.out.println("Enter client location y:");

                //tryy = in.nextLine();

                l_client1_posy=(int) (Math.random()*200-100);           // Integer.valueOf(tryy);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
                continue;


            }
            break;

        }

        while(true) {

            try {


//                System.out.println("Enter client destination x:");

                //tryx = in.nextLine();

                d_client1_posx = (int) (Math.random()*200-100);    //Integer.valueOf(tryx);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
                continue;


            }
            break;

        }




        while(true) {

            try {


//                System.out.println("Enter client destination y:");

               // tryy = in.nextLine();

                d_client1_posy= (int) (Math.random()*200-100);     //Integer.valueOf(tryy);
            }
            catch (NumberFormatException e) {

                System.out.println("Enter int number, please");
                continue;


            }
            break;

        }

        TaxiTypes.pos c_location = new TaxiTypes.pos(l_client1_posx, l_client1_posy);
        TaxiTypes.pos c_destination = new TaxiTypes.pos(d_client1_posx, d_client1_posy);

        number_of_people = number_of_people_c;
      //  name = name_c;
        //phone = phone_c;
        location = c_location;
        destination = c_destination;
  }}