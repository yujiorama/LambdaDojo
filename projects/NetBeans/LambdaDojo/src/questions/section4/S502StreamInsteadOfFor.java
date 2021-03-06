package questions.section4;

import java.util.Arrays;
import java.util.List;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class S502StreamInsteadOfFor {

    public S502StreamInsteadOfFor() {
        sum();
    }

    private void sum() {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // int sum = 0;
        // for (Integer x : numbers) {
        //     sum += x;
        // }
        // System.out.println(sum);
        // IntSummaryStatistics stats = numbers.stream()
        //                                     .collect(Collectors.summarizingInt((x) -> x));
        // System.out.println(stats.getSum());
        int sum = numbers.stream()
                         .mapToInt(x -> x)
                         .sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new S502StreamInsteadOfFor();
    }
}
