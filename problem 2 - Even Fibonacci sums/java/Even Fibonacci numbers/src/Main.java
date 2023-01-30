public class Main {
    public static long evenFib(int n){
        long[] k = new long[2]; // set long array size to 2
          k[0] = 0; // f(0) = 0 -> fibonacci
          k[1] = 1; // f(1) = 1 -> fibonacci
        long even_sums = 0;

        if (n < 1) {

            return 0;
        } else if (n == 1) {

            return 1;
        }
        for (long i = 2; i <= n; i++) { // n > 1
            long m = k[0] + k[1]; // calculate f(n) = f(n-1) + f(n-2)
            k[0] = k[1];// shift and replace to the left: f(1) -> f(0)
            k[1] = m; // shift and replace to the left: m -> f(1)
            if (m % 2 == 0 && even_sums < 4000000) {
                // condition m is even and sums is less than 4 x 10^6
                even_sums += m;
            }
        }

        return even_sums;
    }

    public static void main(String[] args) {

        int n = 3;

        long evenFibonacciSum = evenFib(n);
        System.out.println(evenFibonacciSum);
    }
}