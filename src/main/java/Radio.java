public class Radio {
    private int radioStation;
    private int soundVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 100;
    }

    public Radio(int stations) {
        this.maxStation = stations - 1;
    }

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
        if (newCurrentStation > maxStation) {
            return;
        }
        radioStation = newCurrentStation;
    }

    public void setAnyVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        soundVolume = newCurrentVolume;
    }

    public void setNextStation() {
        if (radioStation != maxStation) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void setPrevStation() {
        if (radioStation != 0) {
            radioStation++;
        } else {
            radioStation = maxStation;
        }
    }

    public void setIncreaseVolume() {
        if (soundVolume < maxVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

}