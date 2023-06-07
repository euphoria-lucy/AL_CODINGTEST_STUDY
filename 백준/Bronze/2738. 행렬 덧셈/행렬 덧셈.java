import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준_2738_행렬 덧셈

        Scanner sc = new Scanner(System.in);

        int num_o = sc.nextInt();
        int num_t = sc.nextInt();
        int arr[][] = new int[num_o][num_t];

        for(int i = 0; i< num_o; i++) {
            for(int j = 0; j< num_t; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < num_o; i++) {
            for(int j = 0; j < num_t; j++) {
                arr[i][j] += sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}