import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            syntax for loops:

            for(initialisation; condition; increment/decrement){
            //body
            }
         */

        // Q: print number from 1 to 5
        // for (int num=1; num <=5; num +=1){
        //     System.out.println(num);
        // }

        // print number from 1 to n
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num++ ){
        //     System.out.print(num + " ");
        // }


        //while loop
        /*
             syntax:
            while (condition){
                //body
            }
        */

        //   for (int num=1; num <=5; num +=1){
        //     System.out.println(num);
        // }

        int num = 1;
        while (num <= 5){
            // System.out.println(num);
            num += 1;
        }

        //do while
        /*
            do{
            
            }while (condition);
       
        */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n <= 5);

     }
}