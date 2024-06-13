import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double L = sc.nextDouble();

        if(R >= 1.0 && L >= 20)
            System.out.println("Middle");
        else
            System.out.println("Low");
    }
}