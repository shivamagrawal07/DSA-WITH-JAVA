// Take name as input and print a greeting message for that particular name.

import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr your Name:");
        String name = sc.nextLine();

        System.out.println(" Hello " + name + " !Welcome ");

        sc.close();
    }
}