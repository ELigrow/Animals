package edu.wctc.eligrow;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * This class is for non-Person entities that interact with Person entities.
 * @author Matt Green
 * @version 1.0
 */

/**
 * Non-human entity which can interact with other entities
 */
public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Returns name of entity
     * @return name of entity
     */
    public String getName() {
        return name;
    }


}