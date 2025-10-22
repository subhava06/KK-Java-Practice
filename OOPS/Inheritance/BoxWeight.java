

public class BoxWeight extends Box {
   
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(l,h,w); //what is this? call the parent class constructor
        //used to initialize the values present in parent class 
        // but not the private ones

        this.weight = weight;
    }


    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side); // ye wala parent class se le lega
        this.weight = weight; // aur ye wala isi class ka part hai
    }

    

    
}
