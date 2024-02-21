import java.util.Scanner;
public class Question3 {

    public static int binarySearch(int[] numbers,int numberSize,int key) {

        int mid;
        int low;
        int high;
        low = 0;
        high = numberSize - 1;

        while (high >= low) {
            mid = (high + low) / 2;

            if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }


        return -1;


    }

    public static void main(String[] args) {

        int [] numbers = {2,67,89,90,45,34};
        int numSize = 6;
        int key;
        int index;

        System.out.print("Numbers: ");
        for(int i=0;i<numSize;++i){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();


        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        key=scnr.nextInt();

       index=binarySearch(numbers,numSize,key);
       if (index==-1){
           System.out.print(key+" was not found.");
       }
       else {
           System.out.print(key+" was found at index "+index+".");
       }


    }



    }







