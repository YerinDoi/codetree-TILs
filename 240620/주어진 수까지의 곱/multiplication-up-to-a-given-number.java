import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int prob = 1;

        for(int i = a; i <= b; i++) {
            prob *= i;
        }
        System.out.println(prob);
    }
}