public class Radio {
    private int radioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return radioStation;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setAnyStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        radioStation = newCurrentStation;
    }

    public void setAnyVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        soundVolume = newCurrentVolume;
    }

    public void setNextStation() {
        if (radioStation != 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void setPrevStation() {
        if (radioStation != 0) {
            radioStation++;
        } else {
            radioStation = 9;
        }
    }

    public void setIncreaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

}