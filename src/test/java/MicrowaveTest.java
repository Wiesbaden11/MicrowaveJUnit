import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MicrowaveTest{

    @Test
    public void testSafeConditions(){
        Microwave microwave = new Microwave("1234");
        microwave.closeDoor();
        assertTrue(microwave.start());
    }

    @Test
    public void testDoorOpen(){
        Microwave microwave = new Microwave("1234");
        microwave.openDoor();
        assertFalse(microwave.start());
    }

    @Test
    public void testChildModeCorrectPin(){
        Microwave microwave = new Microwave("1234");
        microwave.setChildModeOn(true);
        assertTrue(microwave.checkChildPin("1234"));
    }

    @Test
    public void testChildModeWrongPin(){
        Microwave microwave = new Microwave("1234");
        microwave.setChildModeOn(true);
        assertFalse(microwave.checkChildPin("2345"));
    }
}