public class Drink {
    public enum DrinkType {Water, Soda, Juice, Alcohol};

    public static int getDrinkPrice(DrinkType drinkType) {
        switch(drinkType) {
            case Water:
                return 1;
            case Soda:
                return 2;
            case Juice:
                return 3;
            case Alcohol:
                return 5;
            default:
                throw new IllegalArgumentException("Unknown drink type: " + drinkType);
        }
    }
}
