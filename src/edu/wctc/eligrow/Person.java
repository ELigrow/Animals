package edu.wctc.eligrow;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * This class is for Person entities which can interact with other entities.
 * @author Matt Green
 * @version 1.0
 */

/**
 * Person entity which can interact with other entities
 * @author Matt Green
 * @version 1.0
 */
public abstract class Person {
    private String name;

    /**
     * Sets name of entity
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns name of entity
     * @return Name of entity
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}