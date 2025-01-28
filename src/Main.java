public class Main {
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotBeverage tea = new HotBeverage("Tea", 250, 80);
        HotBeverage coffee = new HotBeverage("Coffee", 200, 90);
        HotBeverage cocoa = new HotBeverage("Cocoa", 300, 70);

        // Инициализируем автомат и добавляем напитки
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine();
        vendingMachine.addBeverage(tea);
        vendingMachine.addBeverage(coffee);
        vendingMachine.addBeverage(cocoa);

        // Получение напитков из автомата
        try {
            System.out.println(vendingMachine.getProduct("Tea", 250, 80));
            System.out.println(vendingMachine.getProduct("Coffee", 200, 90));
            System.out.println(vendingMachine.getProduct("Cocoa", 300, 70));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
