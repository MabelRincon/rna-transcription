package dev.mabel.test_rna;

import dev.mabel.rna.App;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    @Test
    @DisplayName("Test if the main method prints the correct output for a valid input.")
    public void testMain_ValidInput() throws Exception {
        String input = "ACGT\n";
        String output = SystemLambda.tapSystemOutNormalized(() -> {
            SystemLambda.withTextFromSystemIn(input).execute(() -> App.main(new String[]{}));
        });

        assertTrue(output.contains("RNA Transcription"));
        assertTrue(output.contains("Enter a DNA sequence:"));
        assertTrue(output.contains("Transcribed RNA sequence: UGCA"));
    }

    @Test
    @DisplayName("Test if the main method prints the correct output for an empty input.")
    public void testMain_EmptyInput() throws Exception {
        String input = "\n";
        String output = SystemLambda.tapSystemOutNormalized(() -> {
            SystemLambda.withTextFromSystemIn(input).execute(() -> App.main(new String[]{}));
        });

        assertTrue(output.contains("RNA Transcription"));
        assertTrue(output.contains("Enter a DNA sequence:"));
        assertTrue(output.contains("Transcribed RNA sequence: "));
    }
}