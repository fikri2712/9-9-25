package RPL6;

public class Car {
    int numDoors;
    Boolean isElectric; 

    public Car () {
        numDoors = 6; 
        isElectric = true;
    }
    public Car (int numDoors, Boolean isElectric) {
        this.numDoors = numDoors; 
        this.isElectric = isElectric;
    }
    public void print() {
        System.out.println("Number of Doors: "+numDoors);
        System.out.println("Is Electric: "+isElectric);
    }

    
}
