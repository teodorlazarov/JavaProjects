public class PrimeNumbers {

    private static void PrintPrimes(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            if (IsPrime(i)) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.printf("Prime numbers from 0 to %d are: %n%s", number, sb.toString());
    }

    private static boolean IsPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrintPrimes(50);
    }
}
