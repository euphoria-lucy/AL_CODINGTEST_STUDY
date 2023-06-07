import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준_2438_별찍기 -1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print("*");
            }
            System.out.println();
        }

    }
}
