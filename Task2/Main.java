import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 10;
        System.out.println("Choose the number between 1 to 100 within "+k+" tries.");
        Random rand = new Random();
        int num1 = rand.nextInt(100)+1;
        int i;

        for(i = 0; i < k; i++) {
            System.out.print("Guess the number : ");
            int num2 = input.nextInt();

            if(num1 == num2) {
                System.out.println("Congratulations!!!You have guessed the number");
                break;
            }
            else if(num1 > num2)
                System.out.println("little high than your guess number");
            else if(num1 < num2)
                System.out.println("little less than your guess number");
        }
        if(i == k) {
            System.out.println("Sorry,You have exhausted Trails.The number was "+num1);
        }
    }
}
