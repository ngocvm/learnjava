package DougDogDoors;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("    BarkRecognizer: Heard a '" + bark.getSound() + "'");

        List allowedBarks = door.getAllowedBarks();
        for (Iterator it =allowedBarks.iterator(); it.hasNext(); ) {
            Bark allowedBark = (Bark)it.next();
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }

        System.out.println("This dog is not allowed.");
    }
}
