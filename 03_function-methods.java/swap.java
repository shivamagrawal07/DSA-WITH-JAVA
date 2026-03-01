
public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        swap (a,b);

        System.out.println(a + " " + b);

        String name = "shivam agrawal";
        changeName(name);
        System.out.println(name);
   }

    static void changeName(String naam){
        naam = "Pari Agrawal";   
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
