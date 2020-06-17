public class Piano extends MusicalInstrument implements Tunable, VolumeAdjustable {

    private int numberOfKeys;

    public Piano(String inst, int numberOfKeys) {
        super(inst);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public void startMusic() {
        System.out.println("Playing Bettie and the Jets...");
    }

    public void stopMusic() {
        System.out.println("Fingers off keys now...");
    }

    public void tuneInstrument() {
        System.out.println("Tuning piano...");
    }

    public void detuneInstrument() {
        System.out.println("Detune piano...");
    }

    public void volumeUp() {
        System.out.println("Opening up the piano lid thing more...");
    }

    public void volumeDown() {
        System.out.println("Closing the piano lid thing...");
    }


}
