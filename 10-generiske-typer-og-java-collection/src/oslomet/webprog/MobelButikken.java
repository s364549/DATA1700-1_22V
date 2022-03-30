package oslomet.webprog;

public class MobelButikken {
    public static void main(String[] args) {
        MobelRegister<Mobel> mr = new MobelRegister<>();

        mr.addMobel(new MobelImpl("Sverre", "Stol", 10, 1000, 2));
        mr.addMobel(new MobelImpl("Espen", "Bord", 30, 2000, 1));

        mr.skrivUtAlle();

        mr.sorter();

        mr.skrivUtAlle();
    }
}
