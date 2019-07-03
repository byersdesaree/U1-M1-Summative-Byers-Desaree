import java.util.Scanner;
public class ValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.");
        int userNum = scanner.nextInt();


       while (userNum < 1 && userNum > 10){
           if (userNum >= 1 && userNum <= 10){
               System.out.println(userNum);
           }else{
               System.out.println("Error! Please enter a number between 1 and 10!");
           }
       }
    }
}
