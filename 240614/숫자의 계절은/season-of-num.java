import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if(1 <= month && month <=2 || month == 12)
            System.out.println("Winter");
        else if(month <= 5)
            System.out.println("Spring");
        else if(month <= 8)
            System.out.println("Summer");
        else
            System.out.println("Fall");
    }
}