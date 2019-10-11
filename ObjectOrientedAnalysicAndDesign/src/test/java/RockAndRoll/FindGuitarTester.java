package RockAndRoll;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Setup Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatEricLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatEricLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getGuitarSpec();
                System.out.println("  We have a " +
                    spec.getBuilder() + " " + spec.getModel() + " " +
                    spec.getType() + " guitar:\n    " +
                    spec.getBackWood() + " back and sides,\n    " +
                    spec.getTopWood() + " top.\n  You can have it for only $" +
                    guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitar to the inventory
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
    }
}
