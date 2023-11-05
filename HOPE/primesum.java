public class primesum {
    public static void main(String[] args) {
        int n = 256;
        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = n - i;
            if (a + b == n) {
                if (sieveOfEratosthenes(a) && sieveOfEratosthenes(b)) {
                    System.out.println(a + " + " + b);
                }
            }
        }
    }

    static boolean sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
        return !primes[n];
    }

    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
    }
}




