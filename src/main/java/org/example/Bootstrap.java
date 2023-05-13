package org.example;

import java.util.Random;

public class Bootstrap {

    public Random random = new Random();

    public Pair[] getArray(int size,long firstNumber) {
        final Pair[] pairs = new Pair[size];

        long startNumber = firstNumber;

        for(int i=0;i<size;i++) {
            long lowRange = startNumber;



            long endRange = lowRange + 10000;

            if(lowRange < 0 || endRange < 0) {
                System.out.println("lowrange = "+lowRange);

                System.out.println(i);
                throw new RuntimeException("Number less than 0");
            }

            pairs[i] = new Pair(lowRange,endRange);
            startNumber = endRange + 1;
        }

        return pairs;

    }
}
