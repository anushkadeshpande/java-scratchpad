import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ParallelSorting {
    public static void main(String... args) {
        int arr[] = ThreadLocalRandom.current().ints(10_000_000).toArray();

        for (int i = 0; i < 10; i++) {
            int[] clone = arr.clone();

            long time = System.nanoTime();
            try {
//                Arrays.sort(clone);
                Arrays.parallelSort(clone);
            } finally {
                time = System.nanoTime() - time;
                System.out.println("time: " + time / 1_000_000 + " ms");
            }
        }
    }
}


/*
* Normal sorting:
*
time: 761 ms
time: 622 ms
time: 620 ms
time: 613 ms
time: 613 ms
time: 620 ms
time: 613 ms
time: 649 ms
time: 621 ms
time: 614 ms
*
*
* Parallel sorting:
time: 513 ms
time: 212 ms
time: 177 ms
time: 181 ms
time: 184 ms
time: 183 ms
time: 172 ms
time: 166 ms
time: 170 ms
time: 194 ms
*
* */