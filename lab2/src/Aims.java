//Create Aims class
public class Aims {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
    // Create new Cart
    Cart anOrder = new Cart();

    //Add dvd1
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Naruto", "Animation", "Masashi Kishimoto", 87, 20.00f);
        anOrder.addDigitalVideoDisc(dvd1);

                //Add dvd2
                DigitalVideoDisc dvd2 = new DigitalVideoDisc("Bleach", "Science Fiction", "Kubo Taito", 87, 25.99f);
                anOrder.addDigitalVideoDisc(dvd2);

                //Add dvd3
                DigitalVideoDisc dvd3 = new DigitalVideoDisc("Doraemon", "Animation",20.99f);
                anOrder.addDigitalVideoDisc(dvd3);

                //Caculate the cost
                System.out.println("Total Cost is : ");
                System.out.println(anOrder.totalCost());

                //Check method removeDigitalVideoDisc
                DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan", "Animation", "Aoyama", 87, 29.99f);
                anOrder.removeDigitalVideoDisc(dvd4);
                anOrder.removeDigitalVideoDisc(dvd3);
                }

                }
