import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class radio2Test {


        @Test
        public void shouldCurrentRadio() {
            Radio radio = new Radio(8);

            radio.setAnyStation(7);

            int expected = 7;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldMaxVolume(){
            Radio radio =new Radio();

            radio.setAnyVolume(105);

            int expected =0;
            int actual = radio.getCurrentSoundVolume();

            Assertions.assertEquals(expected, actual);
        }


    }
