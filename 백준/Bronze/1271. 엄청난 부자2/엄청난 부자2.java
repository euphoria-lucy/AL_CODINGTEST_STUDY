import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준_1271번 문제 - 엄청난 부자2
        Scanner sc = new Scanner(System.in);

        BigInteger C = sc.nextBigInteger();
        BigInteger K = sc.nextBigInteger();

        System.out.println(C.divide(K));
        System.out.println(C.remainder(K));

    }
}
