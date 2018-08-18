import java.util.Scanner;

public class PrimeNumbers {

    private static void PrintPrimes(int lower, int upper) {
        StringBuilder sb = new StringBuilder();
        int temp = lower;
        if(lower < 2){
            lower = 2;
        }
        for (int i = lower; i <= upper; i++) {
            if (IsPrime(i)) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.printf("Prime numbers from %d to %d are: %n%s", temp, upper, sb.toString());
    }

    private static boolean IsPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void GetUserInput() {
        Scanner scanner = new Scanner(System.in);
        int lower = 0, upper = 0;
        boolean flag = true;
        System.out.println("Enter a number range to be checked\nEnter lower bound:");

        while (flag) {
            try {
                lower = Integer.parseInt(scanner.nextLine());
                if (lower < 0) {
                    System.out.println("Enter a valid positive integer!");
                }
                else{
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid positive integer!");
            }
        }

        flag = true;
        System.out.println("Enter upper bound");
        while (flag) {
            try {
                upper = Integer.parseInt(scanner.nextLine());
                if (upper < 0) {
                    System.out.println("Enter a valid positive integer!");
                }
                else if(upper < lower){
                    System.out.println("Enter an upper value that is bigger than the lower value!");
                }
                else{
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid positive integer!");
            }
        }

        PrintPrimes(lower, upper);

    }

    public static void main(String[] args) {
        GetUserInput();
    }
}
