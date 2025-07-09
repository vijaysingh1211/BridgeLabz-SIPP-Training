package workshop.vehicalrental;

class car extends vehicle {
    public car(String brand, String model, int baseRate) {
        super(brand, model, baseRate);
    }

    @Override
    public int calculateRent(int days) {
        int surcharge = 200;
        return (baseRate * days) + surcharge;
    }
}
