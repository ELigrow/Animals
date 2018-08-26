package edu.wctc.eligrow;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * This is a Pet entity that implements the Talkable interface.
 * @author Matt Green
 * @version 1.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Non-Person entity that has a mice killed score and a name
     * @param mousesKilled Number: Amount of mice killed
     * @param name String: Name of entity
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Returns number of mice killed
     * @return Number of mice killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Adds a mouse to entity's mice killed score
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Generates speech line
     * @return Speech line
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *Returns base attributes about entity
     * @return Base attributes about entity
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

