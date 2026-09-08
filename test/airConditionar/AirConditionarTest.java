package airConditionar;

import airCondictionar.AirConditionar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionarTest {

    @Test
    public void testThatIHaveAnAirConditionar_AnTheAirConditionarIsOff_ThatITurnOnTheAirConditionarOn() {

        AirConditionar airConditionar = new AirConditionar();

        assertEquals(false, airConditionar.isOn());

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

    }

    @Test
    public void testThatIHaveAnAirConditionarItIsOff_ThatIOnTheAirConditionarIsOn_AnIOffTheAirCondictionarIsAnItOff() {

        AirConditionar airConditionar = new AirConditionar();

        assertEquals(false, airConditionar.isOn());

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

        airConditionar.turnOffAc();
        assertEquals(false, airConditionar.isOn());

    }

    @Test
    public void IHaveAnAirCondictonarITurnItOn_ICheckItTemperature_IIncreaseTheTemperatureToOne() {

        AirConditionar airConditionar = new AirConditionar();

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

        assertEquals(16, airConditionar.checkTemperature());

        airConditionar.increase();
        assertEquals(17, airConditionar.checkTemperature());

    }

    @Test
    public void IHaveAnAirConditonarITurnItOn_ICheckItTemperature_IIncreaseTheTemperatureToOne_IDecreaseTheTemperatureByOne() {

        AirConditionar airConditionar = new AirConditionar();

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

        assertEquals(16, airConditionar.checkTemperature());

        airConditionar.increase();
        assertEquals(17, airConditionar.checkTemperature());

        airConditionar.decrease();
        assertEquals(16, airConditionar.checkTemperature());

    }

    @Test
    public void IHaveAnAirConditionalITurnItOn_ICheckItTemperature_IINcreaseTheTemperatureTo30_IIncreaseTheTemperatureByOneButItStill30() {

        AirConditionar airConditionar = new AirConditionar();

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

        assertEquals(16, airConditionar.checkTemperature());

        for(int count = 16; count <30; count++) {
            airConditionar.increase();
        }

        assertEquals(30, airConditionar.checkTemperature());

        airConditionar.increase();
        assertEquals(30, airConditionar.checkTemperature());

    }

    @Test
    public void IHaveAnAirConditionalITurnItOn_ICheckItTemperature_IDecreaseTheTemperatureBy1AndStill16() {

        AirConditionar airConditionar = new AirConditionar();

        airConditionar.turnOnAc();
        assertEquals(true, airConditionar.isOn());

        assertEquals(16, airConditionar.checkTemperature());

        airConditionar.decrease();
        assertEquals(16, airConditionar.checkTemperature());
    }
}