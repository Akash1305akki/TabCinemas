package TabCinemas;

import java.util.Scanner;

public class Cafeteria {
    static Scanner c = new Scanner(System.in);

    public static void addOns(String[] Ak,float mPrice) throws Exception{
        float cPrice, total;
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...What would you like to have between your movie...");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Pop-Corn.");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Coke.");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Donuts.");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4. All in Combo.");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 5. Skip to Payment.");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 6. Go Back to Movie Surf.");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
        int cChoise = c.nextInt();

        System.out.println();
        Thread.sleep(500);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        switch (cChoise){
            case 1:{
                cPrice = 100;
                total = mPrice + cPrice;
                PaymentTab.billing(Ak,mPrice,cPrice,total);
                break;
            }case 2:{
                cPrice = 50;
                total = mPrice + cPrice;
                PaymentTab.billing(Ak,mPrice,cPrice,total);
                break;
            }case 3:{
                cPrice = 60;
                total = mPrice + cPrice;
                PaymentTab.billing(Ak,mPrice,cPrice,total);
                break;
            }case 4:{
                cPrice = 210;
                total = mPrice + cPrice;
                PaymentTab.billing(Ak,mPrice,cPrice,total);
                break;
            }case 5: {
                cPrice = 0;
                total = mPrice + cPrice;
                PaymentTab.billing(Ak,mPrice,cPrice,total);
                break;
            } case 6: {
                WelcomePage.s1=false;
                WelcomePage.s2=false;
                DB.movieSurf=true;
                DB.processing=false;
                MovieSurf.main(Ak);
                break;
            }default:{
                System.out.println("Invalid Choise ... Try Again");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                Cafeteria.addOns(Ak,mPrice);
            }
        }

    }
}
