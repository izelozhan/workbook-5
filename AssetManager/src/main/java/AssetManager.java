import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("2005", 200000, "Summer house", "Memorial Dr", 2, 4,2220));
        assets.add(new House("1995", 180000, "My house", "Main Dr", 3, 2, 1000));
        assets.add(new Vehicle("2021",10000, "Red truck", "Ford", 2019, 10000 ));
        assets.add(new Vehicle("2015", 9500, "Old SUV", "Chevy Tahoe", 2008, 160000));

        for (Asset a: assets){
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date acquired: " + a.getDateAcquired());
            System.out.println("Original cost: $" + a.getOriginalCost());
            System.out.println("Current Value: $" + a.getValue() + "\n");
        }

        for (Asset a: assets){
            if (a instanceof House){
                System.out.println(a.getDescription() + " address is " + ((House) a).getAddress()); // ask about it
            } else if (a instanceof Vehicle) {
                System.out.println("My vehicle is " + ((Vehicle) a).makeModel);
            }
        }

//        for (Asset a: assets){
//            if (a.getClass() == House.class){
//                System.out.println("My house address is " + ((House) a).getAddress()); // ask about it
//            } else if (a.getClass() == Vehicle.class) {
//                System.out.println("My vehicle is " + ((Vehicle) a).makeModel);
//            }
//        }
    }
}

