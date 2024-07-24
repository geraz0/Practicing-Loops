import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less than 11.");
        int num = input.nextInt();

        int start = num;
        int end = 11;
        for (int i = num; i <= end; i++) {
            System.out.println(i);
        }

    }
}