 
public class Typecasting {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Float num = sc.nextFloat();
        // System.out.println(num);

        //typecasting
        // int newNum = (int)(67.56f);
        // System.out.println(newNum);

        // automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        
        // System.out.println(d);

        // int number = 'A';
        // System.out.println(number);

        // System.out.println(3*6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/ c) - (d - s);
        System.out.println((f * b) + " " + (i/ c) + " " + (d - s));
        System.out.println(result);
    }

}