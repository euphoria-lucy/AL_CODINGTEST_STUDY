import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준_1330번 - 두 수 비교하기

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }

    }
}
