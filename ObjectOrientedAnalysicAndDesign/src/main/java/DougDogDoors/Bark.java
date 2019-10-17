package DougDogDoors;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Bark bark) {
        if (bark.getSound().equals(sound))
            return true;
        return false;
    }
}
