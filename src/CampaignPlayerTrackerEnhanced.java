/**
 * {@code CampaignPlayerTrackerKernel} enhanced with secondary methods needed to
 * track the progression of a player character in a campaign.
 *
 * @author Junchen Wu
 */
public interface CampaignPlayerTrackerEnhanced
        extends CampaignPlayerTrackerKernel {

    /**
     * Increases the amount of damage that {@code this} can do with a basic
     * attack, like when players equip weapons or other items.
     *
     * @param atkAmount
     *            amount of attack to increase.
     */
    void increasePlayerAttack(int atkAmount);

    /**
     * Decreases the amount of damage that {@code this} can do with a basic
     * attack, like when players receive negative status effects.
     *
     * @param atkAmount
     *            amount of attack to decrease.
     */
    void decreasePlayerAttack(int atkAmount);

    /**
     * Increases the current move speed of {@code this}.
     *
     * @param speedAmount
     *            Amount of speed to increase.
     */
    void increasePlayerSpeed(int speedAmount);

    /**
     * Decreases the current move speed of {@code this}.
     *
     * @param speedAmount
     *            Amount of speed to decrease.
     */
    void decreasePlayerSpeed(int speedAmount);

    /**
     * Handles the increase in player statistics, when {@code this} levels up.
     *
     * @param className
     *            Name of the player's class, which can impact the progression
     *            path.
     */
    void playerLevelUp(String className);
}
