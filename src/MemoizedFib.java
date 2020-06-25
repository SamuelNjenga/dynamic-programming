public class MemoizedFib {
    private final int MAX = 100;
    private final int NIL = -1;

    private int[] lookup = new int[MAX];

    //Function to initialize NIL values in the lookup table
    private void _initialize() {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;

    }

    //Function for nth Fibonacci number
    private int fib(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n - 1) + fib(n - 2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        MemoizedFib obj = new MemoizedFib();
        obj._initialize();
        int n = 6;
        System.out.println(obj.fib(n));
    }
}
