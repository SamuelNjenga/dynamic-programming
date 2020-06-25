// Java program to find the maximum stolen value
//Time complexity is O(n)
//Space complexity is O(1)
import java.io.*;

class EfficientHousesStolenProblem
{
    // Function to calculate the maximum stolen value
    static int maxLoot(int hval[], int n)
    {
        if (n == 0)
            return 0;

        int value1 = hval[0];
        if (n == 1)
            return value1;

        int value2 = Math.max(hval[0], hval[1]);
        if (n == 2)
            return value2;

        // contains maximum stolen value at the end
        int max_val = 0;

        // Fill remaining positions
        for (int i=2; i<n; i++)
        {
            max_val = Math.max(hval[i]+value1, value2);
            value1 = value2;
            value2 = max_val;
        }

        return max_val;
    }

    // driver program
    public static void main (String[] args)
    {
        int hval[] = {5, 8, 12, 4, 7, 9, 3};
        int n = hval.length;
        System.out.println("Maximum loot value : " + maxLoot(hval, n));
    }
}

// Contributed by Samuel Njenga

