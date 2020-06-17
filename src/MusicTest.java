public class MusicTest {
    public static void main(String[] args) {
        Sax sax1 = new Sax("Woodwind", "Alto Sax");
        MusicalInstrument piano1 = new Piano("String", 88);
//        System.out.println(sax1.getInstrumentClassification());
        System.out.println(sax1.getSaxType());
        System.out.println();
//        sax1.startMusic();
//        sax1.stopMusic();
//        sax1.tuneInstrument();
//        sax1.detuneInstrument();
//        sax1.volumeUp();
//        sax1.volumeDown();
//        detuneRetune(sax1);
        VolumeAdjustable sax2 = new Sax("Woodwind", "Tenor");
        Playable sax3 = new Sax("Woodwind", "Soprano");
        MusicalInstrument sax4 = new Sax("Woodwind", "Baritone");
        detuneRetune(sax1);

    }

    public static void detuneRetune(Tunable tunableObj) {
        tunableObj.detuneInstrument();
        tunableObj.tuneInstrument();
    }
}
