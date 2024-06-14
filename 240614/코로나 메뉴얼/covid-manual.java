import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char aS = sc.next().charAt(0);
        int aT = sc.nextInt();
        char bS = sc.next().charAt(0);
        int bT = sc.nextInt();
        char cS = sc.next().charAt(0);
        int cT = sc.nextInt();

        if(aS == 'Y' && aT >= 37) {
            if(bS == 'Y' && bT >= 37) {
                System.out.println("E");
            }
            else if(cS == 'Y' && cT >= 37) {
                System.out.println("E");
            }
            else
                System.out.println("N");
        }
    }
}