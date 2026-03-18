
public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "shivam";

       {
        // int a = 78;      //  already initialised outside the block in the same hence you cannot initialised again 
        a = 100; // reassign the original ref variable to some other value  
        System.out.println(a);
        int c = 99;
        name = "pari";
        System.out.println("name");
        // value initialised in this block, will remaiin in block
       }
         System.out.println(a);
        System.out.println("name");

    //    System.out.println(c);        //cannot use outside the block

    // scoping in for loops
    for (int i = 0; i < 4; i++) {
        System.out.println(i);
        int num = 90;
        // int a = 10;

    }
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
    }

} 
