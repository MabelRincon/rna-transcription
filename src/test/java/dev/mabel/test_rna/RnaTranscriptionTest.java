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

    @Test
    @DisplayName("Test if the transcribe method correctly transcribes cytosine to guanine.")
    public void testTranscriptionOfCytosine() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("G", transcription.transcribe("C"));
    }

    @Test
    @DisplayName("Test if the transcribe method correctly transcribes guanine to cytosine.")
    public void testTranscriptionOfGuanine() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("C", transcription.transcribe("G"));
    }

    @Test
    @DisplayName("Test if the transcribe method correctly transcribes thymine to adenine.")
    public void testTranscriptionOfThymine() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("A", transcription.transcribe("T"));
    }
}
