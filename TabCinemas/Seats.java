package TabCinemas;

import java.util.Scanner;

public class Seats {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String[][]seats={{"A","A","A"},{"   "},{"A","A","A"}};
        //                  a           walk           b
        char ch[]={'A','B','C','D','E','F'};
        for (int i=0 ;i<seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********************8");
        System.out.println("Enter the Seat");
        String s=sc.next();
        for (int i=0,count=0 ;i<seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                if (s.charAt(0) == 'A') {
                    seats[i][j]="B";
                count++;}else if (s.charAt(1)=='B'){
                    seats[i][j]="B";
                    count++;}else if (s.charAt(2)=='B'){
                    seats[i][j]="B";
                    count++;}else if (s.charAt(3)=='C'){
                    seats[i][j]="B";
                    count++;}else if (s.charAt(4)=='D'){
                    seats[i][j]="B";
                    count++; }
                if(count>0)
                    break;
            }
           if(count>0)
               break;
        }
        System.out.println("*********************8");
        for (int i=0 ;i<seats.length;i++){
            for (int j=0;j<seats[i].length;j++){
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

    }
}
