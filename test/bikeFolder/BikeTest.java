package bikeFolder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void testThatTheBikeOff_AnWhenTheBikeIsOn_TheBikeStayOn(){
        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

    }
    @Test
    public void testThatTheBikeOf_AnWhenTheBikeIsOn_TheBikeStayOn_TestTheBikeCanBeOff(){

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike. turnoff();
        assertEquals(false, bike.isOn());
    }

    @Test
    public void testThatTheBikeIsOff_AnWhenTheBikeIsOn_PutTheBikeToGear1_PuttingTheBikeToGearIncreaseToAccelerationOne() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        assertEquals(0, bike.gear());

        bike.acceleration();
        assertEquals(1, bike.gear());
    }


    @Test
    public void testThatBikeIsOff_AnWhenIsOn_PutTheBikeToAcceleration20_TestThatAcceleration20IsGear1() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());


        for(int count = 1; count <= 20; count++) {
            bike.acceleration();
        }

        assertEquals(21, bike.gear());


    }

    @Test
    public void testThatBikeIsOn_TestThatTheGearAccelerateTo21AndChangeTheGear2_AndTheBikeGear2CanAccelerateTo40() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());


        for(int count = 1; count <= 20; count++) {
            bike.acceleration();
        }
            assertEquals(21,bike.gear());


        for(int count = 21; count <= 25; count++) {
            bike.acceleration();
        }
            assertEquals(31,bike.gear());

    }

    @Test
    public void testThatTheBikeIsOn_TheBikeEnterGear1_TheBikeIncreaseToGear2_TheBikeIncreaseToGear3() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 20; count++) {
            bike.acceleration();
        }
        assertEquals(21,bike.gear());

        for(int count = 21; count <= 25; count++) {
            bike.acceleration();
        }
        assertEquals(31,bike.gear());


       for(int count = 31; count <= 34; count++){
            bike.acceleration();
        }
        assertEquals(43,bike.gear());

    }

    @Test
    public void testThatTheBikeIsOn_TheBikeEnterGear1_TheBikeIncreaseToGear2_TheBikeIncreaseToGear3_TheBikeIncreaseToGear4() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 20; count++) {
            bike.acceleration();
        }
        assertEquals(21,bike.gear());

        for(int count = 21; count <= 25; count++) {
            bike.acceleration();
        }
        assertEquals(31,bike.gear());


        for(int count = 31; count <= 34; count++){
            bike.acceleration();
        }
        assertEquals(43,bike.gear());

        for(int count = 43; count <= 44; count++){
            bike.acceleration();
        }
        assertEquals(51,bike.gear());

    }

    @Test
    public void testThatTheBikeIncreaseToGear1_ThenThatTheBikeDecelerateFromGear1To0() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 15; count++) {
            bike.acceleration();
        }
        assertEquals(16,bike.gear());

        bike.deceleration();
        assertEquals(15 , bike.gear());

    }


    @Test
    public void testThatTheBikeIncreaseToGear1_ThenThatTheBikeDecelerateFromGear1To0_WhenTheGearIsINcreaseTo2DecelerateBY2() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 20; count++) {
            bike.acceleration();
        }
        assertEquals(21,bike.gear());

        bike.deceleration();
        assertEquals(19 , bike.gear());

    }

    @Test
    public void testThatTheBikeIncreaseToGear1_ThenThatTheBikeDecelerateFromGear1To0_WhenTheGearIsINcreaseTo3DecelerateToby3() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 25; count++){
            bike.acceleration();
        }
        assertEquals(31,bike.gear());

        bike.deceleration();
        assertEquals(28 , bike.gear());

    }



    @Test
    public void testThatTheBikeIncreaseToGear1_ThenThatTheBikeDecelerateFromGear1To0_WhenTheGearIsINcreaseTo4DecelerateToby4() {

        Bike bike = new Bike();

        assertEquals(false, bike.isOn());

        bike.turnOn();
        assertEquals(true, bike.isOn());

        bike.acceleration();
        assertEquals(1, bike.gear());

        for(int count = 1; count <= 30; count++){
            bike.acceleration();
        }
        assertEquals(47,bike.gear());

        bike.deceleration();
        assertEquals(47 , bike.gear());

    }
}
