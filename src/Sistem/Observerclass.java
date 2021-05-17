package Sistem;

public class Observerclass implements IObserver{

    public void message(String sicaklik) {
        System.out.println(sicaklik);
    }
}
