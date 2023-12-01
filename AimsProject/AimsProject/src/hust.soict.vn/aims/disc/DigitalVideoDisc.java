package aims.disc;

public class DigitalVideoDisc {
    //Create the Digital Video Disc class and its attributes
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    // Create accessors and mutators for the class DigitalVideoDisc
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    //Create constructor method

    private static int nbDigitalVideoDiscs= 0;
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    //toString
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d : %.2f $", title, category, director, length, cost);
    }

    //isMatch
    public boolean isMatch(String title) {
        String[] keywords = title.split("\\s+");
        for (String word : keywords) {
            if (this.title.toLowerCase().contains(word.toLowerCase()))
                return true;
        }
        return false;
    }
}
