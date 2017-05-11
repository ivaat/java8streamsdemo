package ee.ut.cs.advancedjava2017.java8streams.lesson.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        //stream from array
        int[] originalArray = {1, 3, 6, 2, 1, 0, 7, 7, 10, -1};

        //sorted
        int[] sorted = Arrays.stream(originalArray).sorted().toArray();

        //limit
        int[] limitedSorted = Arrays.stream(originalArray).sorted().limit(3).toArray();

        //sum
        int sum = Arrays.stream(originalArray).sum();

        //IntStream + parallelstreams
        //many for-loops could be replaced with intstream!
        int parallelSum = IntStream.range(-10000, 10000).sum();

        //how about the "ThreadDemo" we did earlier?
    }
}
