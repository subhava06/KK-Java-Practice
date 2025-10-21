

public class BoxWeight extends Box {
   
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(l,h,w); //what is this? call the parent class constructor
        //used to initialize the values present in parent class

        this.weight = weight;
    }
}
