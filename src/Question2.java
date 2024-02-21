import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {

        Scanner scnr= new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Enter number 1: ");
        n1=scnr.nextInt();
        System.out.print("Enter number 2: ");
        n2=scnr.nextInt();

        int result= sumOf(n1, n2 );
       System.out.print("Sum between Number 1 and Number 2 : "+result);



    }

    private static int sumOf(int n1, int n2) {


        if (n1 > n2) {
            return 0;
        }
        if (n1 % 7 == 0) {
            return n1 + sumOf(n1 + 1, n2);
        }
        else {
            return sumOf(n1 + 1, n2);
        }
    }


    }



