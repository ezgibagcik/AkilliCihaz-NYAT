package Sistem;

import java.util.ArrayList;

public class SubjectClass {

    private ArrayList gozlemci = new ArrayList();

    public void attach(IObserver obs) {
        gozlemci.add(obs);
    }

    public void detach(IObserver obs) {
        int i = gozlemci.indexOf(obs);
        if (i >= 0) {
            gozlemci.remove(i);
        }
    }
    public void notify(String k) {
        for (int i = 0; i < gozlemci.size(); i++) {
            IObserver observer = (IObserver)gozlemci.get(i);
            observer.message(k);
        }
    }

}
