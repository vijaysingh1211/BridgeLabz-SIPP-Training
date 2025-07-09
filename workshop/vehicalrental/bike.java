package workshop.vehicalrental;

// Subclasses
class bike extends vehicle {
    public bike(String brand, String model, int baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public int calculateRent(int days) {
        return baseRate * days;
    }
}