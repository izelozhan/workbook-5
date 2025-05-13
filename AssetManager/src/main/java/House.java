public class House extends Asset{
    String address;
    int condition; //1, 2, 3, 4 => excellent, good, fair, poor
    int squareFoot;
    int lotSize;

    public House(String dateAcquired, double originalCost, String description, String address, int condition, int lotSize, int squareFoot) {
        super(dateAcquired, originalCost, description); //from Asset
        this.address = address;
        this.condition = condition;
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
    }


    @Override
    public double getValue() {
        double perSqrFtPrice; //plus 25 cents per square foot of lot size
        switch (condition){
            case 1 -> perSqrFtPrice = 180.00;
            case 2 -> perSqrFtPrice = 130.00;
            case 3 -> perSqrFtPrice = 90.00;
            case 4 ->  perSqrFtPrice = 80.00;
            default -> perSqrFtPrice = 0;
        }
        return (squareFoot * perSqrFtPrice) + (lotSize * 0.25);
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
