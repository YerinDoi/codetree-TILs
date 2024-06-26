import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            
            int cnt = 1;

            while(cnt <= 3) {
                int n = sc.nextInt();

                if(n % 2 == 0) {
                    cnt++;
                    System.out.println(n / 2);
                }
            }
        }
    }
}