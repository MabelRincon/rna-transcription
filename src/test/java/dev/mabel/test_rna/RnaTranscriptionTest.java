package dev.mabel.test_rna;

import dev.mabel.rna.RnaTranscription;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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

    @Test
    @DisplayName("Test if the transcribe method correctly transcribes adenine to uracil.")
    public void testTranscriptionOfAdenine() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("U", transcription.transcribe("A"));
    }

    @Test
    @DisplayName("Test if the transcribe method correctly transcribes multiple nucleotides.")
    public void testTranscriptionOfMultipleNucleotides() {
        RnaTranscription transcription = new RnaTranscription();
        assertEquals("UGCACCAGAAUU", transcription.transcribe("ACGTGGTCTTAA"));
    }

    @Test
    @DisplayName("Test if the transcribe method throws an IllegalArgumentException when given an invalid input.")
        public void testInvalidInput() {
        RnaTranscription rnaTranscription = new RnaTranscription();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rnaTranscription.transcribe("ACGTX");
        });
        assertEquals("Invalid nucleotide: X. Valid nucleotides are G, C, T, and A.", exception.getMessage());
    }
}
