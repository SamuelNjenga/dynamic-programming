// A DP based Java program for
// painter's partition problem
//The time complexity is O(K * N * N * N)
import java.util.*;
import java.io.*;

class PainterPartitionProblem
{
    // function to calculate sum between two indices
// in array
    static int sum(int arr[], int from, int to)
    {
        int total = 0;
        for (int i = from; i <= to; i++)
            total += arr[i];
        return total;
    }

    // bottom up tabular dp
    static int findMax(int arr[], int n, int k)
    {
        // initialize table
        int dp[][] = new int[k+1][n+1];

        // base cases
        // k=1
        for (int i = 1; i <= n; i++)
            dp[1][i] = sum(arr, 0, i - 1);

        // n=1
        for (int i = 1; i <= k; i++)
            dp[i][1] = arr[0];

        // 2 to k partitions
        for (int i = 2; i <= k; i++) { // 2 to n boards
            for (int j = 2; j <= n; j++) {

                // track minimum
                int best = Integer.MAX_VALUE;

                // i-1 th separator before position arr[p=1..j]
                for (int p = 1; p <= j; p++)
                    best = Math.min(best, Math.max(dp[i - 1][p],
                            sum(arr, p, j - 1)));

                dp[i][j] = best;
            }
        }

        // required
        return dp[k][n];
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 10, 40, 20, 30, 40, 50 };

        // Calculate size of array.
        int n = arr.length;
        int k = 3;
        System.out.println(findMax(arr, n, k));
    }
}

// This code is contributed by Samuel Njenga
