public class Frequencia {
    int freq;
    long darrerMomentMS;

    Frequencia(int freq, long darrerMomentMS) {
        this.freq = freq;
        this.darrerMomentMS = darrerMomentMS;

    }

    void escriureFrequencia() {
        System.out.println(this.freq + ", " + this.darrerMomentMS);
    }

}
