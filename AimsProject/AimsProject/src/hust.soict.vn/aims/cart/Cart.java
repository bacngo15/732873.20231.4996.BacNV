
//Create the Cart class to work with DigitalVideoDisc
package aims.cart;

import java.util.Scanner;

import aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    //Method to add an item to the list
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc with name "+disc.getTitle()+" has been added!");

        }
        else {
            System.out.println("The cart is almost full");
        }
    }

    //Create method addDigitalVideoDisc with numbers of argument
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
        } else {
            for (DigitalVideoDisc dvd : dvdList) {
                addDigitalVideoDisc(dvd);
            }
        }
    }
    // Create method addDigitalVideoDisc has 2 parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(new DigitalVideoDisc[] { dvd1, dvd2 });
    }

    //Method which loops through the values of the array and sums the costs of the individual DigitalVideoDiscs
    public float totalCost(){
        float sum = 0;
        for (int i = 0 ; i < qtyOrdered ; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    //Method to remove the item
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i=0; i<qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j=i; j<qtyOrdered-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
            }
        }

        if (!found) {
            System.out.println("Couldn't find the specified disc.");
        }
    }

    //Method to print order
    public void printorder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    //Search by ID
    public boolean searchId() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Search results for ID: ");
        int id = keyboard.nextInt();
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].toString());
                return true;
            }
        }
        System.out.println("No items found.");
        return false;
    }

    //Search by Title
    public boolean searchTitle() {
        boolean found = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Search results for title: ");
        String title = keyboard.nextLine();
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println( itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found)
            System.out.println("No items found.");
        return found;
    }

}
