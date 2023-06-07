import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 백준_2744_대소문자 바꾸기

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr;
        arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(65 <= arr[i] && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
                continue;
            }

            if(97 <= arr[i] && arr[i] <= 122) {
                arr[i] = (char) (arr[i] - 32);
                continue;
            }

        }

        System.out.println(arr);

    }
}