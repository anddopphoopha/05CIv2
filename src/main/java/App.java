public class App {
    public String primeFactors = "";

    public boolean isPrime(long number) {
        double max = Math.sqrt(number) + 1;
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (long i = 3; i < max; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primeFactor(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    primeFactors += i + " ";
                }
                primeFactor(num / i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        App appObj = new App();
        if (args.length < 1 || args.length > 1) {
            System.out.println("Please input a number as the program argument");
            System.exit(0);
        } else if (args.length == 1) {
            int num1 = Integer.parseInt(args[0]);
            appObj.primeFactor(num1);
            System.out.println(appObj.primeFactors);
        }

        long input = Long.parseLong(args[0]);

        System.out.println(appObj.isPrime(input));
    }
}