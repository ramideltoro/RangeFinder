package org.example;

public class RangeFinder {


    public int findIndex(Pair a[], int n, long K)
    {
        int low = 0, high = n - 1;

        // Binary search
        while (low <= high)
        {

            // Find the mid element
            int mid = (low + high) >> 1;

            // If element is found
            if (K >= a[mid].getFirst() &&
                    K <= a[mid].getSecond())
                return mid;

                // Check in first half
            else if (K < a[mid].getFirst())
                high = mid - 1;

                // Check in second half
            else
                low = mid + 1;
        }

        // Not found
        return -1;
    }
}
