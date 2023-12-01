package aims.store;
import aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX_CAPACITY = 1000;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_CAPACITY];
    private int numberDVD;

    public void addDVD(DigitalVideoDisc dvd) {
        if (numberDVD + 1 > MAX_CAPACITY) {
            System.out.println("Cannot add DVD: Store's max capacity reached.");
            return;
        }
        itemsInStore[numberDVD++] = dvd;
        System.out.println("Added " + dvd.toString() + " to store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;

        for (int i = 0; i < numberDVD; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                for (int j = i; j < numberDVD - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[--numberDVD] = null;
                System.out.println("Removed " + dvd.toString() + " from store.");
            }
        }

        if (!found)
            System.out.println("No item matches.");
    }
}
