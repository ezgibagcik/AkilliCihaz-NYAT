package Sistem;

public class Eyleyici implements IEyleyici {
    public int SogutucuAc(int sicaklik) {
        sicaklik -= 10;
        return sicaklik;
    }
    public int SogutucuKapa(int sicaklik) {
        return sicaklik;
    }
}
