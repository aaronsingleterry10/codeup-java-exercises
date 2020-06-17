public class Sax extends MusicalInstrument implements VolumeAdjustable, Tunable {

    private String saxType;

//    public Sax(String inst, String saxType) {
//        super(inst);
//        this.saxType = saxType;
//    }

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public String getSaxType() {
        return this.saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("Playing Careless Whisper...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Mouthpiece out of mouth...");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Pushing in mouthpiece...");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Pulling out mouthpiece...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Blowing in more air in sax...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Blowing less air in sax...");
    }
}
