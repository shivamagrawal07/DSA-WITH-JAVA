import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        
        // String a = "shivam";
        // String b = "shivam";

        // System.out.println(a == b);

        // if (fruit.equals("mango")){
        //         System.out.println("King of fruit");
        // }

        // if (fruit.equals("apple")){
        //     System.out.println("a sweet red fruit");

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("small fruit");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid fruit");   
        // }


        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}

