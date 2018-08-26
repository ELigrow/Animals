package edu.wctc.eligrow;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * This is a single Person entity which implements the Talkable interface.
 * @author Matt Green
 * @version 1.0
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Person entity with name and age.
     * @param age Number: Age of entity
     * @param name String: Name of entity
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Returns age of entity
     * @return Age of entity
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age of entity
     * @param age Number: Age of entity
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Generates speech line
     * @return Speech line
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
