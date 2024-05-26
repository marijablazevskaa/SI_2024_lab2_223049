import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    @Test
    public void testiranje() {
        Item item;
         //T-T-T
            item = new Item("marija", "011111", 320, 1);
        assertTrue(SILab2.checkCart(Collections.singletonList(item), 120));
        // T-T-F
       item = new Item("marija", "111111", 320, 1);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // T-F-T
        item= new Item("marija", "011111", 320, 0);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // T-F-F
        item = new Item("marija", "111111", 320, 0);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // F-T-T
      item = new Item("marija", "011111", 120, 1);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // F-T-F
       item = new Item("marija", "111111", 120, 1);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // F-F-T
       item= new Item("marija", "011111", 120, 0);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
        // F-F-F
        item = new Item("marija", "111111", 120, 0);
        assertFalse(SILab2.checkCart(Collections.singletonList(item), 120));
    }
}
