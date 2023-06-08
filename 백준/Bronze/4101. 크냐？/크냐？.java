import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       while (true) {
           int num_o = sc.nextInt();
           int num_t = sc.nextInt();

           if (num_o == 0 && num_t == 0) 
               break;
           
           if (num_o > num_t) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
          }
       }


    }
}