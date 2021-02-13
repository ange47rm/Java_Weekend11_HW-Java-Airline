public enum PlaneType {

    TESTPLANE (2, 100),
    BOEING747 (416, 800),
    BOEING787 (248,600),
    BOEING737 (162,300);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneTypeCapacity(){
        return this.capacity;
    }

    public int getPlaneTypeTotalWeight(){
        return this.totalWeight;
    }
}
