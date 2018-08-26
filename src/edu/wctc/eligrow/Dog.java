package edu.wctc.eligrow;

/**
 * This is a Pet entity that implements the Talkable interface.
 * @author Matt Green
 * @version 1.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Non-Person entity that can be friendly and has a name.
     * @param friendly Boolean: Indicates friendliness of entity.
     * @param name String: Name of entity.
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Returns friendliness
     * @return Friendliness
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Generates speech line
     * @return Speech line
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *Returns base attributes about entity
     * @return Base attributes about entity
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}