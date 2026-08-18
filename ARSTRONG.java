import java.util.Scanner;

public class ARSTRONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, original, digit, digits = 0, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        original = n;

        // Count the number of digits
        int temp = n;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = n;
        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");

        sc.close();
    }
}
