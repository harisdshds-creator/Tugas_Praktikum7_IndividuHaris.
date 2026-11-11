public interface DapatDipromosikan {
    void promosikan();

    default void infoPromosi() {
        System.out.println("Status: Aset digital ini memenuhi syarat untuk dipromosikan.");
    }
}