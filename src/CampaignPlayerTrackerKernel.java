import java.util.Map;

import components.standard.Standard;

/**
 * CampaignPlayerTracker kernel component with method definitions of the primary
 * methods in the component.
 *
 * @author Junchen Wu
 */
public interface CampaignPlayerTrackerKernel
        extends Standard<Map<String, Integer>> {

    /**
     * In this component, all characters start with a default amount of 15
     * hitpoints.
     */
    int STARTINGHEALTH = 15;

    /**
     * All characters have a basic attack that does a starting amount of 5
     * damage (without taking into account other items).
     */
    int BASICATTACK = 5;

    /**
     * Increases the current hitpoints of {@code this}.
     *
     * @param healthAmount
     *            the amount of hitpoints to add.
     */
    void increaseCharacterHealth(int healthAmount);

    /**
     * Decreases the current hitpoints of {@code this}.
     *
     * @param healthAmount
     *            the amount of hitpoints to remove.
     */
    void decreaseCharacterHealth(int healthAmount);

    /**
     * Adds the input item, with the given quantity, to the inventory of
     * {@code this}.
     *
     * @param itemName
     *            Name of the item to add.
     * @param quantity
     *            Quantity of the item to add.
     */
    void addtoInventory(String itemName, int quantity);

    /**
     * Removes a specific quantity of the item from the inventory of
     * {@code this}.
     *
     * @param itemName
     *            Name of the item to remove.
     * @param quantity
     *            Quantity of the item to remove.
     */
    void removeFromInventory(String itemName, int quantity);
}
