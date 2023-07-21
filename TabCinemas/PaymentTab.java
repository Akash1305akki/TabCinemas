package TabCinemas;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.FileWriter;
import java.util.Scanner;

public class PaymentTab {

    static Scanner b = new Scanner(System.in);
    static int attempt = 3;
    static FileWriter fw;
    public static void billing(String [] Ak,float mPrice, float cPrice, float total) throws Exception{
       try {
           fw = new FileWriter("D://bill.txt");

           System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ____Your Bill____");
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Your Ticket Cost is: " + mPrice);
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Your Cafe Cost is: " + cPrice);
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ---------------------------");
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Your Total Cost is: " + total);
           Thread.sleep(500);
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ---------------------------");
           Thread.sleep(500);
           System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

           System.out.println();
           System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t ...MPIN: last \'4\' digits of your mobile number... ");
           Thread.sleep(500);
           System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Enter your MPIN to pay: ");
           String mPin = b.next();
           System.out.println();

           String cString = String.valueOf(DB.contactStore.get(DB.userIndex));

           String cPin = cString.substring(cString.length() - 4);

           if ((mPin.equals(cPin)) && attempt > 0) {
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               System.out.println("Payment Successful...");
               Thread.sleep(500);
               System.out.println("Don't stop searching for exclusive movies here on #Tab_Cinemas....");
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               fw.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               fw.write("^       ____Your Bill____       ^");
               fw.write("^                               ^");
               fw.write("^   Your Ticket Cost is: "+ mPrice+"   ^");
               fw.write("^                               ^");
               fw.write("^    Your Cafe Cost is: " + cPrice+"    ^");
               fw.write("^                               ^");
               fw.write("^                               ^");
               fw.write("^--------------------------------^");
               fw.write("^ Your Cafe Total Cost is: " + cPrice+" ^");
               fw.write("^--------------------------------^");
               fw.write("^                                ^");
               fw.write("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               fw.flush();
               System.out.println("Bill is Transferred to your D-Drive");
               WelcomePage.s1=false;
               WelcomePage.s2=false;
               DB.movieSurf=true;
               DB.processing=false;
               MovieSurf.main(Ak);
           } else if (attempt > 0) {
               attempt -= 1;
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               System.out.println("Payment Failed...");
               Thread.sleep(500);
               System.out.println("Try Again boss.....");
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               PaymentTab.billing(Ak, mPrice, cPrice, total);
           } else {
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               System.out.println("You Exceeded Maximum attempts...");
               Thread.sleep(500);
               System.out.println("and seems suspicious....");
               Thread.sleep(500);
               System.out.println("Auto exit: \"ACTIVATED\"");
               System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
               WelcomePage.exitApp();
           }
       }catch(Exception e){

       }
    }
}
