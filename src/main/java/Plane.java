public class Plane {

    PlaneType type;

    public Plane(PlaneType type){
        this.type = type;
    }

    public PlaneType getType(){
        return this.type;
    }

    public int getCapacity(){
        return this.type.getPlaneTypeCapacity();
    }

    public int getTotalWeight(){
        return this.type.getPlaneTypeTotalWeight();
    }


}
