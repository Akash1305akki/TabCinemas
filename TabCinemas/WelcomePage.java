package TabCinemas;

import java.util.Scanner;


public class WelcomePage {

    static Scanner x = new Scanner(System.in);
    static String userID, userPassword;

    static boolean s1,s2;
    static int limitCount=1;

    static {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--------Welcome to #Tab_Cinemas--------");
    }

    public static void main(String[] Ak)throws Exception{
        while (((DB.userSignedUp==false)||(DB.userLoggedIn==false))&&(DB.movieSurf==false)){
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


            Thread.sleep(500);
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...Choose Your Task...");
            Thread.sleep(500);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Sign-Up");
            Thread.sleep(500);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Log-In");
            Thread.sleep(500);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Surf for Movie's");
            Thread.sleep(500);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4. Exit Application");
            Thread.sleep(500);
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
            int choise = x.nextInt();

            System.out.println();
            Thread.sleep(500);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            Thread.sleep(500);

            switch (choise){
                case 1:{
                    signUp();
                    break;
                }case 2:{
                    if (DB.userSignedUp==true){
                        logIn(Ak);
                    }else {
                        System.out.println("First Register Your Account...");
                        signUp();
                    }
                    break;
                }case 3:{
                    DB.movieSurf=true;
                    MovieSurf.main(Ak);
                    break;
                }case 4:{
                    exitApp();
                    break;
                } default:{
                    System.out.println("Invalid Choise... Try Again");
                }
            }
        }
    }


    public static void signUp() throws Exception {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...Let's Create Your Account...");
        Thread.sleep(500);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Enter your user name: ");
        String inputID = x.next();
        DB.idStore.add(inputID);

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Enter your contact number: ");
        long inputContact = x.nextLong();
        DB.contactStore.add(inputContact);

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Enter your Password: ");
        String inputPassword = x.next();
        DB.pwdSore.add(inputPassword);
        x.nextLine();
        System.out.println();
        Thread.sleep(500);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Thread.sleep(500);

        DB.userSignedUp=true;
    }

    public static void logIn(String [] Ak)throws Exception {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...Enter Your Login Credentials...");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t User ID: ");
        userID = x.next();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Password: ");
        userPassword = x.next();
        x.nextLine();
        System.out.println();
        Thread.sleep(500);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Thread.sleep(500);
        logInCheck(Ak,userID,userPassword);
    }

    private static void logInCheck(String [] Ak,String userID, String userPassword) throws Exception{
        if (DB.idStore.contains(userID) && DB.pwdSore.get(DB.idStore.indexOf(userID)).equals(userPassword)) {
            DB.userLoggedIn = true;
            DB.userIndex = DB.idStore.indexOf(userID);
            Thread.sleep(500);
            System.out.println("Your LogIn is Successful...");
            DB.movieSurf = true;
            MovieSurf.main(Ak);
        } else {
            limitCount++;
            if (limitCount<=3) {
                Thread.sleep(500);
                System.out.println("You Credentials are Invalid...");
                Thread.sleep(500);
                System.out.println("Try Again...");
                Thread.sleep(500);
                logIn(Ak);
            }else {
                System.out.println("You Exceeded Maximum attempts...");
                Thread.sleep(500);
                System.out.println("and seems suspicious....");
                Thread.sleep(500);
                System.out.println("Auto exit: \"ACTIVATED\"");
                Thread.sleep(1000);
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                WelcomePage.exitApp();
            }
        }
        limitCount=1;
    }

    public static void exitApp() throws Exception {
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t --------");
        Thread.sleep(500);
        System.out.print("Thank ");
        Thread.sleep(500);
        System.out.print("You ");
        Thread.sleep(500);
        System.out.print("For ");
        Thread.sleep(500);
        System.out.print("using ");
        Thread.sleep(500);
        System.out.print("#Tab_Cinemas");
        Thread.sleep(500);
        System.out.println("--------");
        DB.movieSurf=false;
    }
}