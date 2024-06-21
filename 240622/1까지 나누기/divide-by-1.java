import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int a;

        for(int i = 1; i > 0; i++) {

            n /= i;

            if(n <= 1)
                break;
            else
        }
        System.out.println(cnt);
    }
}