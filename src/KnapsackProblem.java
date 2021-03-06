/*
A Dynamic Programming based solution
 for 0-1 Knapsack problem
 */
/*
It has a time complexity of O(NxW) where where ‘N’ is the number
 of weight element and ‘W’ is capacity.
As for every weight element we traverse through all weight capacities 1<=w<=W
*/

class KnapsackProblem {

    // A utility function that returns
    // maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns the maximum value that can
    // be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(
                            val[i - 1] + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    // Driver program to test above function
    public static void main(String args[]) {
        int val[] = new int[]{50, 100, 130};
        int wt[] = new int[]{10, 20, 40};
        int W = 80;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
/*This code is contributed by Sam Njenga */

