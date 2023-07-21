package TabCinemas;

import java.util.Scanner;
public class MovieSurf {

    static Scanner x = new Scanner(System.in);
    static int mChoise;

    public static void main(String[] Ak)throws Exception{
        while ((DB.movieSurf==true)&&(DB.processing==false)) {
            if (DB.userLoggedIn==true){
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t -->"+DB.idStore.get(DB.userIndex));
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                Thread.sleep(500);
                System.out.println();
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...Choose Your Movie...");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Mission: Impossible – Dead Reckoning Part One");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Oppenheimer");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Insidious: The Red Door");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 4. Go Back | Logout.");
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
                mChoise = x.nextInt();
                Thread.sleep(500);
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            }else {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t -->SignUp");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t -->Login");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                Thread.sleep(500);
                System.out.println();
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ...Choose Your Movie...");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Mission: Impossible – Dead Reckoning Part One");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 2. Oppenheimer");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 3. Insidious: The Red Door");
                Thread.sleep(500);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 4. Go Back | Logout.");
                System.out.println();
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
                mChoise = x.nextInt();
                Thread.sleep(500);
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            }


            switch (mChoise) {
                case 1: {
                    System.out.println();
                    miShows(Ak);
                    break;
                }
                case 2: {
                    System.out.println();
                    oShows(Ak);
                    break;
                }
                case 3: {
                    System.out.println();
                    iShows(Ak);
                    break;
                }
                case 4: {
                    DB.movieSurf=false;
                    DB.userLoggedIn=false;
                    WelcomePage.main(Ak);
                    break;
                }
                default: {
                    Thread.sleep(500);
                    System.out.println("Invalid Choise... Try Again");
                }
            }
        }
    }

    private static void miShows(String[] Ak) throws Exception {
        DB.movieSurf=false;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Morning - 9:30 A.M | 2. Evening - 7:10 P.M");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t    Screen - 1         |    Screen - 2");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Press\'3\' to exit this Current Tab and to get back to Previous Tab");

        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
        int sChoise = x.nextInt();

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        if (sChoise==1){
            WelcomePage.s1=true;
            ScreenOne.main(Ak);
        } else if (sChoise==2){
            WelcomePage.s2=true;
            ScreenTwo.main(Ak);
        } else if (sChoise==3){
            DB.movieSurf=true;
            MovieSurf.main(Ak);
        }else {
            System.out.println("Please Follow the Conventions for better performance...");
            Thread.sleep(500);
            System.out.println("Try Again...");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println();
            miShows(Ak);
        }
    }

    private static void oShows(String[] Ak) throws Exception {
        DB.movieSurf=false;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Afternoon - 12:30 P.M | 2. Evening - 6:30 P.M");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Screen - 2               | Screen - 1");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Press\'3\' to exit this Current Tab and to get back to Previous Tab");

        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
        int sChoise = x.nextInt();

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        if (sChoise==1){
            WelcomePage.s2=true;
            ScreenTwo.main(Ak);
        } else if (sChoise==2){
            WelcomePage.s1=true;
            ScreenOne.main(Ak);
        } else if (sChoise==3){
            DB.movieSurf=true;
            MovieSurf.main(Ak);
        }else {
            System.out.println("Please Follow the Conventions for better performance...");
            Thread.sleep(500);
            System.out.println("Try Again...");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println();
            miShows(Ak);
        }
    }

    private static void iShows(String[] Ak) throws Exception{
        DB.movieSurf=false;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t 1. Morning - 10:30 A.M | 2. Afternoon - 2:10 P.M");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Screen - 2             | Screen - 1");
        Thread.sleep(500);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t Press\'3\' to exit this Current Tab and to get back to Previous Tab");

        System.out.println();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t Choise: ");
        int sChoise = x.nextInt();

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        if (sChoise==1){
            WelcomePage.s2=true;
            ScreenTwo.main(Ak);
        } else if (sChoise==2){
            WelcomePage.s1=true;
            ScreenOne.main(Ak);
        } else if (sChoise==3){
            DB.movieSurf=true;
            MovieSurf.main(Ak);
        }else {
            System.out.println("Please Follow the Conventions for better performance...");
            Thread.sleep(500);
            System.out.println("Try Again...");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println();
            miShows(Ak);
        }
    }
}