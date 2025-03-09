package dev.mabel.test_rna;

import dev.mabel.rna.RnaTranscription;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RnaTranscriptionTest {

    @Test
    @DisplayName("Test if the transcribe method correctly returns an empty string when given an empty input.")
    public void testEmptySequence() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("", transcription.transcribe(""));
    }
}
