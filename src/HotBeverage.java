public class HotBeverage implements Product {
    private String name;
    private int volume;
    private int temperature;

    public HotBeverage(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("HotBeverage{name='%s', volume=%dml, temperature=%d°C}", 
                             name, volume, temperature);
    }
}
