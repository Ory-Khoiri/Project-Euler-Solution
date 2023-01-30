public class Main {

    static int divisibleby(int n, int p){
        // Function for writing sums method
        int l = p / n;
        int multiple_sums = n * ((l)*(l+1))/2;
        return multiple_sums;
    }

    public static void main(String[] args)
    {

        int p = 1000;
        int k = 0;

        // iterative approach ver slow for large N
        for (int i = 0; i < p; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                k = k + i;
            }
        };

        // Sums approach
        int divisbleby3 = divisibleby(3, p);
        int divisibleby5 = divisibleby(5, p);
        int divisibleby15 = divisibleby(15, p);

        int sums = divisibleby5 + divisbleby3 - divisibleby15;

        System.out.println(k);
        System.out.println(sums);
    }
}