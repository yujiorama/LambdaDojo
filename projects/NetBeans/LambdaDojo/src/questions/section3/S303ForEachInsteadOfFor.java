package questions.section3;

import java.util.stream.IntStream;

public class S303ForEachInsteadOfFor {
    public S303ForEachInsteadOfFor() {
        rewriteSimpleLoop();
    }
    
    private void rewriteSimpleLoop() {
        // for (int i = 0; i < 10; i++) {
        //     System.out.print(i);
        // }
        IntStream.range(0, 10).forEach((i) -> {
                System.out.print(i);
        });
        System.out.println();
    }

    public static void main(String... args) {
        new S303ForEachInsteadOfFor();
    }
}
