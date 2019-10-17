package DougDogDoor;

import DougDogDoors.Bark;
import DougDogDoors.BarkRecognizer;
import DougDogDoors.DogDoor;
import DougDogDoors.Remote;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking...");
        barkRecognizer.recognize(new Bark("rowlf"));

        System.out.println("\nBruce has gone outside...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException ex) {
        }

        System.out.println("\nBruce's all done...");
        System.out.println("...but he's stuck outside!");

        // Simulate the hardware hearing a bark (not Bruce!)
        Bark smallDogBark = new Bark("yip");
        System.out.println("\nA small dog starts barking...");
        barkRecognizer.recognize(smallDogBark);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException ex) {
        }

        // Simulate the hardware hearing a bark again
        System.out.println("Bruce starts barking.");
        barkRecognizer.recognize(new Bark("rooowlf"));

        System.out.println("\nBruce's back inside...");
    }
}
