import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        for (int i = 1; i < 11; i++ ){
            int q = num * i;
            System.out.println(num + "x" + i + "=" + q);
        }
    }
}