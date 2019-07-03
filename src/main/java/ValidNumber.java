import java.util.Scanner;
public class ValidNumber {

    public static void main(String[] args) {
        int userNum;
        int userNum2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.");
        userNum = scanner.nextInt();

        if (userNum < 1 || userNum > 10){

            do {
                System.out.println("Error! Please enter a number between 1 and 10");
                userNum2 = scanner.nextInt();
            } while (userNum2 < 1 || userNum2 > 10);
        }   else {
            System.out.println(userNum);
        }
    }
}