public class PascalTriangle {
    private static int factorial(int N) {
        int fact = 1;

        while(N >= 1) {
            fact *= N;
            N--;
        }

        return fact;
    }
    
    private static int combination(int n, int r) {
        return (factorial(n)/factorial(n-r)/factorial(r));
    }

    public static void printPascalTriangle(int N) {
        for(int i = 1; i <= N; i++) {
            boolean flag = true;
            int r = 0;

            for(int j = 1; j < N*2; j++) {

                if(j >= N+1-i && j <= N-1+i && flag) {
                    System.out.print(combination(i-1, r) + " ");
                    flag = false;
                    r++;
                } else {
                    System.out.print("  ");
                    flag = true;
                }
            }
            System.out.println();
        }
    }
}