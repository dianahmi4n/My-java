import java.util.Scanner;

public class divided_zero{
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);

        System.out.println("SYSTEM TO DIVIDE TWO NUMBERS");

        System.out.println("ENTER FIRST NUMBER:");
        int num = nm.nextInt();

        System.out.println("ENTER SECOND NUMBER:");
        int num1 = nm.nextInt();

        if (num1 = 0){
            System.out.println("Can't divide by zero!!");
        } else {
            int divide = num / num1;

            System.out.println("DIVISION: "+ divide );
        }
         
        nm.close();

    }
}