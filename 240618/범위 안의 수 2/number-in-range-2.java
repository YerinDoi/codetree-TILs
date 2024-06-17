import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        int cnt = 0;

        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();

            if(0 <= a && a <= 200) {
                sum += a;
                cnt += 1;
            }
        }
        System.out.printf("%d %.1f", sum, (float)sum/cnt);
    }
}