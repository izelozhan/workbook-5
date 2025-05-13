import java.time.LocalDate;

public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String dateAcquired, double originalCost, String description, String makeModel, int year, int odometer) {
        super(dateAcquired, originalCost, description);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int carAge = currentYear - year;
        double carValue = 0;
        String makeModelLowerCase = makeModel.toLowerCase();

        switch (carAge) {
            case 0, 1, 2 -> carValue = originalCost * (1 - 0.03 * carAge);
            case 4, 5, 6 -> carValue = originalCost * (1 - 0.06 * carAge);
            case 7, 8, 9, 10 -> carValue = originalCost * (1 - 0.08 * carAge);
        }
        if (carAge < 0) {
            throw new RuntimeException("Car age can not be negative");
        }
        if (carAge > 10) {
            carValue = 1000;
        }

        if (odometer > 100000 &&
                !(makeModelLowerCase.contains("Honda".toLowerCase())) &&
                !makeModelLowerCase.contains("Toyota".toLowerCase())) {
            carValue = carValue * (1 - 0.25);
        }
        return carValue;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
