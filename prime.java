class prime {
    public static boolean a(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 30;
        System.out.println(num + " is prime? " + isPrime(num));
    }
}