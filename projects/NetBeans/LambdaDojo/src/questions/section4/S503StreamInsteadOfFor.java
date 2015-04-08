package questions.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.Collectors;

public class S503StreamInsteadOfFor {

    public S503StreamInsteadOfFor() {
        processStatistics();
    }

    private void processStatistics() {
        // 乱数のリストを作成
        final Random random = new Random();
        // List<Double> numbers = new ArrayList<>();
        // for (int i = 0; i < 100; i++) {
        //     numbers.add(random.nextDouble());
        // }
        // List<Double> numbers = IntStream.range(0, 100)
        //                                 .mapToDouble(x -> random.nextDouble())
        //                                 .boxed()
        //                                 .collect(Collectors.toList());
        // List<Double> numbers = DoubleStream.generate(() -> random.nextDouble())
        //                                    .limit(100)
        //                                    .boxed()
        //                                    .collect(Collectors.toList());
        List<Double> numbers = random.doubles(100).boxed().collect(Collectors.toList());

        // 平均を算出
        // double ave = 0.0;
        // for (Double x : numbers) {
        //     ave += x;
        // }
        // ave /= numbers.size();
        final double ave = numbers.stream().collect(Collectors.averagingDouble(x -> x));

        // 分散を算出
        // double variance = 0.0;
        // for (Double x : numbers) {
        //     variance += (x - ave) * (x - ave);
        // }
        // variance /= numbers.size();
        double variance = numbers.stream()
                                 .map((x) -> x - ave)
                                 .map((x) -> x * x)
                                 .reduce(0.0, (acc, x) -> acc + x);
        variance /= numbers.size();
        
        System.out.println("Average: " + ave);
        System.out.println("Diverse: " + variance);
    }

    public static void main(String[] args) {
        new S503StreamInsteadOfFor();
    }
}
