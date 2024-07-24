import java.util.Scanner;

class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String input = scan.nextLine();
            if (input.equals("yes")) {
                break;
            }
        }
    }
}