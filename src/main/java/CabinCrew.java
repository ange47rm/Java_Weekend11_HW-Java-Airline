public class CabinCrew extends Person{

    private RankType rank;

    public CabinCrew(String name, RankType rank){
        super(name);
        this.rank = rank;
    }

    public RankType getRank(){
        return this.rank;
    }
}
