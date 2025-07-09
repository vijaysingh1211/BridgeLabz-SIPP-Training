package workshop.vehicalrental;

class truck extends vehicle {
    public truck(String brand, String model, int baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public int calculateRent(int days) {
        // Example: discount for long rentals
        int total = baseRate * days;
        if (days > 5) total *= 0.9; // 10% discount
        return total;
    }
}
