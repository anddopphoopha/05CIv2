public class App {
<<<<<<< HEAD
    public String primeFactors = "";
=======
    public String primeNumbers1 = "";
>>>>>>> Feature2

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

<<<<<<< HEAD
    public void primeFactor(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    primeFactors += i + " ";
                }
                primeFactor(num / i);
                break;
=======
    public void countPrimeNumber(int num, int num2) {
        for (int i = num; i <= num2; i++) {
            if (isPrime(i)) {
                primeNumbers1 += (i + " ");
>>>>>>> Feature2
            }
        }
    }

    public static void main(String[] args) {
        App appObj = new App();
<<<<<<< HEAD
        if (args.length == 1) {
            int num1 = Integer.parseInt(args[0]);
            appObj.primeFactor(num1);
            System.out.println(appObj.primeFactors);
=======
       if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            appObj.countPrimeNumber(num1, num2);
            System.out.println(appObj.primeNumbers1);
>>>>>>> Feature2
        } else {
            long input = Long.parseLong(args[0]);
            System.out.println(appObj.isPrime(input));
        }
    }
}