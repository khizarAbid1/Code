public class task {

    // AirportManagement class - Composition with TicketCounter, Flight, NoticeBoard
    class AirportManagement {
        String airportName;
        String cityName;
        String area;

        // Composition relationships
        TicketCounter ticketCounter;
        Flight flight;
        NoticeBoard noticeBoard;

        public AirportManagement(String airportName, String cityName, String area, TicketCounter ticketCounter, Flight flight, NoticeBoard noticeBoard) {
            this.airportName = airportName;
            this.cityName = cityName;
            this.area = area;
            this.ticketCounter = ticketCounter;
            this.flight = flight;
            this.noticeBoard = noticeBoard;
        }

        public void open() {
            System.out.println("Airport " + airportName + " in " + cityName + " is now open.");
        }
    }

    // TicketCounter class - Association with Passenger
    class TicketCounter {
        String ticketId;
        String source;
        String destination;
        String price;
        String flightId;
        Passenger passenger; // Association with Passenger

        public TicketCounter(String ticketId, String source, String destination, String price, String flightId) {
            this.ticketId = ticketId;
            this.source = source;
            this.destination = destination;
            this.price = price;
            this.flightId = flightId;
        }

        public void bookTicket(Passenger passenger) {
            this.passenger = passenger; // Set associated Passenger
            System.out.println("Ticket " + ticketId + " booked from " + source + " to " + destination + " at price " + price);
        }

        public void ticketDetails() {
            if (passenger != null) {
                System.out.println("Ticket Details: ID - " + ticketId + ", Passenger: " + passenger.passengerName);
            } else {
                System.out.println("No passenger associated with ticket " + ticketId);
            }
        }
    }

    // Flight class
    class Flight {
        String flightId;
        String flightName;
        int capacity;
        String startingTime;
        String reachingTime;
        String source;
        String destination;
        String price;

        public Flight(String flightId, String flightName, int capacity, String startingTime, String reachingTime, String source, String destination, String price) {
            this.flightId = flightId;
            this.flightName = flightName;
            this.capacity = capacity;
            this.startingTime = startingTime;
            this.reachingTime = reachingTime;
            this.source = source;
            this.destination = destination;
            this.price = price;
        }

        public void flightDetails() {
            System.out.println("Flight " + flightName + ": Capacity - " + capacity + ", Source - " + source + ", Destination - " + destination);
        }
    }

    // NoticeBoard class - Aggregate relationship with Flight
    class NoticeBoard {
        String flightId;
        String flightName;
        String arrivalTime;
        String departureTime;
        String source;
        String destination;
        String details;
        Flight flight; // Aggregate relationship with Flight

        public NoticeBoard(String flightId, String flightName, String arrivalTime, String departureTime, String source, String destination, String details, Flight flight) {
            this.flightId = flightId;
            this.flightName = flightName;
            this.arrivalTime = arrivalTime;
            this.departureTime = departureTime;
            this.source = source;
            this.destination = destination;
            this.details = details;
            this.flight = flight; // Set associated Flight
        }

        public void flightStatus() {
            System.out.println("Notice: Flight " + flightName + " departing from " + source + " at " + departureTime + ", arriving at " + destination + " by " + arrivalTime);
        }
    }

    // Passenger class - Aggregate relationship with Flight
    class Passenger {
        String passengerId;
        String passengerName;
        int passengerAge;
        String ticketId;
        Luggage luggage; // Composite relationship
        Flight flight; // Aggregate relationship with Flight

        public Passenger(String passengerId, String passengerName, int passengerAge, String ticketId, Luggage luggage, Flight flight) {
            this.passengerId = passengerId;
            this.passengerName = passengerName;
            this.passengerAge = passengerAge;
            this.ticketId = ticketId;
            this.luggage = luggage;
            this.flight = flight; // Set associated Flight
        }

        public void passengerDetails() {
            System.out.println("Passenger " + passengerName + ", Age: " + passengerAge + ", Ticket ID: " + ticketId);
        }

        public void checkIn() {
            System.out.println("Passenger " + passengerName + " has checked in.");
        }
    }

    // Runway class - Aggregation with Flight
    class Runway {
        String runwayNumber;
        Flight flight; // Aggregation relationship
        boolean occupiedStatus;

        public Runway(String runwayNumber, Flight flight, boolean occupiedStatus) {
            this.runwayNumber = runwayNumber;
            this.flight = flight; // Associated Flight
            this.occupiedStatus = occupiedStatus;
        }

        public void isOccupied() {
            String status = occupiedStatus ? "Occupied" : "Free";
            System.out.println("Runway " + runwayNumber + " is currently " + status + " by flight " + (flight != null ? flight.flightName : "None"));
        }
    }

    // Luggage class - Composite relationship with Passenger
    class Luggage {
        String luggageId;
        String passengerId;
        String flightId;
        int noOfLuggages;
        String luggageStatus;

        public Luggage(String luggageId, String passengerId, String flightId, int noOfLuggages, String luggageStatus) {
            this.luggageId = luggageId;
            this.passengerId = passengerId;
            this.flightId = flightId;
            this.noOfLuggages = noOfLuggages;
            this.luggageStatus = luggageStatus;
        }

        public void luggageDetails() {
            System.out.println("Luggage ID: " + luggageId + ", Passenger ID: " + passengerId + ", Flight ID: " + flightId + ", Number of Luggages: " + noOfLuggages);
        }
    }

    // Employee class
    class Employee {
        String employeeId;
        String employeeName;
        double employeeSalary;

        public Employee(String employeeId, String employeeName, double employeeSalary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }

        public void employeeDetails() {
            System.out.println("Employee " + employeeName + " with ID " + employeeId + " has salary " + employeeSalary);
        }
    }

    // AirportEmployees class extends Employee
    class AirportEmployees extends Employee {
        String department;
        Passenger passenger; // Association with Passenger

        public AirportEmployees(String employeeId, String employeeName, double employeeSalary, String department) {
            super(employeeId, employeeName, employeeSalary);
            this.department = department;
        }

        public void airportEmployeeDetails() {
            System.out.println("Airport Employee " + employeeName + ", Department: " + department);
        }
    }

    // AirplaneEmployees class extends Employee
    class AirplaneEmployees extends Employee {
        String designation;
        Passenger passenger; // Association with Passenger

        public AirplaneEmployees(String employeeId, String employeeName, double employeeSalary, String designation) {
            super(employeeId, employeeName, employeeSalary);
            this.designation = designation;
        }

        public void airplaneEmployeeDetails() {
            System.out.println("Airplane Employee " + employeeName + ", Designation: " + designation);
        }
    }

    // Main method to demonstrate the classes
    public static void main(String[] args) {
        task task1 = new task();

        // Create a Flight object
        Flight flight = task1.new Flight("F001", "PIA101", 150, "10:00 AM", "12:00 PM", "Lahore", "Karachi", "20,000 PKR");

        // Create a Luggage object
        Luggage luggage = task1.new Luggage("L001", "P001", "F001", 2, "Checked");

        // Create a Passenger object with associated Flight
        Passenger passenger = task1.new Passenger("P001", "khizar", 30, "T001", luggage, flight);

        // Create a TicketCounter object
        TicketCounter ticketCounter = task1.new TicketCounter("T001", "Lahore", "Karachi", "20,000 PKR", "F001");
        ticketCounter.bookTicket(passenger); // Book ticket with associated Passenger

        // Create a NoticeBoard object with associated Flight
        NoticeBoard noticeBoard = task1.new NoticeBoard("F001", "PIA101", "12:00 PM", "10:00 AM", "Lahore", "Karachi", "On time", flight);

        // Create a Runway object
        Runway runway = task1.new Runway("R001", flight, true);

        // Create an AirportManagement object
        AirportManagement airportManagement = task1.new AirportManagement("Allama Iqbal International Airport", "Lahore", "70 sq km", ticketCounter, flight, noticeBoard);

        // Create an AirportEmployee object
        AirportEmployees airportEmployee = task1.new AirportEmployees("E001", "Ali Khan", 5000, "Security");

        // Create an AirplaneEmployee object
        AirplaneEmployees airplaneEmployee = task1.new AirplaneEmployees("E002", "Imran Ali", 7000, "Pilot");

        // Demonstrating functionalities
        airportManagement.open();
        ticketCounter.ticketDetails();
        noticeBoard.flightStatus();
        runway.isOccupied();
        airportEmployee.airportEmployeeDetails();
        airplaneEmployee.airplaneEmployeeDetails();
        passenger.passengerDetails();
        luggage.luggageDetails();
    }
}
