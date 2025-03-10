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
                default:
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }
        return rnaStrand.toString();
    }

}
