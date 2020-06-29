//Tome complexity is O(n)
public class FencePaintingProblem {

    private static int numWayPaintFence(int n, int k) {
        if (n == 0) return 0;
        if (n == 1) return k;
        int same = k;
        int diff = k * (k - 1);
        for (int i = 3; i <= n; i++) {
            int prevDiff = diff;
            diff = (same + diff) * (k - 1);
            same = prevDiff * 1;
        }
        return same + diff;
    }

    public static void main(String[] args) {
        System.out.println(numWayPaintFence(1,3));
    }
}
