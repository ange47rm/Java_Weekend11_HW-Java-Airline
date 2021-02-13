import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Pilot pilot;
    ArrayList<CabinCrew> cabinCrewMembers;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    Plane plane2;

    @Before
    public void before(){
        cabinCrewMembers = new ArrayList<CabinCrew>();
        cabinCrew1 = new CabinCrew("Mario", RankType.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Luigi", RankType.FLIGHTATTENDANT);
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Yoshi", 1);
        passenger2 = new Passenger("Wario", 3);
        passenger3 = new Passenger("MushroomHead", 2);
        plane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight (pilot, cabinCrewMembers, passengers, plane, "ABC123", "Edinburgh", "Rome", "06:10");
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightCabinCrewStartsWithNoMembers(){
        assertEquals(0, flight.getCabinCrewMembersCount());
    }

    @Test
    public void canAddCabinCrewMemberToFlight(){
        flight.addCabinCrewMember(cabinCrew1);
        flight.addCabinCrewMember(cabinCrew2);
        assertEquals(2, flight.getCabinCrewMembersCount());
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerToFlight(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.getPassengerCount());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("ABC123", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Edinburgh", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Rome", flight.getDepartureAirport());
    }

    @Test
    public void flightDepartureTime(){
        assertEquals("06:10", flight.getDepartureTime());
    }

    @Test
    public void flightSeatsAvailableDecrease(){
        plane2 = new Plane(PlaneType.BOEING787);
        flight2 = new Flight (pilot, cabinCrewMembers, passengers, plane2, "PIS123", "Edinburgh", "Pisa", "10:30");
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight2.addPassenger(passenger3);
        assertEquals(245, flight2.getNumberOfAvailableSeats());
    }

}
