package workshop.vehicalrental;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        vehicle[] vehicles = {
            new bike("Yamaha", "FZ", 300),
            new car("Toyota", "Camry", 1000),
            new truck("Tata", "Xpress", 2000)
        };

        int days = 7;
        for (vehicle v : vehicles) {
            System.out.println(customer.getName() + " rents " + v.getBrand() + " " + v.getModel());
            System.out.println("Total Rent for " + days + " days: ₹" + v.calculateRent(days));
            System.out.println();
        }
    }
}












// Vehicle Rental Application Scenario:
// Build a system for renting bikes, cars, and trucks to customers.

// Concepts Used:
// ● Class: Vehicle, Bike, Car, Truck, Customer (Scenario-based problems)
// ● Constructors: Custom constructors for different vehicle types
// ● Access Modifiers: protected for vehicle attributes to allow subclass access
// ● Interface: Rentable with method calculateRent(int days)
// ● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

// OOP Concepts:
// ○ Abstraction: Rentable abstracts rental behavior
// ○ Inheritance: Car, Bike, Truck inherit from Vehicle
// ○ Polymorphism: Rent calculation differs by vehicle type
// ○ Encapsulation: All fields hidden behind getters/setters