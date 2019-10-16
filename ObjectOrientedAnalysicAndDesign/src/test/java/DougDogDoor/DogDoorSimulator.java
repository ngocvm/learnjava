package DougDogDoor;

import DougDogDoors.BarkRecognizer;
import DougDogDoors.DogDoor;
import DougDogDoors.Remote;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido starts barking...");
        barkRecognizer.recognize("Woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException ex) {
        }

        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        barkRecognizer.recognize("Woof");

        System.out.println("\nFido's back inside...");
    }
}
