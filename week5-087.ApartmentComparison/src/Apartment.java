
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if(this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        return Math.abs((this.squareMeters * this.pricePerSquareMeter) -
                (otherApartment.squareMeters * otherApartment.pricePerSquareMeter));
    }

    public int pricing(int sqMeters, int ppsm) {
        return sqMeters * ppsm;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {

        if(pricing(this.squareMeters, this.pricePerSquareMeter) >
                pricing(otherApartment.squareMeters, otherApartment.pricePerSquareMeter)){
            return true;
        }
        return false;
    }
    
}
