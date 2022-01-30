package exercises.technology;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Program {
    Computer computer;
    Laptop laptop;
    SmartPhone smartPhone;

    @Before
    public void createComputerObject() {
        computer = new Computer(1,"i7-4790k", 50);
    }
    @Before
    public void createLaptopObject() {
        laptop = new Laptop(2,"M1", 5, 18);
    }
    @Before
    public void createSmartPhoneObject() {
        smartPhone = new SmartPhone(3,"A1X", 0.5);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void aComputerCpuEquality() {
        assertTrue(computer.getCpu().contains("i7-4790k"));
    }

    @Test
    public void aComputerIsFixedReturnsTrue() {
        assertTrue(computer.isFixedLocation());
    }

    @Test
    public void aComputerIsNotMobileReturnsFalse() {
        assertFalse(computer.isItMobile());
    }

    @Test
    public void aLaptopHasACpu() {
        assertTrue(laptop.getCpu().contains("M1"));
    }

    @Test
    public void aLaptopIsMobileReturnsTrue() {
        assertTrue(laptop.isItMobile());
    }

    @Test
    public void aLaptopHasBatteryLifeReturnsString() {
        assertTrue(laptop.howLong().contains("This laptop has a battery life of 18.0 hours!"));
    }

    @Test
    public void aSmartPhoneIsMobileReturnsTrue() {
        assertTrue(smartPhone.isItMobile());
    }

    @Test
    public void aSmartPhoneIsNotForMultiTaskingReturnsTrue() {
        assertTrue(smartPhone.isNotForMultiTasking());
    }

    @Test
    public void aSmartPhoneHasWeight() {
        assertEquals(0.5, smartPhone.getWeight(), 0.001);
    }



}
