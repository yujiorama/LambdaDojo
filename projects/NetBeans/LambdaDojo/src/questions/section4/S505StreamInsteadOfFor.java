package questions.section4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.stream.Stream;

public class S505StreamInsteadOfFor {

    public S505StreamInsteadOfFor() {
        fileRead("src/questions/section4/S505StreamInsteadOfFor.java");
        fileRead("src/questions/section4/S505StreamInsteadOfFor.jav");
    }

    private void fileRead(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // int wordCount = 0;

            // for (;;) {
            //     String line = reader.readLine();
            //     if (line == null) {
            //         break;
            //     }

            //     String[] words = line.split("[\\.,\\?; ]");
            //     wordCount += words.length;
            // }
            long wordCount = reader.lines()
                                   .flatMap((line) -> Stream.of(line.split("[\\.,\\?; ]")))
                                   .count();

            System.out.println(wordCount);

        } catch (IOException ex) {
            // 例外処理
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new S505StreamInsteadOfFor();
    }
}
