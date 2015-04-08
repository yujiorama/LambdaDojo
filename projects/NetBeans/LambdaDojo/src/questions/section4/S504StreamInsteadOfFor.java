package questions.section4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S504StreamInsteadOfFor {

    public S504StreamInsteadOfFor() {
        splitSentences();
    }

    private void splitSentences() {
        List<String> sentences = Arrays.asList(
                "Peter Piper picked",
                "a peck of pickled peppers.",
                "A peck of pickled peppers",
                "Peter Piper picked. ",
                "If Peter Piper picked",
                "a peck of pickled peppers,",
                "Where's the peck of pickled peppers",
                "Peter Piper picked? "
        );
        
        // Set<String> words = new HashSet<>();
        // for (String sentence: sentences) {
        //     String[] splitedSentence  = sentence.split("[\\.,\\? ]");
        //     for (String word: splitedSentence) {
        //         words.add(word.toLowerCase());
        //     }
        // }
        Set<String> words = sentences.stream()
            .flatMap((sentence) -> Stream.of(sentence.split("[\\.,\\? ]")))
            .map((word) -> word.toLowerCase())
            .collect(Collectors.toSet());

        System.out.println(words);
    }

    public static void main(String[] args) {
        new S504StreamInsteadOfFor();
    }
}
