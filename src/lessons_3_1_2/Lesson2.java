package lessons_3_1_2;
import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args) {
        // we only printed true/false before, but let's use those outputs
        // to change the flow of the program
        Scanner scan = new Scanner(System.in);

        // Ask a user for their favorite number
        System.out.println("enter your favorite number");
        int userNum = scan.nextInt();

        // if it is above 12, print "That's a large number!"
        // if it is 12 or lower, print "That's small number"
        if(userNum > 12){
            System.out.println("That is a large number");
        }

        if(userNum <= 12){
            System.out.println("That is a small number");
        }

        //alternative way of doing this
        if(userNum > 12){
            System.out.println("That is a large number");
        }
        else {
            System.out.println("That is a small number");
        }



        // Go to the rectangle class and implement the isSquare method
        // following the JavaDoc specs


    }
}
