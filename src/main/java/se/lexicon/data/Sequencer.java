package se.lexicon.data;

//Contract
public interface Sequencer {

    int getNextInSequence();

    int getCurrentSequenceNumber();

    void setSequencer(int sequencer);

    void resetSequencer();
}
