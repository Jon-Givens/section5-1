import javax.swing.*;
import java.util.Scanner;
public class StringEquality {

    public static void method(String[]args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        boolean nameTest = name.equalsIgnoreCase("Moe");

        if (nameTest == true) {
            System.out.println("You are the king of rock and roll");
        } else {
            System.out.println("You are not the king");
        }
    }
}

