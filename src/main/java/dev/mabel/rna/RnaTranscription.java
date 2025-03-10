package dev.mabel.rna;

public class RnaTranscription {

    public String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty()) {
            return "";
        }

        StringBuilder rnaStrand = new StringBuilder();
        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaStrand.append("C");
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    throw new IllegalArgumentException(
                            "Invalid nucleotide: " + nucleotide + ". Valid nucleotides are G, C, T, and A.");
            }
        }
        return rnaStrand.toString();
    }
}
