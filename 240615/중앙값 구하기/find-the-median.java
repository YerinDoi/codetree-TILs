import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b) {
            if(b > c)
                System.out.println(b);
            else if(a > c)
                System.out.println(c);
            else
                System.out.println(a);

        }
        else { 
            if(c > b)
                System.out.println(b);
            else if(a > c)
                System.out.println(a);
            else
                System.out.println(c);
        }
    }
}