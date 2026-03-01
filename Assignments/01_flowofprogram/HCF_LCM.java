import java.util.*;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }

       static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        
    }
}


