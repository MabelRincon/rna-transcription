package dev.mabel.rna;

import java.util.Scanner;

public final class App {
    private App() {}

    public static void main(String[] args) {
        System.out.println("RNA Transcription");
        System.out.println("-----------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a DNA sequence: ");
        String dnaSequence = scanner.nextLine().trim();

        RnaTranscription rnaTranscription = new RnaTranscription();

        try {
            String rnaSequence = rnaTranscription.transcribe(dnaSequence);
            System.out.println("Transcribed RNA sequence: " + rnaSequence);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}