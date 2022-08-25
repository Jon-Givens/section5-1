import javax.swing.*;
import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        boolean drivingUnderAge = false;
        drivingUnderAge = age <= 18;
        System.out.println("You are driving underage: " + drivingUnderAge);

       
    }
}
