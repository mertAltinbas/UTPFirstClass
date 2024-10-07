// TODO: we need to add the missing classes!

// OK, I will add `Substractor` and Cem will add `Adder`.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 2 variables.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Adder adder = new Adder();
        System.out.println(adder.add(a, b));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(a, b));
        Multi multi = new Multi();
        System.out.println(multi.multi(a, b));

    }

    //sex
}
