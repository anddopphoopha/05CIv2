public class App {
    public String primeNumbers2 = "";

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

    public void primeFactor(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isPrime(num[i])) {
                primeNumbers2 += (num[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        App appObj = new App();
        if (args.length > 2) {
            int[] array = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
            appObj.primeFactor(array);
            System.out.println(appObj.primeNumbers2);
        } else {
            long input = Long.parseLong(args[0]);
            System.out.println(appObj.isPrime(input));
        }
    }
}