import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine {
    private List<HotBeverage> beverages;

    public HotBeverageVendingMachine() {
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(HotBeverage beverage) {
        beverages.add(beverage);
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equalsIgnoreCase(name) &&
                beverage.getVolume() == volume &&
                beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        throw new IllegalArgumentException("Product not found: " +
            String.format("%s, %dml, %d°C", name, volume, temperature));
    }
}
