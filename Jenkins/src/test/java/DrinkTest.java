import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    @Test
    public void testWaterPrice() {
        assertEquals(1, Drink.getDrinkPrice(Drink.DrinkType.Water));
    }

    @Test
    public void testSodaPrice() {
        assertEquals(2, Drink.getDrinkPrice(Drink.DrinkType.Soda));
    }

    @Test
    public void testJuicePrice() {
        assertEquals(3, Drink.getDrinkPrice(Drink.DrinkType.Juice));
    }

    @Test
    public void testAlcoholPrice() {
        assertEquals(5, Drink.getDrinkPrice(Drink.DrinkType.Alcohol));
    }

    @Test
    public void testUnknownDrinkType() {
        assertThrows(NullPointerException.class, () -> {
            Drink.getDrinkPrice(null);
        });
    }
}
