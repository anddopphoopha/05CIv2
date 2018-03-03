public class App {
    public String primeNumbers1 = "";

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

    public void countPrimeNumber(int num, int num2) {
        for (int i = num; i <= num2; i++) {
            if (isPrime(i)) {
                primeNumbers1 += (i + " ");
            }
        }
    }

    public static void main(String[] args) {
        App appObj = new App();
       if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            appObj.countPrimeNumber(num1, num2);
            System.out.println(appObj.primeNumbers1);
        } else {
            long input = Long.parseLong(args[0]);
            System.out.println(appObj.isPrime(input));
        }
    }
}