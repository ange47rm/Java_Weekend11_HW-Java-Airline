import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrew> cabinCrewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot(){
        return this.pilot;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getCabinCrewMembersCount() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrewMember(CabinCrew cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public boolean addPassenger(Passenger passenger) {
        if (getPassengerCount() < plane.getCapacity()) {
            this.passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOfAvailableSeats(){
        return this.plane.getCapacity() - getPassengerCount();
    }
}



