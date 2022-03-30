package oslomet.webprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobelRegister <T extends Mobel> {
    private List<T> mobler;

    public MobelRegister() {
        mobler = new ArrayList<>();
    }

    public void addMobel(T mobel) {
        mobler.add(mobel);
    }

    public T getMobel(int nummer) {
        for(T mobel : mobler) {
            if(mobel.getNummer() == nummer)
                return mobel;
        }
        return null;
    }

    public void slettMobel(int nummer) {
        for(T mobel : mobler) {
            if(mobel.getNummer() == nummer) {
                mobler.remove(mobel);
            }
        }
    }

    public void skrivUtAlle() {
        for(T mobel : mobler) {
            System.out.println(mobel);
        }
    }

    public void sorter() {
        Collections.sort(mobler);
    }
}
