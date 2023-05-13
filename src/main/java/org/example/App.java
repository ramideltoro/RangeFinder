package org.example;

import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private static RangeFinder rangeFinder = new RangeFinder();
    private static Bootstrap bootstrap = new Bootstrap();


    public static void main( String[] args ) {
        Pair[] pairs = bootstrap.getArray(1000000,5454545454545454L);

        System.out.println("Got pairs");

        int n = pairs.length;
        long k = 5454546454545454L;

        long start = System.nanoTime();

        int index = rangeFinder.findIndex(pairs, n, k);


        long end = System.nanoTime();

        System.out.println("Search took = "+(end-start));

        if (index != -1) {
            System.out.println(index);
            System.out.println(pairs[index]);
        } else
            System.out.println(-1);
    }
}
