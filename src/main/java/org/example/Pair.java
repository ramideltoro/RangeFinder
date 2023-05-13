package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@Data
public class Pair {

    private long first;
    private long second;


    public Pair(long first, long second) {
        this.first=first;
        this.second=second;
    }
}
